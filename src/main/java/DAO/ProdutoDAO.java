package DAO;

import Factory.ConnectionFactory;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    private final Connection connection;

    public ProdutoDAO() {
        this.connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta para produto!");
    }

    public void cadastrar(Produto produto) {
        String consulta = "INSERT INTO tbProdutos(nomeProduto, valorProduto, qtdeProduto, descricaoProduto) VALUES(?, ?, ?, ?)";

        try ( PreparedStatement stmt = connection.prepareStatement(consulta)) {
            stmt.setString(1, produto.getNomeProduto());
            stmt.setFloat(2, produto.getValorProduto());
            stmt.setInt(3, produto.getQtdeProduto());
            stmt.setString(4, produto.getDescriçaoProduto());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto no BD " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Produto> recuperar() {
        ArrayList<Produto> listaprodutos = new ArrayList<>();

        String consulta = "SELECT * FROM tbProdutos";

        ResultSet rs;

        try ( PreparedStatement stmt = connection.prepareStatement(consulta)) {
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodProduto(rs.getInt("codProduto"));
                produto.setNomeProduto(rs.getString("nomeProduto"));
                produto.setValorProduto(rs.getFloat("valorProduto"));
                produto.setQtdeProduto(rs.getInt("qtdeProduto"));
                produto.setDescriçaoProduto(rs.getString("descricaoProduto"));
                listaprodutos.add(produto);
            }
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar dados do BD " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }

        return (listaprodutos);
    }

    public void atualizar(Produto produto) {
        String consulta = "UPDATE tbProdutos SET nomeProduto = ?, valorProduto = ?, qtdeProduto = ?, descricaoProduto = ? WHERE codProduto = ?";

        try ( PreparedStatement stmt = connection.prepareStatement(consulta)) {
            stmt.setString(1, produto.getNomeProduto());
            stmt.setFloat(2, produto.getValorProduto());
            stmt.setInt(3, produto.getQtdeProduto());
            stmt.setString(4, produto.getDescriçaoProduto());
            stmt.setLong(5, produto.getCodProduto());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados no BD " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }

    public void apagar(Produto produto) {
        String consulta = "DELETE FROM tbProdutos WHERE codProduto = ?";

        try ( PreparedStatement stmt = connection.prepareStatement(consulta)) {
            stmt.setLong(1, produto.getCodProduto());
            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Produto deletado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados no BD " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }
}

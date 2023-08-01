package DAO;

import Factory.ConnectionFactory;
import Model.ProdutoServiço;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoServiçoDAO {

    private final Connection connection;

    public ProdutoServiçoDAO() {
        this.connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta para produtos serviço");
    }

    public void salvar(ProdutoServiço produtoserviço) {
        String consulta = "INSERT INTO tbhistoricoprodutos(codServico, nomeProduto, qtdeProduto, valorProduto, dataUso) VALUES(?, ?, ?, ?, ?)";

        try ( PreparedStatement stmt = connection.prepareStatement(consulta)) {
            stmt.setInt(1, produtoserviço.getCodProduto());
            stmt.setString(2, produtoserviço.getNomeProduto());
            stmt.setInt(3, produtoserviço.getQtde());
            stmt.setFloat(4, produtoserviço.getValorProduto());
            stmt.setString(5, produtoserviço.getDataUso());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no histórico de produtos" + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }

    public ArrayList<ProdutoServiço> recuperar() {
        ArrayList<ProdutoServiço> produtosServiço = new ArrayList();

        String cunsulta = "SELECT * FROM tbhistoricoprodutos";

        ResultSet rs;

        try ( PreparedStatement stmt = connection.prepareStatement(cunsulta)) {
            rs = stmt.executeQuery();

            while (rs.next()) {
                ProdutoServiço produtoServiço = new ProdutoServiço();

                produtoServiço.setCodProduto(rs.getInt("codServico"));
                produtoServiço.setNomeProduto(rs.getString("nomeProduto"));
                produtoServiço.setQtde(rs.getInt("qtdeProduto"));
                produtoServiço.setValorProduto(rs.getFloat("valorProduto"));
                produtoServiço.setDataUso(rs.getString("dataUso"));
                produtosServiço.add(produtoServiço);
            }
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar dados do BD " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }

        return (produtosServiço);
    }

    public void atualizar(ProdutoServiço produtoserviço) {
        String consulta = "UPDATE tbhistoricoprodutos SET qtdeProduto = ?, valorProduto = ?, dataUso = ? WHERE codServiço = ?, nomeProduto = ?";

        try ( PreparedStatement stmt = connection.prepareStatement(consulta)) {
            stmt.setInt(1, produtoserviço.getQtdeProduto());
            stmt.setFloat(2, produtoserviço.getValorProduto());
            stmt.setString(3, produtoserviço.getDataUso());
            stmt.setLong(4, produtoserviço.getCodProduto());
            stmt.setString(5, produtoserviço.getNomeProduto());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados no BD " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }

    public void deletar(int codProdutos) {
        String consulta = "DELETE FROM tbhistoricoprodutos WHERE codServico = ?";

        try ( PreparedStatement stmt = connection.prepareStatement(consulta)) {
            stmt.setLong(1, codProdutos);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar dados do BD " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }

    public void deletarProduto(int codProduto, String nomeProduto) {
        String consulta = "DELETE FROM tbhistoricoprodutos WHERE codServico = ?, nomeProduto = ?";

        try ( PreparedStatement stmt = connection.prepareStatement(consulta)) {
            stmt.setLong(1, codProduto);
            stmt.setString(2, nomeProduto);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar dados do BD " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }
}

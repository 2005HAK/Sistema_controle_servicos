package DAO;

import Factory.ConnectionFactory;
import Model.Cliente;
import Model.ProdutoServiço;
import Model.Serviço;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ServiçoDAO 
{
    private Connection connection;
    
    public ServiçoDAO()
    {
        this.connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta para serviços!");
    }

    public void salvar(Serviço serviço) 
    {
        String consulta = "INSERT INTO tbServicos(codCliente, data, produtosServico, descricao, valorServico, valorTotal) VALUES(?, ?, ?, ?, ?, ?)";
        
        try(PreparedStatement stmt = connection.prepareStatement(consulta))
        {
            stmt.setInt(1, serviço.getCliente().getCodCliente());
            stmt.setString(2, serviço.getData());
            stmt.setInt(3, serviço.getProdutosserviço().get(0).getCodProduto());
            stmt.setString(4, serviço.getDescriçao());
            stmt.setFloat(5, serviço.getValorServiço());
            stmt.setFloat(6, serviço.getValorTotal());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Serviço salvo com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar serviço "+e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList<Serviço> recuperar()
    {
        ArrayList<Serviço> listaserviços = new ArrayList();
        
        String consulta = "SELECT s.codServico, c.codCliente, c.nomeCliente, c.foneCliente, c.cpfCliente,"
                + " s.data, s.produtosServico, s.descricao, s.valorServico, s.valorTotal FROM tbServicos"
                + " AS s INNER JOIN tbClientes AS c ON s.codCliente = c.codCliente";
        
        ResultSet rs = null;
        
        try(PreparedStatement stmt = connection.prepareStatement(consulta))
        {
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Serviço serviço = new Serviço();
                Cliente cliente = new Cliente();
                ProdutoServiço produtoserviço = new ProdutoServiço();
                
                serviço.setCodServiço(rs.getInt("codServico"));
                cliente.setCodCliente(rs.getInt("codCliente"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setFoneCliente(rs.getString("foneCliente"));
                cliente.setCpfCliente(rs.getString("cpfCliente"));
                serviço.setCliente(cliente);
                serviço.setData(rs.getString("data"));
                serviço.setProdutosserviço(produtoserviço.produtosDoServiço(rs.getInt("produtosServico")));
                serviço.setDescriçao(rs.getString("descricao"));
                serviço.setValorServiço(rs.getFloat("valorServico"));
                serviço.setValorTotal(rs.getFloat("valorTotal"));
                listaserviços.add(serviço);
            }
            stmt.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar dados do BD "+e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        } 
        return (listaserviços);
    }
    
    public void atualizar(Serviço serviço)
    {
        String consulta = "UPDATE tbServicos SET codCliente = ?, data = ?, produtosServico = ?, descricao = ?, valorServico = ?, valorTotal = ? WHERE codServico = ?";
        
        try(PreparedStatement stmt = connection.prepareStatement(consulta))
        {
            stmt.setInt(1, serviço.getCliente().getCodCliente());
            stmt.setString(2, serviço.getData());
            stmt.setInt(3, serviço.getProdutosserviço().get(0).getCodProduto());
            stmt.setString(4, serviço.getDescriçao());
            stmt.setFloat(5, serviço.getValorServiço());
            stmt.setFloat(6, serviço.getValorTotal());
            stmt.setLong(7, serviço.getCodServiço());
            stmt.executeUpdate();
            stmt.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados no BD "+e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }
    
    public void deletar(int cod)
    {
        String consulta = "DELETE FROM tbServicos WHERE codServico = ?";
        
        try(PreparedStatement stmt = connection.prepareStatement(consulta))
        {
            stmt.setLong(1, cod);
            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Serviço deletado!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao deletar serviço do BD "+e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }
}

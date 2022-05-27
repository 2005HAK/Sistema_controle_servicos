package DAO;

import Factory.ConnectionFactory;
import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO 
{
    private Connection connection;
    
    public ClienteDAO()
    {
        this.connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta para cliente!");
    }
    
    public void cadastrar(Cliente cliente)
    {
        String consulta = "INSERT INTO tbClientes(nomeCliente, foneCliente, cpfCliente) VALUES(?, ?, ?)";
        
        try(PreparedStatement stmt = connection.prepareStatement(consulta))
        { 
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getFoneCliente());
            stmt.setString(3, cliente.getCpfCliente());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar do BD "+e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }
    
    public ArrayList<Cliente> recuperar()
    {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        String consulta = "SELECT * FROM tbClientes";
        
        ResultSet rs = null;
        
        try(PreparedStatement stmt = connection.prepareStatement(consulta))
        { 
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Cliente cliente = new Cliente();
                
                cliente.setCodCliente(rs.getInt("codCliente"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setFoneCliente(rs.getString("foneCliente"));
                cliente.setCpfCliente(rs.getString("cpfCliente"));
                listaClientes.add(cliente);
            }
            stmt.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar dados no BD "+e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
        
        return (listaClientes);
    }
}

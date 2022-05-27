package DAO;

import Factory.ConnectionFactory;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    private Connection connection;
    
    public UsuarioDAO()
    {
        this.connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta para usuario!");
    }
    
    public void cadastrar(Usuario usuario)
    {
        String consulta = "INSERT INTO tbUsuarios(nomeUsuario, emailUsuario, foneUsuario, senhaUsuario) VALUES(?, ?, ?, ?)";
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(consulta);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getFone());
            stmt.setString(4, usuario.getSenha());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar no BD "+e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }
    
    public ArrayList<Usuario> recuperar()
    {
        ArrayList<Usuario> listausuarios = new ArrayList<>();
        
        String consulta = "SELECT * FROM tbUsuarios";
        
        ResultSet rs = null;
        
        try
        {
            PreparedStatement stmt = connection.prepareStatement(consulta);
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Usuario usuario = new Usuario();
                usuario.setCod(rs.getInt("codUsuario"));
                usuario.setNome(rs.getString("nomeUsuario"));
                usuario.setEmail(rs.getString("emailUsuario"));
                usuario.setFone(rs.getString("foneUsuario"));
                usuario.setSenha(rs.getString("senhaUsuario"));
                listausuarios.add(usuario);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar dados do BD "+e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
        
        return (listausuarios);
    }
}

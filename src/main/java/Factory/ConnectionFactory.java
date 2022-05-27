package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory 
{
    public Connection getConnection()
    {
        String endereço = "jdbc:mysql://localhost:3306/dbestetica";
        String usuario = "root";
        String senha = "";
        
        try
        {
            return DriverManager.getConnection(endereço, usuario, senha);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Erro ao conectar ao SGBD "+e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }
}

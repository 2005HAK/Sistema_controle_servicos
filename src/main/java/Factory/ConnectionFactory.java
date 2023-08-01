package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    private final String endereço = "jdbc:mysql://localhost:3306/dbestetica";
    private final String usuario = "root";
    private final String senha = "";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(endereço, usuario, senha);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao SGBD " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }
}

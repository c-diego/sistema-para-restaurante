package jdbc;

//@author diego

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    private final String database="trabalhoFinal";
    private final String user="root";
    private final String senha="";
    
    public Connection getConexao() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/" +
                    database + "?userSSL=false", user, senha);   
    }    
}
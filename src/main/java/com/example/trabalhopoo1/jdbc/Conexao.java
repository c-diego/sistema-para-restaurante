package com.example.trabalhopoo1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    private final String database="trabalhoFinal";
    private final String user="admin";
    private final String senha="mysql";
    
    public Connection getConexao() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/" +
                    database + "?userSSL=false", user, senha);   
    }    
}
package com.example.trabalhopoo1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

    public Connection getConexao() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:database.sqlite");
    }

    public void createTables() {
        try {

            Statement stmt = getConexao().createStatement();
            String sql = "CREATE TABLE usuario (\n"
                    + "  id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                    + "  nome TEXT NOT NULL,\n"
                    + "  login TEXT UNIQUE NOT NULL,\n"
                    + "  senha TEXT NOT NULL,\n"
                    + "  permissao INTEGER NOT NULL\n"
                    + ");\n"
                    + "\n"
                    + "CREATE TABLE prato (\n"
                    + "  id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                    + "  principal TEXT,\n"
                    + "  secundario TEXT,\n"
                    + "  carne TEXT,\n"
                    + "  salada TEXT,\n"
                    + "  acompanhamento TEXT,\n"
                    + "  preco REAL NOT NULL,\n"
                    + "  status INTEGER NOT NULL\n"
                    + ");\n"
                    + "\n"
                    + "CREATE TABLE cliente (\n"
                    + "  id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                    + "  nome TEXT NOT NULL,\n"
                    + "  sobrenome TEXT NOT NULL,\n"
                    + "  telefone TEXT NOT NULL,\n"
                    + "  estado TEXT NOT NULL,\n"
                    + "  cidade TEXT NOT NULL,\n"
                    + "  bairro TEXT NOT NULL,\n"
                    + "  rua TEXT NOT NULL,\n"
                    + "  numero INTEGER NOT NULL,\n"
                    + "  qtnPedidos INTEGER\n"
                    + ");\n"
                    + "\n"
                    + "CREATE TABLE pedido (\n"
                    + "  fk_prato INTEGER NOT NULL,\n"
                    + "  fk_cliente INTEGER NOT NULL,\n"
                    + "  quantidade INTEGER NOT NULL,\n"
                    + "  preco REAL NOT NULL,\n"
                    + "  numero INTEGER NOT NULL,\n"
                    + "  PRIMARY KEY (fk_prato, fk_cliente, numero),\n"
                    + "  FOREIGN KEY (fk_prato) \n"
                    + "    REFERENCES prato (id) \n"
                    + "      ON DELETE CASCADE \n"
                    + "      ON UPDATE CASCADE,\n"
                    + "  FOREIGN KEY (fk_cliente) \n"
                    + "    REFERENCES cliente (id) \n"
                    + "      ON DELETE CASCADE \n"
                    + "      ON UPDATE CASCADE\n"
                    + ");";

            stmt.executeUpdate(sql);

            PreparedStatement ps = getConexao().prepareStatement(
                    "INSERT INTO usuario VALUES (?,?, ?, ?, ?);"
            );
            ps.setNull(1, 0);
            ps.setString(2, "ADM");
            ps.setString(3, "admin");
            ps.setString(4, "admin");
            ps.setInt(5, 2);
            ps.execute();

        } catch (SQLException ex) {
            System.err.print(ex);
        }
    }
}
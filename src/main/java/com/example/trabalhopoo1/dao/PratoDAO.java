package com.example.trabalhopoo1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.example.trabalhopoo1.jdbc.Conexao;
import com.example.trabalhopoo1.modelo.Prato;

public class PratoDAO {
    
     public void adicionar(Prato prato) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO prato(principal, secundario, carne, salada,"
                + " acompanhamento, preco, status)value(?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, prato.getPrincipal());
        ps.setString(2, prato.getSecundario());
        ps.setString(3, prato.getCarne());
        ps.setString(4, prato.getSalada());
        ps.setString(5, prato.getAcompanhamento());
        ps.setFloat(6, prato.getPreco());
        ps.setBoolean(7, prato.getStatus());
        ps.execute();
        ps.close();
        conexao.close();
    }
    
    public List<Prato>buscar(String termo) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM prato WHERE principal like ? OR secundario like ?"
                + " OR carne like ? OR salada like ? OR acompanhamento like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1,"%"+ termo + "%");
        ps.setString(2,"%"+ termo + "%");
        ps.setString(3,"%"+ termo + "%");
        ps.setString(4,"%"+ termo + "%");
        ps.setString(5,"%"+ termo + "%");
        ResultSet rs = ps.executeQuery();
        List<Prato> pratos = new ArrayList<>();
        while(rs.next()) {
            pratos.add(new Prato(rs.getInt("id"),rs.getString("principal"), rs.getString("secundario"),
                    rs.getString("carne"), rs.getString("salada"), rs.getString("acompanhamento"),
                    rs.getFloat("preco"), rs.getBoolean("status")));
        }
        ps.execute();
        rs.close();
        ps.close(); 
        conexao.close();
        return pratos;
    }
    
//    public void remover(int id) throws SQLException {
//        Connection conexao = new Conexao().getConexao();
//        String sql = "DELETE FROM prato WHERE id=?";
//        PreparedStatement ps = conexao.prepareStatement(sql);
//        ps.setInt(1, id);
//        ps.executeUpdate();
//        ps.close();
//        conexao.close();
//    }
    
    public void desabilitarPrato(boolean status, int id) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql="UPDATE prato SET status=? where id=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setBoolean(1, status);
        ps.setInt(2, id);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    
    public void alterar(Prato prato) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql="UPDATE prato SET principal=?,secundario=?,carne=?, salada=?" +
                ", acompanhamento=?, preco=? where id=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, prato.getPrincipal());
        ps.setString(2, prato.getSecundario());
        ps.setString(3, prato.getCarne());
        ps.setString(4, prato.getSalada());
        ps.setString(5, prato.getAcompanhamento());
        ps.setFloat(6, prato.getPreco());
        ps.setInt(7, prato.getId());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }

    public Prato buscarPorId(int id) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM prato WHERE id = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Prato prato = null;
        if (rs.next()) {
            prato = new Prato(
                    rs.getInt("id"),
                    rs.getString("principal"),
                    rs.getString("secundario"),
                    rs.getString("carne"),
                    rs.getString("salada"),
                    rs.getString("acompanhamento"),
                    rs.getFloat("preco"),
                    rs.getBoolean("status")
            );
        }
        ps.execute();
        rs.close();
        ps.close();
        conexao.close();
        return prato;
    }
    
}

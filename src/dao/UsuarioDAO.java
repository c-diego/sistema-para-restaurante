package dao;

//@author diego

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.Conexao;
import modelo.Usuario;

public class UsuarioDAO {
    
    public Usuario login(String login, String senha) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM usuario where login=? and senha=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, login);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
    
        Usuario usuario = null;    
        while(rs.next()) {
            usuario = new Usuario();
            usuario.setId(rs.getInt("id"));
            usuario.setNome(rs.getString("nome"));
            usuario.setLogin(rs.getString("login"));
            usuario.setPermissao(rs.getInt("permissao"));
        }
        
        rs.close();
        ps.close();
        conexao.close();
        return usuario;
    }
    
}

package dao;

//@author diego

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
public void adicionar(Usuario usuario) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO usuario(nome, login, senha, permissao) value(?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getLogin());
        ps.setString(3, usuario.getSenha());
        ps.setInt(4, usuario.getPermissao());
        ps.execute();
        ps.close();
        conexao.close();
    }
    
    public List<Usuario>buscarPeloNome(String nome) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM usuario WHERE nome like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1,"%"+ nome + "%");
        ResultSet rs = ps.executeQuery();
        List<Usuario> usuarios = new ArrayList<>();
        while(rs.next()) {
            usuarios.add(new Usuario(rs.getString("nome"), rs.getString("login"), rs.getInt("permissao")));
        }
        ps.execute();
        rs.close();
        ps.close(); 
        conexao.close();
        return usuarios;
    }
    
    public void remover(int id) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "DELETE FROM usuario WHERE id=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    
    public void alterar(Usuario usuario) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql="UPDATE usuario SET nome=?,login=?,senha=?, permissao=? where id=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getLogin());
        ps.setString(3, usuario.getSenha());
        ps.setInt(4, usuario.getPermissao());
        ps.setInt(5, usuario.getId());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    
}

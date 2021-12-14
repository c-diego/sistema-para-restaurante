package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.Conexao;
import modelo.Prato;

public class PratoDAO {
    
     public void adicionar(Prato prato) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO prato(principal, secundario, carne, salada,"
                + " acompanhamento, preco)value(?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, prato.getPrincipal());
        ps.setString(2, prato.getSecundario());
        ps.setString(3, prato.getCarne());
        ps.setString(4, prato.getSalada());
        ps.setString(5, prato.getAcompanhamento());
        ps.setFloat(6, prato.getPreco());
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
        ps.setString(1,"%"+ termo + "%");
        ps.setString(1,"%"+ termo + "%");
        ps.setString(1,"%"+ termo + "%");
        ResultSet rs = ps.executeQuery();
        List<Cliente> clientes = new ArrayList<>();
        while(rs.next()) {
            clientes.add(new Cliente(rs.getString("nome"), rs.getString("sobrenome"),
                    rs.getString("telefone"), rs.getString("estado"), rs.getString("cidade"),
            rs.getString("bairro"), rs.getString("rua"), rs.getInt("numero"), rs.getInt("qtnPedidos")));
        }
        ps.execute();
        rs.close();
        ps.close(); 
        conexao.close();
        return clientes;
    }
    
    public void remover(int id) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "DELETE FROM cliente WHERE id=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    
    public void alterar(Cliente cliente) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql="UPDATE cliente SET nome=?,sobrenome=?,estado=?, cidade=?" +
                ", bairro=?, rua=?, numero=? where id=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getSobrenome());
        ps.setString(3, cliente.getEstado());
        ps.setString(4, cliente.getCidade());
        ps.setString(5, cliente.getBairro());
        ps.setString(6, cliente.getRua());
        ps.setInt(7, cliente.getNumero());
        ps.setInt(8, cliente.getId());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
}

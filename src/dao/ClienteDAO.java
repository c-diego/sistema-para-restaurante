package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.Conexao;
import modelo.Cliente;

public class ClienteDAO {
      public void adicionar(Cliente cliente) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO cliente(nome, sobrenome, telefone, estado,"
                + " cidade, bairro, rua, numero, qtnPedidos)value(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getSobrenome());
        ps.setString(3, cliente.getTelefone());
        ps.setString(4, cliente.getEstado());
        ps.setString(5, cliente.getCidade());
        ps.setString(6, cliente.getBairro());
        ps.setString(7, cliente.getRua());
        ps.setInt(8, cliente.getNumero());
        ps.setInt(9, 0);
        ps.execute();
        ps.close();
        conexao.close();
    }
    
    public List<Cliente>buscarPeloNome(String nome) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM cliente WHERE nome like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1,"%"+ nome + "%");
        ResultSet rs = ps.executeQuery();
        List<Cliente> clientes = new ArrayList<>();
        while(rs.next()) {
            clientes.add(new Cliente(rs.getInt("id"), rs.getString("nome"), rs.getString("sobrenome"),
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
        String sql="UPDATE cliente SET nome=?,sobrenome=?, telefone=?, estado=?, cidade=?" +
                ", bairro=?, rua=?, numero=?, qtnPedidos=? where id=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getSobrenome());
        ps.setString(3, cliente.getTelefone());
        ps.setString(4, cliente.getEstado());
        ps.setString(5, cliente.getCidade());
        ps.setString(6, cliente.getBairro());
        ps.setString(7, cliente.getRua());
        ps.setInt(8, cliente.getNumero());
        ps.setInt(9, cliente.getQtnPedidos());
        ps.setInt(10, cliente.getId());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
}

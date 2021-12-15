
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.Conexao;
import modelo.Pedido;

public class PedidoDAO {
    public void adicionar(Pedido pedido) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO pedido(fk_prato, fk_cliente, quantidade, preco,"
                + " numero)value(?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, pedido.getFk_prato());
        ps.setInt(2, pedido.getFk_cliente());
        ps.setInt(3, pedido.getQuantidade());
        ps.setFloat(4, pedido.getPreco());
        ps.setInt(5, pedido.getNumero());
        ps.execute();
        ps.close();
        conexao.close();
    }
    
    public List<Pedido>buscar(int numero, int cliente_id) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM pedido WHERE fk_cliente = ? AND numero = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1,cliente_id);
        ps.setInt(2,numero);
        ResultSet rs = ps.executeQuery();
        List<Pedido> pedidos = new ArrayList<>();
        while(rs.next()) {
            pedidos.add(new Pedido(rs.getInt("fk_prato"), rs.getInt("fk_cliente"),
                    rs.getInt("quantidade"), rs.getFloat("preco"), rs.getInt("numero")));
        }
        ps.execute();
        rs.close();
        ps.close(); 
        conexao.close();
        return pedidos;
    }
    
    public void remover(Pedido pedido) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "DELETE FROM pedido WHERE fk_prato = ? AND fk_cliente = ? AND numero = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, pedido.getFk_prato());
        ps.setInt(2, pedido.getFk_cliente());
        ps.setInt(3, pedido.getNumero());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    
    public void alterar(Pedido pedido) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql="UPDATE pedido SET quantidade=?, preco=? where fk_prato =? AND"
                + " fk_cliente = ? AND numero = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, pedido.getQuantidade());
        ps.setFloat(2, pedido.getPreco());
        ps.setInt(3, pedido.getFk_prato());
        ps.setInt(4, pedido.getFk_cliente());
        ps.setInt(5, pedido.getNumero());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }    
}

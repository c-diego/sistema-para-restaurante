
package modelo;

public class Pedido {
    private int fk_prato;
    private int fk_cliente;
    private int quantidade;
    private float preco;
    private int numero;

    public Pedido(int fk_prato, int fk_cliente, int quantidade, float preco, int numero) {
        this.fk_prato = fk_prato;
        this.fk_cliente = fk_cliente;
        this.quantidade = quantidade;
        this.preco = preco;
        this.numero = numero;
    }

    public Pedido(int fk_cliente, int quantidade, float preco, int numero) {
        this.fk_cliente = fk_cliente;
        this.quantidade = quantidade;
        this.preco = preco;
        this.numero = numero;
    }

    public Pedido() {
    }

    public void setFk_prato(int fk_prato) { this.fk_prato = fk_prato; }

    public void setFk_cliente(int fk_cliente) { this.fk_cliente = fk_cliente; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public void setPreco(float preco) { this.preco = preco; }

    public void setNumero(int numero) { this.numero = numero; }

    public int getFk_prato() { return fk_prato; }
    
    public int getFk_cliente() { return fk_cliente; }

    public int getQuantidade() { return quantidade; }

    public float getPreco() { return preco; }

    public int getNumero() { return numero; }
    
}

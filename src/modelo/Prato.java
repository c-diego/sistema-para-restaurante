package modelo;
 
public class Prato {
    private int id;
    private String principal;
    private String secundario;
    private String carne;
    private String salada;
    private String acompanhamento;
    private float preco;

    public Prato(int id, String principal, String secundario, String carne, String salada, String acompanhamento, float preco) {
        this.id = id;
        this.principal = principal;
        this.secundario = secundario;
        this.carne = carne;
        this.salada = salada;
        this.acompanhamento = acompanhamento;
        this.preco = preco;
    }

    public Prato(String principal, String secundario, String carne, String salada, String acompanhamento, float preco) {
        this.principal = principal;
        this.secundario = secundario;
        this.carne = carne;
        this.salada = salada;
        this.acompanhamento = acompanhamento;
        this.preco = preco;
    }

    public Prato() {
    }

    //setters
    public void setId(int id) { this.id = id; }

    public void setPrincipal(String principal) { this.principal = principal; }

    public void setSecundario(String secundario) { this.secundario = secundario; }

    public void setCarne(String carne) { this.carne = carne; }

    public void setSalada(String salada) { this.salada = salada; }

    public void setAcompanhamento(String acompanhamento) { this.acompanhamento = acompanhamento; }

    public void setPreco(float preco) { this.preco = preco; }

    public int getId() { return id; }

    public String getPrincipal() { return principal; }

    public String getSecundario() { return secundario; }

    public String getCarne() { return carne; }

    public String getSalada() { return salada; }

    public String getAcompanhamento() { return acompanhamento; }

    public float getPreco() { return preco; }
    
}

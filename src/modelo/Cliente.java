package modelo;

public class Cliente {
    private int id;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private int qtnPedidos;

    public Cliente(int id, String nome, String sobrenome, String telefone, String estado, String cidade, String bairro, String rua, int numero, int qtnPedidos) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.qtnPedidos = qtnPedidos;
    }
    
    public Cliente(String nome, String sobrenome, String telefone, String estado, String cidade, String bairro, String rua, int numero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public Cliente(String nome, String sobrenome, String telefone, String estado, String cidade, String bairro, String rua, int numero, int qtnPedidos) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.qtnPedidos = qtnPedidos;
    }

    public Cliente() {
    }
    

    //setters
    public void setId(int id) { this.id = id; }

    public void setNome(String nome) { this.nome = nome; }

    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    public void setEstado(String estado) { this.estado = estado; }

    public void setCidade(String cidade) { this.cidade = cidade; }

    public void setBairro(String bairro) { this.bairro = bairro; }

    public void setRua(String rua) { this.rua = rua; }

    public void setNumero(int numero) { this.numero = numero; }

    public void setQtnPedidos(int qtnPedidos) { this.qtnPedidos = qtnPedidos; }

    //getters
    public int getId() { return id; }

    public String getNome() { return nome; }

    public String getSobrenome() { return sobrenome; }

    public String getTelefone() { return telefone; }

    public String getEstado() { return estado; }

    public String getCidade() { return cidade; }

    public String getBairro() { return bairro; }

    public String getRua() { return rua; }

    public int getNumero() { return numero; }
 
    public int getQtnPedidos() { return qtnPedidos; }    
    
    
}
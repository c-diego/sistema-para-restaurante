package com.example.trabalhopoo1.modelo;
 
public class Prato {
    private int id;
    private String principal;
    private String secundario;
    private String carne;
    private String salada;
    private String acompanhamento;
    private float preco;
    private boolean status;

    public Prato(int id, String principal, String secundario, String carne, String salada, String acompanhamento, float preco, boolean status) {
        this.id = id;
        this.principal = principal;
        this.secundario = secundario;
        this.carne = carne;
        this.salada = salada;
        this.acompanhamento = acompanhamento;
        this.preco = preco;
        this.status = status;
    }

    public Prato(String principal, String secundario, String carne, String salada, String acompanhamento, float preco, boolean status) {
        this.principal = principal;
        this.secundario = secundario;
        this.carne = carne;
        this.salada = salada;
        this.acompanhamento = acompanhamento;
        this.preco = preco;
        this.status = status;
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
    
    public void setStatus(boolean status) { this.status = status; }

    public int getId() { return id; }

    public String getPrincipal() { return principal; }

    public String getSecundario() { return secundario; }

    public String getCarne() { return carne; }

    public String getSalada() { return salada; }

    public String getAcompanhamento() { return acompanhamento; }

    public float getPreco() { return preco; }
    
    public boolean getStatus() { return status; }
    
}

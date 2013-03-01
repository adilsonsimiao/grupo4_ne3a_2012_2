/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.entity;


/**
 *
 * @author adilson
 */
public class Endereco {   
    
    private int id;
    private String logradouro;
    private String complemento;
    private int numero;
    private String bairro;
    private String cidade; 
    private String uf;
    private String cep; 
    private int cliente_id;
    
    private Cliente cliente;

    public Endereco() {
    }

    public Endereco(String logradouro, String complemento, int numero, String bairro, String cidade, String uf, String cep, int cliente_id, Cliente cliente) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.cliente_id = cliente_id;
        this.cliente = cliente;
    }

    public Endereco(String logradouro, String complemento, int numero, String bairro, String cidade, String uf, String cep, Cliente cliente) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.cliente = cliente;
    }

    
   

   
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Cliente [logradouro")
        .append(logradouro)
        .append(", complemento")
        .append(complemento)
        .append(", numero")
        .append(numero)
        .append(", bairro")
        .append(bairro)
        .append(", cidade")
        .append(cidade)
        .append(", uf")
        .append(uf)
        .append(", cep")
        .append(cep)               
        .append("]");      
                
        
        return build.toString();
                }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }
    
}

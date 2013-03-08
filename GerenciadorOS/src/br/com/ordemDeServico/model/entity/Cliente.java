/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.entity;



/**
 *
 * @author adilson
 */
public class Cliente {  
      
    private int id;
    private String cpf;
    private String nome;
    private String telefone;
    private String rg;

    
   
    

    public Cliente(String cpf, String nome, String telefone, String rg, int id ) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.rg=rg;
        this.id=id;
        
    }

     public Cliente() {
         
     }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        build.append("Cliente [id")
        .append(id)
        .append(", nome")
        .append(nome)        
        .append(", cpf")
        .append(cpf)
        .append(", telefone")
        .append(telefone)
        .append("]");
        return build.toString();
    }    
}

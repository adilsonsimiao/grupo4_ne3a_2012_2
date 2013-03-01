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
   
   
    

    public Cliente(String cpf, String nome, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        
    }

     public Cliente() {
         
     }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
        build.append("Cliente [cpf")
        .append(cpf)
        .append(", nome")
        .append(nome)
        .append(", telefone")
        .append(telefone)
        .append("]");
        return build.toString();
    }    
}

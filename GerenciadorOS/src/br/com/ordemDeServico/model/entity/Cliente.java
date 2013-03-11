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

    
   
    

    public Cliente(int id ,String nome, String cpf, String rg, String telefone  ) {
        this.id=id; 
        this.nome = nome;
        this.cpf = cpf;
        this.rg=rg;
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
        return "Cliente{" + "id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", rg=" + rg + '}';
    }
    
  
}

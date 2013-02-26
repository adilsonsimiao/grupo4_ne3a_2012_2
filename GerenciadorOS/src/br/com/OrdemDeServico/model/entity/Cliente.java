/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.OrdemDeServico.model.entity;

import java.util.Objects;

/**
 *
 * @author adilson
 */
public class Cliente {
    
    
      
    private int id;

    public Cliente(int id, String cpf, String nome, String telefone) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }
    private String cpf;
    private String nome;
    private Endereco endereco;    
    private Contato contato;
    private String telefone;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.cpf);
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.endereco);
        hash = 41 * hash + Objects.hashCode(this.contato);
        hash = 41 * hash + Objects.hashCode(this.telefone);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.contato, other.contato)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        return true;
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

   

    

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    
   
    
   

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String rg) {
        this.telefone=rg;
        this.nome = nome;
        this.cpf = cpf;
            }
    
    
    

    public String getRg() {
        return telefone;
    }

    public void setRg(String rg) {
        this.telefone = rg;
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
        build.append("Cliente [rg")
        .append(telefone)
        .append(", nome")
        .append(nome)
        .append(", cpf")
        .append(cpf)
        .append(", endereco")
        .append(endereco)
        .append(", contato")
        .append(contato)
        .append("]");
        
                
                
                
        
        return build.toString();
                }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.entity;

import java.util.Objects;

/**
 *
 * @author adilson
 */
public class Contato {
    private long id ;
    private long celular;
    private String email;

    public Contato() {
    }

    public Contato(long id, long celular, String email, long telefone) {
        this.id = id;
        this.celular = celular;
        this.email = email;
        this.telefone = telefone;
    }

   
    
    
    private long telefone;

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Contato [email")
        .append(email)
        .append(", telefone")
        .append(telefone)
        .append(", celular")
        .append(celular)
        .append("]");     
        return build.toString();
                }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

 
    
}

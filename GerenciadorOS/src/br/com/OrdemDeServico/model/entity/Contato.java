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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 61 * hash + (int) (this.celular ^ (this.celular >>> 32));
        hash = 61 * hash + Objects.hashCode(this.email);
        hash = 61 * hash + (int) (this.telefone ^ (this.telefone >>> 32));
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
        final Contato other = (Contato) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.celular != other.celular) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (this.telefone != other.telefone) {
            return false;
        }
        return true;
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

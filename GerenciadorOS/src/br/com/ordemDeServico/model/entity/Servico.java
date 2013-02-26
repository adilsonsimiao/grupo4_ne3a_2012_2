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
public class Servico {

    public Servico() {
    }

    public Servico(long id, String descriçao, String nome, long valor) {
        this.id = id;
        this.descriçao = descriçao;
        this.nome = nome;
        this.valor = valor;
    }
    
    
    
    	private long id;
        private String descriçao;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 61 * hash + Objects.hashCode(this.descriçao);
        hash = 61 * hash + Objects.hashCode(this.nome);
        hash = 61 * hash + (int) (this.valor ^ (this.valor >>> 32));
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
        final Servico other = (Servico) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.descriçao, other.descriçao)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (this.valor != other.valor) {
            return false;
        }
        return true;
    }
        private String nome; 
        private long valor; 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }
    
       @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Cliente [id")
        .append(id)
        .append(", descricao")
        .append(descriçao)
        .append(", nome")
        .append(nome)
        .append(", valor")
        .append(valor)
        .append("]");           
        
        return build.toString();
                }
    
    
}

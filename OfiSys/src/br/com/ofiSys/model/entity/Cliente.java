/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ofiSys.model.entity;

import br.com.ofiSys.annotations.ClassProperty;
import br.com.ofiSys.annotations.Colors;
import br.com.ofiSys.annotations.MethodProperty;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author fernando
 */
@Entity
@Table(name = "Cliente")
@ClassProperty(label="Cliente" , width=500, height=200)
public class Cliente implements Serializable{
       
    private long id;
    private String nome;
    
    private final String ID = "id";
    private final String NOME = "nome";
    
    public Cliente(){        
    }
//------------------------------------------------------------------------------
    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false, unique = true)
    @MethodProperty(label="Id", groupName="Geral")
    public long getId() {
        return id;
    }

    @MethodProperty(label="Nome", groupName="Geral")
    @Column(name = "Nome", nullable = false)
    public String getNome() {
        return nome;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //--------------------------------------------------------------------------
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.ID);
        hash = 29 * hash + Objects.hashCode(this.NOME);
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
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + '}';
    }
    
}

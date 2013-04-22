/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ofiSys.model.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author fernando
 */
@Entity
@Table(name = "Servico")
public class Servico implements Serializable{
    
    private long id;
    private String descricaoServico;
    private double valor;
    
    static final String ID = "id";
    static final String DESCRICAO_SERVICO = "descricaoServico";
    static final String VALOR = "valor";

    public Servico() {
    }

    //------------------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long getId() {
        return id;
    }
    
    @Column(name = "descricaoServico", length = 255, nullable = false)
    public String getDescricaoServico() {
        return descricaoServico;
    }

    @Column(name = "valor", nullable = false, precision = 2)
    public double getValor() {
        return valor;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }    

    //------------------------------------------------------------------------------
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 29 * hash + Objects.hashCode(this.descricaoServico);
        hash = (int) (29 * hash + this.valor);
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
        if (!Objects.equals(this.descricaoServico, other.descricaoServico)) {
            return false;
        }
        if (this.valor != other.valor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Servico{" + "id=" + id + ", descricaoServico=" + descricaoServico 
                + ", valor=" + valor + '}';
    }
//------------------------------------------------------------------------------
}

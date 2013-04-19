/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Adilsoon
 */    

@Entity
public class Telefone implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)       
    private int id;

  
    
    private String ddd;
    private String telefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
       this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
      @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", ddd=" + ddd + ", telefone=" + telefone + '}';
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Adilsoon
 */    

@Entity

@Table(name = "TELEFONES")
public class Telefone implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)       
    @Column(name = "ID", nullable = false)
    private int id;

  
     @Column(name = "DDD", length = 50)
    private String ddd;
      
    @Column(name = "NUMERO", length=50)
    private String numero;

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
        return numero;
    }

    public void setTelefone(String numero) {
        this.numero = numero;
    }
    
    
   

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", ddd=" + ddd + ", numero=" + numero + '}';
    }

   
    
}

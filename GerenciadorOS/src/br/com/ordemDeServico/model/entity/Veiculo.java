/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author adilson
 */
@Entity
@Table(name = "VEICULO")
public class Veiculo implements Serializable {

    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false) 
    private int id;

     @Column(name = "Marca", length=50)    
    private String marca;
   
     @Column(name = "MODELO", length = 50)
    private String modelo; 
    
     @Column(name = "Ano", length=59)
    private String ano;
      @Column(name = "PLACA", length=50)
    private String placa;
  

    public Veiculo() {
    }

   
   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 47 * hash + Objects.hashCode(this.marca);
        hash = 47 * hash + Objects.hashCode(this.modelo);
        hash = 47 * hash + Objects.hashCode(this.ano);
        hash = 47 * hash + Objects.hashCode(this.placa);
        
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
        final Veiculo other = (Veiculo) obj;
        
        if (this.id != other.id) {
            return false;
        }
          
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        
        if (this.ano != other.ano) {
            return false;
        }
        
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
       
        return true;
    }
   
    public int  getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String Ano) {
        this.ano = Ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String Placa) {
        this.placa = Placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + '}';
    }


    
   
}

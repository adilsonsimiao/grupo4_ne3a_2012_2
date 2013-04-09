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
 * @author Fernando
 */

@Entity
@Table(name = "Veiculo")
public class Veiculo implements Serializable{
    
    private long id;
    //private long proprietarioID;
    private String marca;
    private String modelo; 
    private int ano;
    private String placa;

    static final String ID = "id";
    static final String MARCA = "marca";
    static final String MODELO = "modelo";
    static final String ANO = "ano";
    static final String PLACA = "placa";
    
    public Veiculo() {
    }

    public Veiculo(long id, String marca, String modelo, int ano, String placa) {
        this.id = id;
        //this.proprietarioID = proprietarioID;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;   
    }    
//------------------------------------------------------------------------------   
   
    @Id  
    @GeneratedValue  
    @Column(name="PESSOA_ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    
    /*
    @Column(name = "ProprietarioID")
    public long getProprietarioID(){
        return proprietarioID;
    }
    
    public void setProprietarioID(long proprietarioID){
        this.proprietarioID = proprietarioID;
    }
    */
    
    
    @Column(name = "Marca")
    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    
    @Column(name = "Modelo")
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    
    @Column(name = "Ano")
    public int getAno() {
        return ano;
    }

    public void setAno(int Ano) {
        this.ano = Ano;
    }

    
    @Column(name = "Placa")
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String Placa) {
        this.placa = Placa;
    }
//------------------------------------------------------------------------------    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (this.id ^ (this.id >>> 32));
        //hash = 47 * hash + (int) (this.proprietarioID ^ (this.proprietarioID >>> 32));
        hash = 47 * hash + Objects.hashCode(this.marca);
        hash = 47 * hash + Objects.hashCode(this.modelo);
        hash = 47 * hash + (int) (this.ano ^ (this.ano >>> 32));
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
        
        /*
        if (this.proprietarioID != other.proprietarioID){
            return false;
        }
        */ 
        
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
    
    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("veiculo id: ")
        .append(id)
        .append(", proprietario id: ")
        //.append(proprietarioID)        
        .append(", marca: ")
        .append(marca)
        .append(", modelo: ")
        .append(modelo)
        .append(", ano: ")
        .append(ano)
        .append(", placa: ")
        .append(placa)        
        .append("]");
        
        return build.toString();
    }
//------------------------------------------------------------------------------   
}
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
    private int km;

    static final String ID = "id";
    static final String MARCA = "marca";
    static final String MODELO = "modelo";
    static final String ANO = "ano";
    static final String PLACA = "placa";
    static final String KM = "Km";
    
    public Veiculo() {
    }

    public Veiculo(long id, String marca, String modelo, int ano, String placa, int Km) {
        this.id = id;
        //this.proprietarioID = proprietarioID;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;  
        this.km = km;
    }    
//------------------------------------------------------------------------------   
   
    @Id  
    @GeneratedValue  
    @Column(name="id")
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
    
    
    @Column(name = "marca")
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    @Column(name = "modelo")
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    @Column(name = "ano")
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    @Column(name = "placa")
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    @Column(name = "km")
    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
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
        hash = 47 * hash + (int) (this.km ^(this.km >>> 32));
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
        
        if (!Objects.equals(this.km, other.km)){
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
        .append(", Km: ")
        .append(km)
        .append("]");
        
        return build.toString();
    }
//------------------------------------------------------------------------------   
}
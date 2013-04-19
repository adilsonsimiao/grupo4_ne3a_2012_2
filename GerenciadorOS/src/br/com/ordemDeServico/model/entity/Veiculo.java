/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.entity;

import java.util.Objects;
import javax.xml.crypto.Data;

/**
 *
 * @author adilson
 */
public class Veiculo {

    private long id;
    private long proprietarioID;
    private String marca;
    private String modelo; 
    private int ano;
    private String placa;
    // private long chassis; 

    public Veiculo() {
    }

    public Veiculo(long id, long proprietarioID, String marca, String modelo, int ano, String placa) {
        this.id = id;
        this.proprietarioID = proprietarioID;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        //this.chassis = chassis;
    }
   
   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 47 * hash + (int) (this.proprietarioID ^ (this.proprietarioID >>> 32));
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
        
        if (this.proprietarioID != other.proprietarioID){
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
   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getProprietarioID(){
        return proprietarioID;
    }
    
    public void setProprietarioID(long proprietarioID){
        this.proprietarioID = proprietarioID;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int Ano) {
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
        StringBuilder build = new StringBuilder();
        build.append("veiculo id: ")
        .append(id)
        .append(", proprietario id: ")
        .append(proprietarioID)        
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
   
}

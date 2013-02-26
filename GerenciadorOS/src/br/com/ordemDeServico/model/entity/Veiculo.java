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
   private String marca;
   private String modelo; 
   private Data ano;
   private String placa;
   private long chassis; 

    public Veiculo() {
    }

    public Veiculo(long id, String marca, String modelo, Data ano, String placa, long chassis) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.chassis = chassis;
    }
   
   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 47 * hash + Objects.hashCode(this.marca);
        hash = 47 * hash + Objects.hashCode(this.modelo);
        hash = 47 * hash + Objects.hashCode(this.ano);
        hash = 47 * hash + Objects.hashCode(this.placa);
        hash = 47 * hash + (int) (this.chassis ^ (this.chassis >>> 32));
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
        if (!Objects.equals(this.ano, other.ano)) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (this.chassis != other.chassis) {
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

    public Data getAno() {
        return ano;
    }

    public void setAno(Data Ano) {
        this.ano = Ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String Placa) {
        this.placa = Placa;
    }

    public long getChassis() {
        return chassis;
    }

    public void setChassis(long Chassis) {
        this.chassis = Chassis;
    }
    
       @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Cliente [id")
        .append(id)
        .append(", marca")
        .append(marca)
        .append(", modelo")
        .append(modelo)
        .append(", ano")
        .append(ano)
        .append(", placa")
        .append(placa)
        .append(chassis)
        .append(", chassis")        
        .append("]");
        
                
                
                
        
        return build.toString();
                }
   
    
}

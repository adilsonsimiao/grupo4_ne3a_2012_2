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
import java.lang.annotation.Annotation.*;
import org.hibernate.criterion.Order;

/**
 *
 * @author Fernando
 */

@Entity
@Table(name = "Veiculo")
@ClassProperty(label="Veiculo" , width=500, height=200)
public class Veiculo implements Serializable{
    
    private long id;    
    private String marca;
    private String modelo; 
    private int ano;
    private String placa;
    private int km;
    private Cliente proprietario;
    
    static final String ID = "id";
    static final String MARCA = "marca";
    static final String MODELO = "modelo";
    static final String ANO = "ano";
    static final String PLACA = "placa";
    static final String KM = "Km";
    static final String PROPRIETARIO = "proprietario";
    
    public Veiculo() {
    }
//------------------------------------------------------------------------------   
    
    @MethodProperty(label="Id", groupName="Geral")
    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
    @Column(name="id")
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }    
    
    
    @MethodProperty(label="Marca", groupName="Geral")
    @Column(name = "marca", nullable = false, length = 250)
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    @MethodProperty(label="Modelo", groupName="Geral")
    @Column(name = "modelo", nullable = false, length = 250 )
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    @MethodProperty(label="Ano", groupName="Geral")
    @Column(name = "ano", nullable = false, length = 4)
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    
    @MethodProperty(label="Placa", groupName="Geral")
    @Column(name = "placa", nullable = false, length = 7, unique = true, updatable = true)
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    @MethodProperty(label="Km", groupName="Geral")
    @Column(name = "km", nullable = true, length = 7)
    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
    
    
    @MethodProperty(label="Proprietario", cascadeDelete=true)
    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)    
    public Cliente getProprietario() {        
        return proprietario;
    }
    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }


//------------------------------------------------------------------------------
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 59 * hash + Objects.hashCode(this.marca);
        hash = 59 * hash + Objects.hashCode(this.modelo);
        hash = 59 * hash + this.ano;
        hash = 59 * hash + Objects.hashCode(this.placa);
        hash = 59 * hash + this.km;
        hash = 59 * hash + Objects.hashCode(this.proprietario);
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
        if (this.km != other.km) {
            return false;
        }
        if (!Objects.equals(this.proprietario, other.proprietario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", marca=" + marca 
                + ", modelo=" + modelo + ", ano=" + ano 
                + ", placa=" + placa + ", km=" + km 
                + ", proprietario=" + proprietario + '}';
    }    
//------------------------------------------------------------------------------    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author adilson
 */
@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable { 
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name ="id", nullable = false)
    private int id;
 
    @Column(name ="nome", nullable = false)
    private String nome;
 
 @Column(name ="cpf",nullable = false)  
    private String cpf;

 @Column(name ="rg",nullable = false)
    private String rg;
  
     @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name= "clienteID")
     private List<OrdemDeServico>ordem;

    public List<OrdemDeServico> getOrdem() {
        return ordem;
    }

    public void setOrdem(OrdemDeServico ordem) {
        this.ordem.add(ordem);
    }
     
   @OneToOne(cascade = CascadeType.ALL)      
    Endereco endereco;
 
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name= "clienteID")
    private List<Telefone> telefone;
  
  
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name= "clienteID")
     private List<Veiculo> veiculo;
    
   
  public List<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo.add(veiculo); 
        
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
       
        this.telefone.add(telefone);
        
    }
  
    
    
    public Cliente() {
        this.veiculo = new ArrayList<>();
        this.telefone = new ArrayList<>();
    }

    
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


  

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", endereco=" + endereco + ", telefone=" + telefone + ", veiculo=" + veiculo + '}';
    }

 
 


}

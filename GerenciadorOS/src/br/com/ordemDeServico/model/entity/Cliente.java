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
   @Column(name ="ID", nullable = false)
    private int id;
 
    @Column(name ="Nome", nullable = false)
    private String nome;
 
 @Column(name ="CPF",nullable = false)  
    private String cpf;

 @Column(name ="RG",nullable = false)
    private String rg;
   
 @OneToOne(cascade = CascadeType.ALL)
    Endereco endereco;
 @OneToMany(cascade = CascadeType.ALL)
 @JoinColumn(name = "idCliente")
         Telefone telefone;
 
// @OneToMany(cascade = CascadeType.ALL)
// @JoinColumn(name = "idCliente")
// private List<Telefone> telefone = new ArrayList<>();
//    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCliente")
     private List<Veiculo> veiculo = new ArrayList<>();

    public List<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo.add(veiculo); 
        
    }

    public Cliente() {
    }

    
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

//    public List<Telefone> getTelefone() {
//        return telefone;
//    }
//
//    public void setTelefone(Telefone telefone) {
//        this.telefone.add(telefone);

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
//    }

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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import br.com.ordemDeServico.model.entity.Endereco;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author adilson
 */
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
// @Column(nullable = false)
    private String nome;
// @Column(nullable = false)  
    private String cpf;
//  @Column(nullable = false)
    private String rg;
    @OneToOne(cascade = CascadeType.ALL)
    Endereco endereco;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCliente")
    private List<Telefone> telefone = new ArrayList<>();

    public Cliente() {
    }

    
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone.add(telefone);
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
        return "Cliente{" + "id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", rg=" + rg + '}';
    }
}

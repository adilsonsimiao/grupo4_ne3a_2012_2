/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.entity;

import java.util.Objects;

/**
 *
 * @author adilson
 */
public class Orcamento {
    
    
   private long id;
   private Cliente cliente;

    
   private Veiculo veiculo; 
   private Servico servicos;
   private String peça; 
   private long valorTotal;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 41 * hash + Objects.hashCode(this.cliente);
        hash = 41 * hash + Objects.hashCode(this.veiculo);
        hash = 41 * hash + Objects.hashCode(this.servicos);
        hash = 41 * hash + Objects.hashCode(this.peça);
        hash = 41 * hash + (int) (this.valorTotal ^ (this.valorTotal >>> 32));
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
        final Orcamento other = (Orcamento) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.veiculo, other.veiculo)) {
            return false;
        }
        if (!Objects.equals(this.servicos, other.servicos)) {
            return false;
        }
        if (!Objects.equals(this.peça, other.peça)) {
            return false;
        }
        if (this.valorTotal != other.valorTotal) {
            return false;
        }
        return true;
    }
    
   
   public Orcamento() {
    }

    public Orcamento(long id, Cliente cliente, Veiculo veiculo, Servico servicos, String peça, long valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.servicos = servicos;
        this.peça = peça;
        this.valorTotal = valorTotal;
    }

    public long getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(long valorTotal) {
        this.valorTotal = valorTotal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Servico getServicos() {
        return servicos;
    }

    public void setServicos(Servico servicos) {
        this.servicos = servicos;
    }

    public String getPeça() {
        return peça;
    }

    public void setPeça(String peça) {
        this.peça = peça;
    }
    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Orcamento [id")
        .append(id)
        .append(", cliente")
        .append(cliente)
        .append(", veiculo")
        .append(veiculo)
        .append(", servico")
        .append(servicos)
        .append(", peça")
        .append(peça)
        .append(", valorTotal")
        .append(valorTotal)        
        .append("]");
        
                
                
                
        
        return build.toString();
                }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.OrdemDeServico.model.entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author adilson
 */
public class OrdemDeServico {

    private long id;
    private Date dataEntrada;
    private Cliente cliente;
    private Veiculo veiculo;
    private String descriçao;
    private Servico servico;
    private String peças;
    private Long valorTotal;
    private Date dataSaida;

    public OrdemDeServico() {
    }

    public OrdemDeServico(long id, Date DataEntrada, Cliente cliente, Veiculo veiculo, String descriçao, Servico servico, String peças, Long ValorTotal, Date dataSaida) {
        this.id = id;
        this.dataEntrada = DataEntrada;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.descriçao = descriçao;
        this.servico = servico;
        this.peças = peças;
        this.valorTotal = ValorTotal;
        this.dataSaida = dataSaida;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date DataEntrada) {
        this.dataEntrada = DataEntrada;
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

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public String getPeças() {
        return peças;
    }

    public void setPeças(String peças) {
        this.peças = peças;
    }

    public Long getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Long ValorTotal) {
        this.valorTotal = ValorTotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 67 * hash + Objects.hashCode(this.dataEntrada);
        hash = 67 * hash + Objects.hashCode(this.cliente);
        hash = 67 * hash + Objects.hashCode(this.veiculo);
        hash = 67 * hash + Objects.hashCode(this.descriçao);
        hash = 67 * hash + Objects.hashCode(this.servico);
        hash = 67 * hash + Objects.hashCode(this.peças);
        hash = 67 * hash + Objects.hashCode(this.valorTotal);
        hash = 67 * hash + Objects.hashCode(this.dataSaida);
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
        final OrdemDeServico other = (OrdemDeServico) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.dataEntrada, other.dataEntrada)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.veiculo, other.veiculo)) {
            return false;
        }
        if (!Objects.equals(this.descriçao, other.descriçao)) {
            return false;
        }
        if (!Objects.equals(this.servico, other.servico)) {
            return false;
        }
        if (!Objects.equals(this.peças, other.peças)) {
            return false;
        }
        if (!Objects.equals(this.valorTotal, other.valorTotal)) {
            return false;
        }
        if (!Objects.equals(this.dataSaida, other.dataSaida)) {
            return false;
        }
        return true;
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
                .append(", data")
                .append(dataEntrada)
                .append(", dataSaida")
                .append(dataSaida)
                .append(", valorTotal")
                .append(valorTotal)
                .append(", peças")
                .append(peças)
                .append(", servico")
                .append(servico)
                .append("]");





        return build.toString();
    }
}

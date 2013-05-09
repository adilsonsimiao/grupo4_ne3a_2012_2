/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Adilsoon
 */
@Entity
@Table(name = "ordemdeservico", catalog = "testehibernate", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ordemdeservico.findAll", query = "SELECT o FROM Ordemdeservico o"),
    @NamedQuery(name = "Ordemdeservico.findById", query = "SELECT o FROM Ordemdeservico o WHERE o.id = :id"),
    @NamedQuery(name = "Ordemdeservico.findByDataEntrada", query = "SELECT o FROM Ordemdeservico o WHERE o.dataEntrada = :dataEntrada"),
    @NamedQuery(name = "Ordemdeservico.findByDataSaida", query = "SELECT o FROM Ordemdeservico o WHERE o.dataSaida = :dataSaida"),
    @NamedQuery(name = "Ordemdeservico.findByDescricao", query = "SELECT o FROM Ordemdeservico o WHERE o.descricao = :descricao"),
    @NamedQuery(name = "Ordemdeservico.findByPeca", query = "SELECT o FROM Ordemdeservico o WHERE o.peca = :peca"),
    @NamedQuery(name = "Ordemdeservico.findByValorTotal", query = "SELECT o FROM Ordemdeservico o WHERE o.valorTotal = :valorTotal"),
    @NamedQuery(name = "Ordemdeservico.findByIDCliente", query = "SELECT o FROM Ordemdeservico o WHERE o.iDCliente = :iDCliente"),
    @NamedQuery(name = "Ordemdeservico.findByIDVeiculo", query = "SELECT o FROM Ordemdeservico o WHERE o.iDVeiculo = :iDVeiculo")})
public class Ordemdeservico implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "dataEntrada")
    @Temporal(TemporalType.DATE)
    private Date dataEntrada;
    @Column(name = "dataSaida")
    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    @Column(name = "Descricao")
    private String descricao;
    @Column(name = "Peca")
    private String peca;
    @Column(name = "valorTotal")
    private BigInteger valorTotal;
    @Column(name = "IDCliente")
    private Integer iDCliente;
    @Column(name = "IDVeiculo")
    private Integer iDVeiculo;

    public Ordemdeservico() {
    }

    public Ordemdeservico(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        Long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        Date oldDataEntrada = this.dataEntrada;
        this.dataEntrada = dataEntrada;
        changeSupport.firePropertyChange("dataEntrada", oldDataEntrada, dataEntrada);
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        Date oldDataSaida = this.dataSaida;
        this.dataSaida = dataSaida;
        changeSupport.firePropertyChange("dataSaida", oldDataSaida, dataSaida);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        String oldPeca = this.peca;
        this.peca = peca;
        changeSupport.firePropertyChange("peca", oldPeca, peca);
    }

    public BigInteger getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigInteger valorTotal) {
        BigInteger oldValorTotal = this.valorTotal;
        this.valorTotal = valorTotal;
        changeSupport.firePropertyChange("valorTotal", oldValorTotal, valorTotal);
    }

    public Integer getIDCliente() {
        return iDCliente;
    }

    public void setIDCliente(Integer iDCliente) {
        Integer oldIDCliente = this.iDCliente;
        this.iDCliente = iDCliente;
        changeSupport.firePropertyChange("IDCliente", oldIDCliente, iDCliente);
    }

    public Integer getIDVeiculo() {
        return iDVeiculo;
    }

    public void setIDVeiculo(Integer iDVeiculo) {
        Integer oldIDVeiculo = this.iDVeiculo;
        this.iDVeiculo = iDVeiculo;
        changeSupport.firePropertyChange("IDVeiculo", oldIDVeiculo, iDVeiculo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordemdeservico)) {
            return false;
        }
        Ordemdeservico other = (Ordemdeservico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ordemDeServico.view.Ordemdeservico[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

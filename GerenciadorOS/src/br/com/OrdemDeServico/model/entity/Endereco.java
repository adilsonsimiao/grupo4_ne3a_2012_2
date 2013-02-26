/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.OrdemDeServico.model.entity;

import java.util.Objects;



/**
 *
 * @author adilson
 */
public class Endereco {
    
    
     private String logradouro;
    private String complemento;
    private int numero;
    private String bairro;
    private String cidade; 
    private String uf;
    private String cep;  
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   

    public Endereco(int id) {
        super();
        this.id = id;
        
    }
    

    public Endereco() {
    }       
    
      public Endereco(String logradouro, String complemento, int numero, String bairro, String cidade, String uf, String cep) {
          
          System.out.println(logradouro);
          
        this.logradouro = logradouro;
         System.out.println(logradouro);
        this.complemento = complemento;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    } 

    public String getLogradouro() {
        System.out.println(logradouro);
        return logradouro;
        
        
    }

    public void setLogradouro(String logradouro) {
        System.out.println(logradouro);
        
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.logradouro);
        hash = 43 * hash + Objects.hashCode(this.complemento);
        hash = 43 * hash + this.numero;
        hash = 43 * hash + Objects.hashCode(this.bairro);
        hash = 43 * hash + Objects.hashCode(this.cidade);
        hash = 43 * hash + Objects.hashCode(this.uf);
        hash = 43 * hash + Objects.hashCode(this.cep);
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
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.logradouro, other.logradouro)) {
            return false;
        }
        if (!Objects.equals(this.complemento, other.complemento)) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.uf, other.uf)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        return true;
    }
    
    

    
    
         @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Cliente [logradouro")
        .append(logradouro)
        .append(", complemento")
        .append(complemento)
        .append(", numero")
        .append(numero)
        .append(", bairro")
        .append(bairro)
        .append(", cidade")
        .append(cidade)
        .append(", uf")
        .append(uf)
        .append(", cep")
        .append(cep)               
        .append("]");      
                
        
        return build.toString();
                }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.OrdemDeServico.model.Dao;

import br.com.OrdemDeServico.model.entity.Cliente;
import br.com.OrdemDeServico.model.entity.Endereco;




/**
 *
 * @author adilson
 */
public class ClienteDaoTeste {
    public static void main(String[] args){
       ClienteDao clienteDao= new ClienteDao();
      EnderecoDao dao = new EnderecoDao();
       
        Cliente cliente = new Cliente("adilson","0324242999","9888888");  
        Endereco end = new Endereco("morangueira","casa", 11, "requiao", "Maringa", "PR", "8703444");
        
     //cliente.setEndereco(end);
     // clienteDao.cadastrar(cliente);
      clienteDao.remover("0324242999");
               
    }
    
    
    
    
}

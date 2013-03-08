/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;

import br.com.ordemDeServico.model.entity.Cliente;

/**
 *
 * @author adilson
 */
public class ClienteDaoTest extends ClienteDao{
    
    public static void main(String[] args) {
       
        
        
        
        ClienteDao clinDao = new ClienteDao();
        
        
        Cliente cliente = clinDao.selectNome("adilson");
        
        System.out.println(cliente);
        
        
    }
    
}

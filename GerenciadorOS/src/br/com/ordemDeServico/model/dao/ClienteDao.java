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
public class ClienteDao extends GenericDao<Cliente> {
GenericDao hibernateDAO = new GenericDao();

@Override
public void persist(Cliente cliente){
    
    hibernateDAO.persist(cliente);

}


    

}
    
    
    
    


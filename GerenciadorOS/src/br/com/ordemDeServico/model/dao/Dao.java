/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;

import java.util.List;

/**
 *
 * @author adilson
 */
public interface Dao<T> {

    void insert(T object) throws DaoException;
    void update(T object) throws DaoException;
    void delete(String valor) throws DaoException;
    T retrieve(String nome);
    List<T> list(String valor);

}
    
    
    
    


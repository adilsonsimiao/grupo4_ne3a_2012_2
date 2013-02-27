/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;

import java.util.List;

/**
 *
 * @author lucio
 */
public interface Dao<T> {

    void insert(T object) throws DaoException;
    void update(T object) throws DaoException;
    void delete(T object) throws DaoException;
    T retrieve(int id);
    List<T> list();

}
    
    
    
    


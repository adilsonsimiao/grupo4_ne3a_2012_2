/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
 
import java.lang.reflect.ParameterizedType;
import java.util.List;
 
public  class GenericDao<T> {
 
    private  Session session;
    private  Class<T> persistentClass;
 
    public GenericDao() {
        this.session = new Sessao().retornaSessao();
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
 
    public Session getSession() {
        return session;
    }
 
    protected void persist(T entity) {
        try {
            getSession().getTransaction().begin();
            getSession().save(entity);
            getSession().getTransaction().commit();
        } catch (Throwable t) {
            getSession().getTransaction().rollback();
            t.printStackTrace();
        } finally {
            close();
        }
    }
 
    protected void update(T entity) {
        try {
            getSession().getTransaction().begin();
            getSession().update(entity);
            getSession().getTransaction().commit();
        } catch (Throwable t) {
            getSession().getTransaction().rollback();
            t.printStackTrace();
        } finally {
            close();
        }
    }
 
    protected void delete(T entity) {
        try {
            getSession().getTransaction().begin();
            getSession().delete(entity);
            getSession().getTransaction().commit();
        } catch (Throwable t) {
            getSession().getTransaction().rollback();
            t.printStackTrace();
        } finally {
            close();
        }
    }
 
    public List<T> findAll() throws Exception {
        return getSession().createCriteria(persistentClass).list();
    }
 
    public T findByName(String nome) {
        return (T) getSession().createCriteria(persistentClass)
                .add(Restrictions.eq("nome", nome).ignoreCase()).uniqueResult();
    }
 
    public T findById(long id) {
        return (T) getSession().createCriteria(persistentClass)
                .add(Restrictions.eq("id", id)).uniqueResult();
    }
 
    private void close() {
        if (getSession() != null && getSession().isOpen()) {
            getSession().close();
        }
    } 
}
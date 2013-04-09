/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.dao;

import br.com.ofiSys.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author fernando
 */
public class DaoBasic {

    Session sessao = HibernateUtil.getSessionFactory().openSession();
    Transaction tr = sessao.beginTransaction();
    
    
//------------------------------------------------------------------------------    
    public void delete(Object obj) {
    
        this.sessao = HibernateUtil.getSessionFactory().openSession();
        
        try {
            this.sessao.beginTransaction();
            this.sessao.delete(obj);
            this.sessao.getTransaction().commit();
        } catch (Exception e) {
            this.sessao.getTransaction().rollback();
        }finally{
            this.sessao.close();
        }
    }
    
    
    public void persist(Object obj) {
        
        this.sessao = HibernateUtil.getSessionFactory().openSession();
        
        try {
            this.sessao.beginTransaction();
            this.sessao.saveOrUpdate(obj);
            this.sessao.getTransaction().commit();
        } catch (Exception e) {
            this.sessao.getTransaction().rollback();
        }finally{
            this.sessao.close();
        }
    }


    public List<Object> retreive(Object obj) {
        
        this.sessao = HibernateUtil.getSessionFactory().openSession();
        
        List<Object> objS = new ArrayList();
        try {
            this.sessao.beginTransaction();
            objS = this.sessao.List();
            this.sessao.getTransaction().commit();
        } catch (Exception e) {
            this.sessao.getTransaction().rollback();
        }finally{
            this.sessao.close();
        }
        
        return objS;
    }
}
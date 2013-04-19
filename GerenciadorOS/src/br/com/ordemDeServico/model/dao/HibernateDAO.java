/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;

import br.com.ordemDeServico.model.entity.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Adilsoon
 */
public class HibernateDAO {

    
    
    Session session; 
     
   public void delete(Cliente cliente) {
        this.session = HibernateUtil.getSessionFactory().openSession();
        try {
            this.session.beginTransaction();
            this.session.delete(cliente);
            this.session.getTransaction().commit();
            
            
        } catch (Exception e) {
         this.session.getTransaction().rollback();
         
        
        }finally{
        
         this.session.close();
        }
    }
    public void persist(Cliente cliente) {
        this.session = HibernateUtil.getSessionFactory().openSession();
        try {
            this.session.beginTransaction();
            this.session.saveOrUpdate(cliente);
            this.session.getTransaction().commit();
            
            
        } catch (Exception e) {
         this.session.getTransaction().rollback();
         
        
        }finally{
        
         this.session.close();
        }
    }
    
    
    public List<Cliente> retreive(Cliente cliente) {
        this.session = HibernateUtil.getSessionFactory().openSession();
        List<Cliente>clientes = new ArrayList<>();
        try {
            this.session.beginTransaction();
            clientes=this.session.createCriteria(Cliente.class).list();
            this.session.getTransaction().commit();
            
            
        } catch (Exception e) {
         this.session.getTransaction().rollback();
         
        
        }finally{
        
         this.session.close();
        }
        return clientes;
    }
    
}

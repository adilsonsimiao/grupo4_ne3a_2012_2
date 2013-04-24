/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ofiSys.model.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author fernando
 */
public class DaoGenerico<T>{

    protected Session sessao;
    protected Class<T> classeGenerica;
    
    public DaoGenerico(){        
    }
    
    public DaoGenerico(Class<T> classeGen){
        this.classeGenerica = classeGen;
    }
    
    
//------------------------------------------------------------------------------    
    //@Override - Interface serviu apenas para DAO SQL
    public void persist(T object) throws RuntimeException {
        
        this.sessao = HibernateUtil.getSessionFactory().openSession();
        
        try{
            this.sessao.beginTransaction().begin();
            this.sessao.saveOrUpdate(object);
            this.sessao.flush();
            this.sessao.getTransaction().commit();
        }catch(Exception e){
            System.out.println("Erro ao persistir objeto.");
            this.sessao.getTransaction().rollback();
        }finally{
            
        }        
    }

     
    //@Override
    public void delete(T object) throws RuntimeException {
        
        this.sessao = HibernateUtil.getSessionFactory().openSession();
        
        try{
            this.sessao.beginTransaction();
            this.sessao.delete(object);
            this.sessao.getTransaction().commit();
        }catch(Exception e){
            System.out.println("Erro ao remover objeto.");
            this.sessao.getTransaction().rollback();
        }finally{
            this.sessao.close();
        }
    
    }
        
    //@Override
    // Busca todo o bd do objeto procurado
    public List<T> listAll() {
        
        List <T> lista = new ArrayList<>();
        this.sessao = HibernateUtil.getSessionFactory().openSession();
        
        try{
            this.sessao.beginTransaction();
            lista = this.sessao.createCriteria(classeGenerica).list();
            this.sessao.getTransaction().commit();
        }catch(Exception e){
            System.out.println("Erro ao buscar.");
            this.sessao.getTransaction().rollback();
        }finally{
            this.sessao.close();
        }
        
        return lista;
    }
}
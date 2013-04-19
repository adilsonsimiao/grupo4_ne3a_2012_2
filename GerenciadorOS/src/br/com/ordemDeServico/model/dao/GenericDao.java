/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;

import Util.HibernateUtil;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
 
 
public class GenericDao<T> {
 
   Session sessao;
  public Class<T> classeGenerica;
    public GenericDao(Session s){
        this.sessao = s;
    }
    
    public GenericDao(Class<T> classeGen){
        this.classeGenerica = classeGen;
    }
    
    
//------------------------------------------------------------------------------    
    //@Override - Interface serviu apenas para DAO SQL
    public void persist(T entity) throws RuntimeException {
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        
        try{
            this.sessao.beginTransaction().begin();
            //this.sessao.saveOrUpdate(entity);
              this.sessao.merge(entity);
              
            this.sessao.flush();
            this.sessao.getTransaction().commit();
        }catch(Exception e){
            System.out.println("Erro ao persistir objeto.");
            this.sessao.getTransaction().rollback();
        }finally{
            this.sessao.close();
        }        
    }

     
    //@Override
    public void delete(T object) throws RuntimeException {
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        
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
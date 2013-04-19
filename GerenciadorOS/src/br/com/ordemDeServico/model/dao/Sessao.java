/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Adilsoon
 */
public class Sessao {


    public Sessao() {
    }
    
    

    public Session retornaSessao() {
     SessionFactory factory=getFactory();
        return factory.openSession();
    }

   private SessionFactory getFactory() {
        AnnotationConfiguration configuration=new AnnotationConfiguration().configure();
        return (SessionFactory) configuration.buildSessionFactory();
    }
}

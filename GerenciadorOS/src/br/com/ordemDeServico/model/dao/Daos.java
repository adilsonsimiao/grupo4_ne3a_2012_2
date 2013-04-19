/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
public class Daos {

    private Session session;
    
    public Daos() {
        this.session = (Session) new Sessao().retornaSessao();
    }

    public void persiste(Object obj) throws Exception{
        Transaction tx = this.session.beginTransaction();
        this.session.saveOrUpdate(obj);
//        this.session.save(obj);
//        this.session.persist(obj);
        tx.commit();
    }

    //deleta um objeto
    public void deleta(Object obj) {
        org.hibernate.Transaction tx = this.session.beginTransaction();
        this.session.delete(obj);
        tx.commit();
    }

    //retorna um estoque pelo ID
   
    //

    

   
    public void fechaSessão() {
        this.session.close();
    }

   
    }




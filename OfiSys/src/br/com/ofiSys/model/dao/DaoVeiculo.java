/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ofiSys.model.dao;

import br.com.ofiSys.model.entity.Veiculo;
import br.com.ofiSys.model.dao.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author fernando
 */
public class DaoVeiculo extends DaoGenerico<Veiculo>{

    public DaoVeiculo() {
        super(Veiculo.class);
    }     
    
    
    public Veiculo retrieveId(long id) {
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        Veiculo busca;
        busca = (Veiculo) sessao.createCriteria(super.classeGenerica).add( Restrictions.idEq(id)).uniqueResult();
        sessao.close();
        System.out.println(busca.toString());
        return busca;
    }
    
    public List<Veiculo> retrieveAll() {
        
        sessao = HibernateUtil.getSessionFactory().openSession();        
        sessao.beginTransaction().begin();
        List <Veiculo> busca = null;
        busca = this.sessao.createCriteria(super.classeGenerica).list();
        sessao.getTransaction().commit();        
        sessao.close();
        
        return busca;
    }
    
    
    public List<Veiculo> retrievePlaca(String placa) {
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        List <Veiculo> busca = null;
        //         busca = this.sessao.createCriteria(Veiculo.class).list();
        sessao.getTransaction().commit();
        busca = sessao.createCriteria(super.classeGenerica).add( Restrictions.like("placa", "%"+placa+"%")).list();
        sessao.close();
        
        return busca;
    }
    
    public List<Veiculo> retrieveTeste(String tekte) {
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        List <Veiculo> busca = null;
        //         busca = this.sessao.createCriteria(Veiculo.class).list();
        sessao.getTransaction().commit();
        busca = sessao.createCriteria(super.classeGenerica).add( Restrictions.like("marca", "%"+tekte+"%")).list();
        sessao.close();
        
        return busca;
    }
}
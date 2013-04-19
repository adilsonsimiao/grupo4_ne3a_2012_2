/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ofiSys.model.dao;

import br.com.ordemDeServico.model.entity.Veiculo;
import br.com.ordemDeServico.model.dao.HibernateUtil;
import java.util.List;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author fernando
 */

public class DaoVeiculo extends DaoGenerico<Object>{
     
    public Veiculo retrieveId(long id) {
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        Veiculo busca;
        busca = (Veiculo) sessao.createCriteria(Veiculo.class).add( Restrictions.idEq(id)).uniqueResult();
        sessao.close();
        
        return busca;
    }
    
    public List<Veiculo> retrieveAll() {
        
        sessao = HibernateUtil.getSessionFactory().openSession();        
        sessao.beginTransaction().begin();
        List <Veiculo> busca = null;
        busca = this.sessao.createCriteria(Veiculo.class).list();
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
        busca = sessao.createCriteria(Veiculo.class).add( Restrictions.like("placa", "%"+placa+"%")).list();
        sessao.close();
        
        return busca;
    }
}
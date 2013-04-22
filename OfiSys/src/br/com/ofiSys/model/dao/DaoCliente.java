/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ofiSys.model.dao;

import br.com.ofiSys.model.entity.Cliente;
import br.com.ofiSys.model.dao.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author fernando
 */
public class DaoCliente extends DaoGenerico<Cliente>{

    public DaoCliente() {
        super(Cliente.class);
    }     
    
    
    public Cliente retrieveId(long id) {
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        Cliente busca;
        busca = (Cliente) sessao.createCriteria(super.classeGenerica).add( Restrictions.idEq(id)).uniqueResult();
        sessao.close();
        System.out.println(busca.toString());
        return busca;
    }
    
    public List<Cliente> retrieveAll() {
        
        sessao = HibernateUtil.getSessionFactory().openSession();        
        sessao.beginTransaction().begin();
        List <Cliente> busca = null;
        busca = this.sessao.createCriteria(super.classeGenerica).list();
        sessao.getTransaction().commit();        
        sessao.close();
        
        return busca;
    }
    
    
    public List<Cliente> retrieveNome(String nome) {
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        List <Cliente> busca = null;
        //         busca = this.sessao.createCriteria(Veiculo.class).list();
        sessao.getTransaction().commit();
        busca = sessao.createCriteria(super.classeGenerica).add( Restrictions.like("nome", "%"+nome+"%")).list();
        sessao.close();
        
        return busca;
    }    
}
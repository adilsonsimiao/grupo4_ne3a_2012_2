/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;

import br.com.ordemDeServico.model.entity.Cliente;
import br.com.ordemDeServico.model.entity.Veiculo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Adilsoon
 */
public class VeiculoDao  extends GenericDao<Veiculo> {
    
  Veiculo veiculo = new Veiculo();
        
    private Session session;

    Transaction tx;

    /**
     *
     */
 public VeiculoDao() {
     super(Veiculo.class);
    }

    
    public  VeiculoDao(Session s) {
        
       super(s);
        
    }

   



public List consultarMarca(String marca){
        return this.session.createQuery("from Veiculo veiculo where veiculo.marca like '%"+marca+"%'").list();
                                             
}
public List consultarPlaca(String placa ){
        return this.session.createQuery("from Veiculo veiculo where veiculo.placa like '%"+placa+"%'").list();                                       
}



public List buscaCarro(String carro) {
        return  this.session.createCriteria(classeGenerica).add(Restrictions.eq("marca", carro)).list();

    }

 public Veiculo retrieveId(int id) {
        
        sessao = Util.HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        Veiculo busca;
        busca = (Veiculo) sessao.createCriteria(classeGenerica).add( Restrictions.idEq(id)).uniqueResult();
        sessao.close();
        
        return busca;
    }
    
    public List<Veiculo> retrieveAll() {
        
        sessao = Util.HibernateUtil.getSessionFactory().openSession();        
        sessao.beginTransaction().begin();
        List <Veiculo> busca = null;
        busca = this.sessao.createCriteria(classeGenerica).list();
        sessao.getTransaction().commit();        
        sessao.close();
        
        return busca;
    }
    
    
    public List<Veiculo> buscarNome(String marca) {
        
        sessao = Util.HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        List <Veiculo> busca = null;

        sessao.getTransaction().commit();
        busca = sessao.createCriteria(Veiculo.class).add( Restrictions.like("marca", "%"+marca+"%")).list();
        sessao.close();
        
        return busca;
    }
    
    
     public List<Veiculo> buscarCpf(String placa) {
        
        sessao = Util.HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        List <Veiculo> busca = null;
        //         busca = this.sessao.createCriteria(Veiculo.class).list();
        sessao.getTransaction().commit();
        busca = sessao.createCriteria(Veiculo.class).add( Restrictions.like("placa", "%"+placa+"%")).list();
        sessao.close();
        
        return busca;
    }
}

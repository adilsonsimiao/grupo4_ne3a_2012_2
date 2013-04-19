/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;
import Util.HibernateUtil;
import br.com.ordemDeServico.model.entity.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author adilson
 */
public class ClienteDao extends GenericDao<Cliente> {

Cliente cliente = new Cliente();
        
    private Session session;

    Transaction tx;

    /**
     *
     */
 public ClienteDao() {
     super(Cliente.class);
    }

    
    public  ClienteDao(Session s) {
        
       super(s);
        
    }

   



public List consultarNome(String nome){
        return this.session.createQuery("from Cliente  cliente where cliente.nome like '%"+nome+"%'").list();
                                             
}
public List consultarCPF(String cpf ){
        return this.session.createQuery("from Cliente  cliente where cliente.cpf like '%"+cpf+"%'").list();                                       
}



public List buscaCl(String nome) {
        return  this.session.createCriteria(classeGenerica).add(Restrictions.eq("nome", nome)).list();

    }

 public Cliente retrieveId(int id) {
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        Cliente busca;
        busca = (Cliente) sessao.createCriteria(classeGenerica).add( Restrictions.idEq(id)).uniqueResult();
        sessao.close();
        
        return busca;
    }
    
    public List<Cliente> retrieveAll() {
        
        sessao = HibernateUtil.getSessionFactory().openSession();        
        sessao.beginTransaction().begin();
        List <Cliente> busca = null;
        busca = this.sessao.createCriteria(classeGenerica).list();
        sessao.getTransaction().commit();        
        sessao.close();
        
        return busca;
    }
    
    
    public List<Cliente> buscarNome(String nome) {
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        List <Cliente> busca = null;

        sessao.getTransaction().commit();
        busca = sessao.createCriteria(Cliente.class).add( Restrictions.like("nome", "%"+nome+"%")).list();
        sessao.close();
        
        return busca;
    }
    
    
     public List<Cliente> buscarCpf(String cpf) {
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        List <Cliente> busca = null;
        //         busca = this.sessao.createCriteria(Veiculo.class).list();
        sessao.getTransaction().commit();
        busca = sessao.createCriteria(Cliente.class).add( Restrictions.like("nome", "%"+cpf+"%")).list();
        sessao.close();
        
        return busca;
    }
    
}
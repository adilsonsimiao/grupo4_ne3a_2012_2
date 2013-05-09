/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;
import br.com.ordemDeServico.model.entity.OrdemDeServico;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class OrdemServicoDao extends GenericDao<OrdemDeServico> {
OrdemDeServico ordem = new OrdemDeServico();
   private Session session;
    Transaction tx;
    
public OrdemServicoDao() {
     super(OrdemDeServico.class);
    }


public List consultarNome(String nome){
        return this.session.createQuery("from OrdemDeServico  ordemServico where ordemServico.nome like '%"+nome+"%'").list();
                                             
}
public List consultarCPF(String codigo){
        return this.session.createQuery("from OrdemDeServico  ordemServico where ordemServico.codigo like '%"+codigo+"%'").list();                                       
}

public List listarTodos(){
    Query query = session.createQuery("from OrdemDeServico");
    List<OrdemDeServico> ordemDeservicos = query.list();
    return  ordemDeservicos;
}


public List buscaCl(String nome) {
        return  this.session.createCriteria(classeGenerica).add(Restrictions.eq("nome", nome)).list();

    }

 public OrdemDeServico retrieveId(int id) {
        
        sessao = Util.HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        OrdemDeServico busca;
        busca = (OrdemDeServico) sessao.createCriteria(classeGenerica).add( Restrictions.idEq(id)).uniqueResult();
        sessao.close();
        
        return busca;
    }
    
    public List<OrdemDeServico> retrieveAll() {
        
        sessao = Util.HibernateUtil.getSessionFactory().openSession();        
        sessao.beginTransaction().begin();
        List <OrdemDeServico> busca = null;
        busca = this.sessao.createCriteria(classeGenerica).list();
        sessao.getTransaction().commit();        
        sessao.close();
        
        return busca;
    }
    
    public List<String> retrieve() {
        
        sessao = Util.HibernateUtil.getSessionFactory().openSession();        
        sessao.beginTransaction().begin();
//        List <OrdemDeServico> busca = null;
//       Criteria critSelectedResumes  = (Criteria) this.sessao.createSQLQuery("SELECT\n" +
//"     cliente.id,\n" +
//"     cliente.cpf,\n" +
//"     cliente.nome,\n" +
//"     ordemdeservico.id,\n" +
//"     ordemdeservico.dataEntrada,\n" +
//"     ordemdeservico.dataSaida,\n" +
//"     ordemdeservico.Descricao,\n" +
//"     ordemdeservico.Peca,\n" +
//"     ordemdeservico.valorTotal\n" +
//"FROM cliente INNER JOIN  ordemdeservico ON cliente.id = ordemdeservico.id").list();
//        sessao.getTransaction().commit();        
        //sessao.close();
       List<String> resultList1 = new ArrayList<>();
        
     List<String> companyList =  sessao.createSQLQuery("SELECT\n" +
"     cliente.id,\n" +
"     cliente.cpf,\n" +
"     cliente.nome,\n" +
"     ordemdeservico.id,\n" +
"     ordemdeservico.dataEntrada,\n" +
"     ordemdeservico.dataSaida,\n" +
"     ordemdeservico.Descricao,\n" +
"     ordemdeservico.Peca,\n" +
"     ordemdeservico.valorTotal\n" +
"FROM cliente INNER JOIN  ordemdeservico ON cliente.id = ordemdeservico.id").list();
      
     return companyList;
        
    }
    
    
    
    public List<OrdemDeServico> buscarNome(String nome) {
        
        sessao = Util.HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        List <OrdemDeServico> busca = null;

        sessao.getTransaction().commit();
        busca = sessao.createCriteria(OrdemDeServico.class).add( Restrictions.like("nome", "%"+nome+"%")).list();
                
        return busca;
    }
    
    
     public List<OrdemDeServico> buscarCpf(String nome) {
        
        sessao = Util.HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction().begin();
        List <OrdemDeServico> busca = null;
        sessao.getTransaction().commit();
        busca = sessao.createCriteria(OrdemDeServico.class).add( Restrictions.like("nome", "%"+nome+"%")).list();
        
        
        return busca;
    }
       public void close(){
     this.sessao.close();
     
     }


    
}

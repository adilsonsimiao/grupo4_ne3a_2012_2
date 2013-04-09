/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ofisys;

import br.com.ofiSys.model.entity.Veiculo;
import br.com.ofiSys.util.HibernateUtil;
import org.hibernate.ReplicationMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author fernando
 */
public class OfiSys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = sessao.beginTransaction();
        
        Veiculo p = new Veiculo();
        p.setAno(1993);
        p.setMarca("Suzuki");
        p.setModelo("Samurai");
        p.setPlaca("EAK7878");
        p.setKm(78000);
        p.setId(2);
        
        
        System.out.println(p.toString());
        
        
        //sessao.save(p);
        //sessao.delete(p);
        //sessao.update(p);        
        tr.commit();
        sessao.close();
    }
}

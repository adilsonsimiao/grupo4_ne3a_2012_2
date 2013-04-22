/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.ofiSys.model.dao.DaoVeiculo;
import br.com.ofiSys.model.entity.Veiculo;
import br.com.ofiSys.model.entity.Servico;
import br.com.ofiSys.model.entity.Cliente;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

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
        
        DaoVeiculo teste = new DaoVeiculo() ;
        
        //Session sessao = HibernateUtil.getSessionFactory().openSession();
        //Transaction tr = sessao.beginTransaction();
        
        //SchemaExport esz = new SchemaExport();
        Servico ser = new Servico();
        ser.setDescricaoServico("Strosdsbonoss");
        ser.setValor(34.34);
        //sessao.saveOrUpdate(ser);
                
        Cliente cli = new Cliente();
        cli.setNome("Joaissddgs");
        //sessao.save(cli);
        
        Veiculo p = new Veiculo();
        p.setAno(1993);
        p.setMarca("Suzuki");
        p.setModelo("Samssss");
        p.setPlaca("eVA2333");
        //p.setKm(78000);
        //p.setId();
        p.setProprietario(cli);
        
        System.out.println(p.toString());
        System.out.println("sdfdsfsdfdBUAA");
        teste.persist(p);
        //sessao.saveOrUpdate(p);
        //sessao.delete(p);
        //sessao.update(p);        
        
        Veiculo ua = teste.retrieveId(5);
        ua.setModelo("bingBons");
        teste.persist(ua);
        
        //sessao.saveOrUpdate(cli);
        //tr.commit();
        //sessao.close();
        
        //teste.persist(p);
        
        //teste.listAll();
        //Veiculo op = teste.retrieve(3);
        
        List <Veiculo> veics = new ArrayList();
        veics = teste.retrievePlaca("d");
       // System.out.println(op.toString());
        for(Veiculo teta : veics){
            System.out.println(teta.toString());
            if(teta.getId() == 3){
                teste.delete(teta);
            }
        }
        
        /*
        for(Veiculo tetas : veics){
            System.out.println(tetas.toString());
        }
        //List <Veiculo> listas.teste.listAll();
         
        //System.out.println(op.toString());
        //System.out.println(op.toString());
        //teste.delete(op);
        */ 
    }
}

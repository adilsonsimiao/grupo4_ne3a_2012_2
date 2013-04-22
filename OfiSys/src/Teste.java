/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.

*/
import br.com.ofiSys.model.dao.DaoCliente;
import br.com.ofiSys.model.dao.DaoVeiculo;
import br.com.ofiSys.model.entity.Cliente;
import br.com.ofiSys.model.entity.Veiculo;
import br.com.ofiSys.view.GenericView;
import br.com.ofiSys.model.dao.DaoVeiculo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author fernando
 */
public class Teste {

    public static void main(String[] args) {
        
        List <Veiculo> listao = new ArrayList<>();
        DaoVeiculo teste= new DaoVeiculo();
        //DaoCliente teste2= new DaoCliente();
        Cliente cd = new Cliente();
        //cd.setId();
        cd.setNome("Teste");
System.out.println("##########################################################");
        System.out.println("TESTE LIST ALL         INICIO");
        listao = teste.listAll();
        
        for(Veiculo te:listao){
            System.out.println(te.toString());
        }
        System.out.println("TESTE LIST ALL         FIM");
System.out.println("##########################################################");        
        System.out.println("PERSISTE UM VEICULO COM CLIENTE");
        Veiculo c = new Veiculo();
        cd = new Cliente();
        cd.setNome("Carlos");
        c.setAno(2012);        
        c.setKm(20);
        c.setMarca("Ford");
        c.setModelo("F250");
        c.setPlaca("AFL1222");
        c.setProprietario(cd);
        
        GenericView.updateObject(c);
        
        
        
        teste.persist(c);
        System.out.println("FIM PERSISTENCIA");
System.out.println("##########################################################");        
        c = new Veiculo();
        System.out.println(c.toString());
        
System.out.println("##########################################################");        
    int x = 4;    
    System.out.println("RETRIEVE CLIENTE ID"+ x);
        
        
        c = teste.retrieveId(x);
        c.setAno(2013);
        c.setKm(22);
        c.setMarca("Suzuki");
        c.setModelo("Jimny");
        c.setPlaca("AOK4254");
        teste2.persist(cd);
        teste.persist(c);
        
        
        //teste.delete(c);
        
        
        
        System.out.println(c.toString());
        System.out.println("##################################################");
System.out.println("##########################################################");                
        System.out.println("BUSCA POR VEICULO POR MARCA");
        
        listao = teste.retrieveTeste("for");
        
        for(Veiculo tempo:listao){
            System.out.println(tempo.toString());
        }
    System.out.println("##########################################################");                
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import br.com.ordemDeServico.model.dao.ClienteDao;
import br.com.ordemDeServico.model.entity.Cliente;
import br.com.ordemDeServico.model.entity.Endereco;
import br.com.ordemDeServico.model.entity.Telefone;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adilsoon
 */
public class MainTest {

    public static void main(String[] args) throws Exception {
          ClienteDao clienteDao = new ClienteDao();
          
   List<Cliente> clientes = new ArrayList<>();
//          
       
       Cliente cliente = new Cliente();
//        cliente.setNome("adilson");
//        cliente.setCpf("8800000");
//        cliente.setRg("999999");
//
//        Endereco end = new Endereco();
//        end.setBairro("reqs");
//        end.setCep("00909");
//        end.setCidade("maringa");
//        end.setComplemento("casa");
//        end.setLogradouro("said");
//        end.setUf("PR");
//
//        Telefone tel = new Telefone();
//        tel.setDdd("44");
//        tel.setTelefone("4444");
//        Telefone tel1 = new Telefone();
//        tel.setDdd("44");
//        tel.setTelefone("8888");
//
//        cliente.setTelefone(tel);
//        cliente.setTelefone(tel1);
//        cliente.setEndereco(end);
        
//        daoCli.persiste(cliente);
//        
       
    cliente= clienteDao.retrieveId(30);
    //clientes =clienteDao.alterarPorNome("adilson");
   
    
    
    
    
        System.out.println(cliente.toString());
      
     
       
       
//      
     

 
      
    


    }
}

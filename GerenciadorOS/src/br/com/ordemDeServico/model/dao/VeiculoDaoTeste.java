/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;

import br.com.ordemDeServico.model.entity.Veiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author meritor
 */
public class VeiculoDaoTeste {
    
    public static void main(String[] args) throws DaoException {
        
        Veiculo veTeste = new Veiculo();
        VeiculoDao daoTes = new VeiculoDao();
        
        veTeste.setId(4);
        veTeste.setProprietarioID(1);
        veTeste.setMarca("Ford");
        veTeste.setModelo("Corcel");
        veTeste.setAno(1979);
        veTeste.setPlaca("ABC1239");
        
        //daoTes.insert(veTeste);
        //daoTes.update(veTeste);
        //daoTes.delete(veTeste);
        daoTes.retrieve("ab");
        
        
    }
    
    /*private class CadClis(){
        Veiculo veTeste = new Veiculo();
        
        veTeste.setProprietarioID(1);
        veTeste.setMarca("Chevrolet");
        veTeste.setModelo("Cosra");
        veTeste.setAno(1995);
        veTeste.setPlaca("ABC1234");
    }*/
}

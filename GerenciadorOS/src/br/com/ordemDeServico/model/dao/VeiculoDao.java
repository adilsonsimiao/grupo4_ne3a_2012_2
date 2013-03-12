/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;

import br.com.ordemDeServico.connection.ConnectionProvider;
import br.com.ordemDeServico.model.entity.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando
 */
public class VeiculoDao /*implements Dao*/ {

    private static String INSERT_SQL = "INSERT INTO veiculo (proprietarioID, marca, modelo, ano, placa) VALUES(?, ?, ?, ?, ?)";
    private static String UPDATE_SQL = "UPDATE veiculo SET proprietarioID= ?, marca= ?, modelo= ?, ano= ?, placa= ? WHERE id= ?";
    private static String DELETE_SQL = "DELETE FROM veiculo WHERE id = ?";    
    
    private static String SELECT_PLACA ="SELECT id, proprietarioID, marca, modelo, ano, placa  FROM veiculo WHERE placa like ?";
    
    Veiculo veiculo = new Veiculo();
    
    //##########################################################################
    //@Override
    public void insert(Object objeto) throws DaoException {
        
        veiculo = (Veiculo)objeto;
        Connection conexao = ConnectionProvider.getConection();
        
        try{
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            ps = conexao.prepareStatement(INSERT_SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setLong(1, veiculo.getProprietarioID());
            ps.setString(2, veiculo.getMarca());
            ps.setString(3, veiculo.getModelo());
            ps.setInt(4, veiculo.getAno());
            ps.setString(5, veiculo.getPlaca());
            
            rs =  ps.getGeneratedKeys();
                        
            if(rs.next()){
                veiculo.setId(rs.getInt(INSERT_SQL));
            }
                        
            ps.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao preparar a instrução 'INSERT_SQL' do 'veiculo'", ex);  
        }
        
                
        try{
            conexao.commit();
        } catch ( SQLException ex) {
            Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex);
            try {
                conexao.rollback();
                throw new RuntimeException("Erro ao tentar commitar 'INSERT_SQL'. Operação cancelada com sucesso.", ex);

            } catch (SQLException ex1) {
                Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex1);
                throw new RuntimeException("Erro ao tentar commitar 'INSERT_SQL'. Não foi possível cancelar a operação.", ex1);
            }
        }
                      
    }
    //##########################################################################
    
    //@Override
    public void update(Object objeto) throws DaoException {
        
        veiculo = (Veiculo)objeto;
        Connection conexao = ConnectionProvider.getConection();
        
        try {            
            PreparedStatement ps = conexao.prepareStatement(UPDATE_SQL);
            
            ps.setLong(1, veiculo.getProprietarioID());
            ps.setString(2, veiculo.getMarca());
            ps.setString(3, veiculo.getModelo());
            ps.setInt(4, veiculo.getAno());
            ps.setString(5, veiculo.getPlaca());
            ps.setLong(6, veiculo.getId());
   
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao preparar a instrução 'UPDATE_SQL' em 'veiculo'", ex);
        }

        try {
            conexao.commit();
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex);
            try {
                conexao.rollback();
                throw new RuntimeException("Erro ao tentar commitar 'UPDATE_SQL'. Operação cancelada com sucesso.", ex);

            } catch (SQLException ex1) {
                Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex1);
                throw new RuntimeException("Erro ao tentar commitar 'UPDATE_SQL'. Não foi possível cancelar a operação.", ex1);
            }
        }
    }
    
    //##########################################################################
    //@Override
    public void delete(Object objeto) throws DaoException {
        
        veiculo = (Veiculo)objeto;
        Connection conexao = ConnectionProvider.getConection();
                
        try {            
            PreparedStatement ps = conexao.prepareStatement(DELETE_SQL);
            
            ps.setLong(1, veiculo.getId());
   
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao preparar a instrução 'DELETE_SQL' em 'veiculo'", ex);
        }

        try {
            conexao.commit();
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex);
            try {
                conexao.rollback();
                throw new RuntimeException("Erro ao tentar commitar 'DELETE_SQL'. Operação cancelada com sucesso.", ex);

            } catch (SQLException ex1) {
                Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex1);
                throw new RuntimeException("Erro ao tentar commitar 'DELETE_SQL'. Não foi possível cancelar a operação.", ex1);
            }
        }
    }

    //##########################################################################
    //@Override
    public Object retrieve(String placa) {
        
        ArrayList <Veiculo>lista = new ArrayList();        
        Connection conexao = ConnectionProvider.getConection();
        PreparedStatement ps = null; 
        ResultSet rs;
        
        try {
            ps = conexao.prepareStatement(SELECT_PLACA);
            ps.setString(1, "%"+placa+"%");
            rs = ps.executeQuery();
      
           while(rs.next()){
               veiculo = new Veiculo();
               
               veiculo.setId(Long.valueOf(rs.getLong("id")));
               veiculo.setProprietarioID(Long.valueOf(rs.getLong("proprietarioID")));
               veiculo.setMarca(String.valueOf(rs.getString("marca")));
               veiculo.setModelo(String.valueOf(rs.getString("modelo")));
               veiculo.setAno(Integer.valueOf(rs.getInt("ano")));
               veiculo.setPlaca(String.valueOf(rs.getString("placa")));
               
               lista.add(veiculo);               
           }               
            
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao preparar a instrução 'SELECT_SQL_PLACA' do 'veiculo", ex);
        }

        try {
            conexao.commit();
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex);
            try {
                conexao.rollback();
                throw new RuntimeException("Erro ao tentar commitar 'SELECT_SQL_PLACA'. Operação cancelada com sucesso.", ex);

            } catch (SQLException ex1) {
                Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex1);
                throw new RuntimeException("Erro ao tentar commitar 'SELECT_SQL_PLACA'. Não foi possível cancelar a operação.", ex1);
            }            
        }
        
        /*
        for(Veiculo is : lista){
            System.out.println(is.toString());
        }
        */
        
        return (Object)lista;       
    }

    //##########################################################################
    //@Override
    public List list(String valor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

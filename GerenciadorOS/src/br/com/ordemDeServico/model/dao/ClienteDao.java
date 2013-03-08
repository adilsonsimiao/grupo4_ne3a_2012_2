/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;

import br.com.ordemDeServico.connection.ConnectionProvider;
import br.com.ordemDeServico.model.entity.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adilson
 */
public class ClienteDao  {
    private static String INSERT_SQL_CLIENTE = "INSERT INTO cliente (nome, cpf, rg, telefone) VALUES(?, ?, ?, ?)";
    private static String UPDATE_SQL = "UPDATE Cliente SET nome= ? WHERE id = ?";
    private static String DELETE_SQL = "DELETE FROM cliente WHERE cpf = ?";
    private static String SELECT_CPF = "SELECT id, nome, cpf, rg, telefone FROM cliente WHERE cpf =  ? ";
    private static String SELECT_NOME ="SELECT id, nome, cpf, rg, telefone  FROM cliente WHERE nome= ?";
  
    Cliente cliente = new Cliente();
    public void insert(Cliente cliente) {
        Connection con = ConnectionProvider.getConection();
            
        try {
            
               PreparedStatement ps = null; 
               ResultSet rs= null;    
            
            ps = con.prepareStatement(INSERT_SQL_CLIENTE,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getTelefone());
            ps.setString(4, cliente.getRg());
             rs = ps.getGeneratedKeys();
            if(rs.next()) 
            {            
              cliente.setId(rs.getInt(1));
            }
            ps.execute();
         
        
           
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao preparar a instrução de INSERT do Cliente", ex);
        }

        try {
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            try {
                con.rollback();
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Operação cancelada com sucesso.", ex);

            } catch (SQLException ex1) {
                Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex1);
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Não foi possível cancelar a operação.", ex1);
            }
        }
    }

    public void update(Cliente cliente)throws DaoException { 
        Connection con = ConnectionProvider.getConection();

        try {
            PreparedStatement ps = con.prepareStatement(UPDATE_SQL);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getTelefone());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao preparar a instrução de INSERT do Cliente", ex);
        }

        try {
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            try {
                con.rollback();
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Operação cancelada com sucesso.", ex);

            } catch (SQLException ex1) {
                Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex1);
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Não foi possível cancelar a operação.", ex1);
            }
        }
    }
    public void delete(String cpf) {
           Connection con = ConnectionProvider.getConection();

        try {
            PreparedStatement ps = con.prepareStatement(DELETE_SQL);
            ps.setString(1, cpf);           
            ps.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao preparar a instrução de INSERT do Cliente", ex);
        }

        try {
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            try {
                con.rollback();
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Operação cancelada com sucesso.", ex);

            } catch (SQLException ex1) {
                Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex1);
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Não foi possível cancelar a operação.", ex1);
            }
        }
    }

   
    public Cliente selectNome(String nome){
   
       
        
        Connection con = ConnectionProvider.getConection();
           PreparedStatement ps = null; 
           ResultSet rs;
        try {
            ps = con.prepareStatement(SELECT_NOME);
           ps.setString(1, nome);
           rs = ps.executeQuery();
      
           
           while(rs.next()){
               
               cliente.setId(rs.getInt("id"));
               cliente.setNome(rs.getString("nome"));
               cliente.setCpf(rs.getString("cpf"));
               cliente.setRg(rs.getString("rg"));
               cliente.setTelefone(rs.getString("telefone"));
          
                               
           } 
           
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao preparar a instrução de INSERT do Cliente", ex);
        }

        try {
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            try {
                con.rollback();
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Operação cancelada com sucesso.", ex);

            } catch (SQLException ex1) {
                Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex1);
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Não foi possível cancelar a operação.", ex1);
            }
            
        }
         return cliente;
       
    }

    public Cliente selectCpf(String cpf) {
        
           
             ResultSet rs = null;
             PreparedStatement ps;
             
             Connection con = ConnectionProvider.getConection();
      
             try {    
          
           ps = con.prepareStatement(SELECT_CPF);
           ps.setString(1, cpf);
           rs = ps.executeQuery();
           while(rs.next()){
               cliente.setId(rs.getInt("id"));
               cliente.setNome(rs.getString("nome"));
               cliente.setCpf(rs.getString("cpf"));
               cliente.setRg(rs.getString("rg"));
               cliente.setTelefone(rs.getString("telefone"));
          
              
             

          

           }      
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao preparar a instrução de INSERT do Cliente", ex);
        }

        try {
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            try {
                con.rollback();
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Operação cancelada com sucesso.", ex);

            } catch (SQLException ex1) {
                Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex1);
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Não foi possível cancelar a operação.", ex1);
            }
        }

      return cliente;
    
    }
      

}

/**
 *
 * @author adilson
 */
   class clientedaoTest extends ClienteDao{
       public static void main(String[] args) {
        ClienteDao clienteDao = new ClienteDao();
             
       Cliente cliente = clienteDao.selectNome("adilson");
      
        System.out.println(cliente);
    
       
      
      //clienteDao.delete("023");
           System.out.println(cliente);     
     
       
       }

} 
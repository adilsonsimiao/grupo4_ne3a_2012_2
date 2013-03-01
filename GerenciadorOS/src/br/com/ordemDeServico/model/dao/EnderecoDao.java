/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;

import br.com.ordemDeServico.connection.ConnectionProvider;
import br.com.ordemDeServico.model.entity.Cliente;
import br.com.ordemDeServico.model.entity.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adilson
 */
public class EnderecoDao implements Dao<Endereco> {
    private static String INSERT_SQL_Endereco = "INSERT INTO endereco (logradouro,complemento, numero,bairro,cidade, uf,cep, cliente_id) VALUES(?,?,?,?,?,?,?)";
    private static String UPDATE_SQL = "UPDATE endereco SET logradouro= ? WHERE id = ?";
    private static String DELETE_SQL = "DELETE FROM endereco WHERE id = ?";
    private static String RETRIEVE_SQL = "SELECT id, logradouro,complemento,numero,bairro,cidade,uf,cep FROM endereco WHERE id = ?";
    private static String LIST_SQL = "SELECT id, logradouro FROM endereco";
    
    
    public void insert(Endereco endereco) {
        Cliente cliente= new Cliente();
        Connection con = ConnectionProvider.getConection();
        ResultSet rs= null;
        PreparedStatement ps= null;
        
        try {
            
             ps = con.prepareStatement(INSERT_SQL_Endereco,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getTelefone());
            ps.setInt(4, endereco.getId());
             rs = ps.getGeneratedKeys();
            if(rs.next()) 
            {            
              cliente.setId(rs.getInt(1));
            }
            
         
        
            
            
           
            ps = con.prepareStatement(INSERT_SQL_Endereco,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, endereco.getLogradouro());
            ps.setString(2, endereco.getComplemento());
            ps.setInt(3, endereco.getNumero());
            ps.setString(4, endereco.getBairro());
            ps.setString(5, endereco.getCidade());
            ps.setString(6, endereco.getUf());
            ps.setString(7, endereco.getCep());
            ps.setInt(8, endereco.getCliente_id());
            rs = ps.getGeneratedKeys();
            if(rs.next()){
            
              endereco.setId(rs.getInt(1));
            }
            
            rs = ps.getGeneratedKeys();
            while(rs.next()){
            
               endereco.setId(rs.getInt(1));
            
            }
            
            ps.execute();
   
            
           
                   } catch (SQLException ex) {
            Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao preparar a instrução de INSERT do Cliente", ex);
        }

        try {
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
            try {
                con.rollback();
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Operação cancelada com sucesso.", ex);

            } catch (SQLException ex1) {
                Logger.getLogger(Endereco.class.getName()).log(Level.SEVERE, null, ex1);
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Não foi possível cancelar a operação.", ex1);
            }
        }
    }

    public void update(Endereco endereco)throws DaoException { 
        Connection con = ConnectionProvider.getConection();

        try {
            PreparedStatement ps = con.prepareStatement(UPDATE_SQL);
            ps.setString(1, endereco.getLogradouro());
            ps.setString(2, endereco.getBairro());
            ps.setString(3, endereco.getCep());
            ps.setString(4, endereco.getComplemento());
            ps.setString(5, endereco.getCidade());
            ps.setString(6, endereco.getUf());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao preparar a instrução de INSERT do Endereco", ex);
        }

        try {
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
            try {
                con.rollback();
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Operação cancelada com sucesso.", ex);

            } catch (SQLException ex1) {
                Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex1);
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Não foi possível cancelar a operação.", ex1);
            }
        }
    }
    public void delete(Endereco endereco) {
           Connection con = ConnectionProvider.getConection();

        try {
            PreparedStatement ps = con.prepareStatement(DELETE_SQL);
            ps.setString(1, endereco.getLogradouro());
            ps.setString(2, endereco.getBairro());
            ps.setString(3, endereco.getCep());
            ps.setString(4, endereco.getComplemento());
            ps.setString(5, endereco.getCidade());
            ps.setString(6, endereco.getUf());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao preparar a instrução de INSERT do Cliente", ex);
        }

        try {
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
            try {
                con.rollback();
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Operação cancelada com sucesso.", ex);

            } catch (SQLException ex1) {
                Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex1);
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Não foi possível cancelar a operação.", ex1);
            }
        }
    }

   
    public Endereco retrieve(int id){
           Connection con = ConnectionProvider.getConection();

        try {
            PreparedStatement ps = con.prepareStatement(DELETE_SQL);
            ps.setInt(1, id);
            
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao preparar a instrução de INSERT do Endereco", ex);
        }

        try {
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
            try {
                con.rollback();
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Operação cancelada com sucesso.", ex);

            } catch (SQLException ex1) {
                Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex1);
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Não foi possível cancelar a operação.", ex1);
            }
        }
        
        return null;
    }

    public List<Endereco> list() {
         
           Connection con = ConnectionProvider.getConection();

        try {
            PreparedStatement ps = con.prepareStatement(LIST_SQL);
             ResultSet rs =  ps.executeQuery();

             rs.next();

             System.out.println("=====" + rs.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao preparar a instrução de INSERT do Cliente", ex);
        }

        try {
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
            try {
                con.rollback();
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Operação cancelada com sucesso.", ex);

            } catch (SQLException ex1) {
                Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex1);
                throw new RuntimeException("Erro ao tentar commitar o Cliente. Não foi possível cancelar a operação.", ex1);
            }
        }

        return null;
    
    }
      

}

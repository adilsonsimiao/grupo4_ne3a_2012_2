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
    private static String INSERT_SQL = "INSERT INTO Cliente (nome) VALUES(?)";
    private static String UPDATE_SQL = "UPDATE Cliente SET nome= ? WHERE id = ?";
    private static String DELETE_SQL = "DELETE FROM Cliente WHERE id = ?";
    private static String RETRIEVE_SQL = "SELECT id, nome FROM Cliente WHERE id = ?";
    private static String LIST_SQL = "SELECT id, nome FROM Cliente";
    
    
    public void insert(Endereco endereco) {
        Connection con = ConnectionProvider.getConection();

        try {
            PreparedStatement ps = con.prepareStatement(INSERT_SQL);
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

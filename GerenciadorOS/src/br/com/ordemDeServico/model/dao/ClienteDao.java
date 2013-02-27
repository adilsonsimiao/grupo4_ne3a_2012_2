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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adilson
 */
public abstract class ClienteDao implements Dao<Cliente> {
    private static String INSERT_SQL = "INSERT INTO Cliente (nome) VALUES(?)";
    private static String UPDATE_SQL = "UPDATE Cliente SET nome= ? WHERE id = ?";
    private static String DELETE_SQL = "DELETE FROM Cliente WHERE id = ?";
    private static String RETRIEVE_SQL = "SELECT id, nome FROM Cliente WHERE id = ?";
    private static String LIST_SQL = "SELECT id, nome FROM Cliente";
    
    
    public void insert(Cliente cliente) {
        Connection con = ConnectionProvider.getConection();

        try {
            PreparedStatement ps = con.prepareStatement(INSERT_SQL);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getRg());
            ps.setString(4, cliente.getTelefone());
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
            ps.setString(3, cliente.getRg());
            ps.setString(4, cliente.getTelefone());
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
    public void delete(Cliente object) {
           Connection con = ConnectionProvider.getConection();

        try {
            PreparedStatement ps = con.prepareStatement(DELETE_SQL);
            ps.setString(1, object.getNome());
            ps.setString(2, object.getCpf());
            ps.setString(3, object.getRg());
            ps.setString(4, object.getTelefone());
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

   
    public Cliente retrieve(int id){
           Connection con = ConnectionProvider.getConection();

        try {
            PreparedStatement ps = con.prepareStatement(DELETE_SQL);
            ps.setInt(1, id);
            
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
        
        return null;
    }

    public List<Cliente> list() {
         
           Connection con = ConnectionProvider.getConection();

        try {
            PreparedStatement ps = con.prepareStatement(LIST_SQL);
             ResultSet rs =  ps.executeQuery();

             rs.next();

             System.out.println("=====" + rs.getString(1));
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

        return null;
    
    }
      

}
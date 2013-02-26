/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.OrdemDeServico.model.Dao;

import br.com.OrdemDeServico.model.entity.Cliente;

import br.com.ordemDeServico.connection.Conexao;
import br.com.ordemDeServico.connection.CreateDaoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author adilson
 */
public class ClienteDao {
    EnderecoDao endDao = new EnderecoDao();
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rset = null;
    Cliente cliente = new Cliente();
    Conexao conexao;
     

    public ClienteDao() {
        conexao = new Conexao();

    }
    
    public void cadastrar(Cliente cliente) throws CreateDaoException {


        try {
            conexao.inicioDaTransacao();

            conn = conexao.getConexaoDoContexto();

            conexao.inicioDaTransacao();


            conn = conexao.getConexaoDoContexto();




            pstm = conn.prepareStatement("INSERT INTO cliente(cpf,nome,rg) VALUES (?, ?, ?)");

            pstm.setString(1, cliente.getCpf());
            pstm.setString(2, cliente.getNome());
            pstm.setString(3, cliente.getRg());

            pstm.executeUpdate();






        } catch (SQLException ex) {

            throw new CreateDaoException("Não foi possivel realizar a transação", ex);

        } finally {

            conexao.realseAl(conn, pstm);

        }





    }

    public void remover(String cpf) throws CreateDaoException {

        try {

            conn = conexao.getConnection();
            conn.setAutoCommit(false);
            pstm = conn.prepareStatement("DELETE nome FROM cliente WHERE = ? ");
            pstm.setString(1, cpf);
            pstm.executeUpdate();
            conn.commit();
            conn.rollback();

        } catch (SQLException ex) {

            throw new CreateDaoException("Não foi possivel realizar a transação", ex);

        } finally {

            conexao.realseAl(conn, pstm);

        }

    }

    public void consultarPorCPF(String text) {


        try {
            conexao.inicioDaTransacao();

            conn = conexao.getConexaoDoContexto();

            conexao.inicioDaTransacao();


            conn = conexao.getConexaoDoContexto();




            pstm = conn.prepareStatement("INSERT INTO cliente(cpf,nome,rg) VALUES (?, ?, ?)");

            pstm.setString(1, cliente.getCpf());
            pstm.setString(2, cliente.getNome());
            pstm.setString(3, cliente.getRg());

            pstm.executeUpdate();






        } catch (SQLException ex) {

            throw new CreateDaoException("Não foi possivel realizar a transação", ex);

        } finally {

            conexao.realseAl(conn, pstm);

        }
    }
}

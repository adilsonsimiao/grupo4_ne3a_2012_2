/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.model.dao;

import br.com.ordemDeServico.model.entity.Cliente;
import br.com.ordemDeServico.model.entity.Veiculo;
import br.com.ordemDeServico.connection.Conexao;
import br.com.ordemDeServico.connection.CreateDaoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fernando
 */
public class VeiculoDao {
    
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rset = null;
    Veiculo veiculo = new Veiculo();
    Conexao conexao;
     

    public VeiculoDao() {        
        conexao = new Conexao();
    }
    
    public void cadastrar(Veiculo veiculo) throws CreateDaoException {


        try {
            conexao.inicioDaTransacao();
            
            conn = conexao.getConexaoDoContexto();
            conexao.inicioDaTransacao();
            conn = conexao.getConexaoDoContexto();

            /*pstm = conn.prepareStatement(
                    "INSERT INTO veiculo(id,proprietarioID,marca,modelo,ano,placa) VALUES (?, ?, ?, ?, ?, ?)");
            
            pstm.setLong(1, veiculo.getId());
            pstm.setLong(2, veiculo.getProprietarioID());
            pstm.setString(3, veiculo.getMarca());
            pstm.setString(4, veiculo.getModelo());
            pstm.setInt(5, veiculo.getAno());
            pstm.setString(6, veiculo.getPlaca());
            
            */
            String inserir;
            inserir = "INSERT INTO veiculo(id,proprietarioID,marca,modelo,ano,placa) "
             + "VALUES ("
             + veiculo.getId()+","
             + veiculo.getProprietarioID()+","
             + veiculo.getMarca()+","
             + veiculo.getModelo()+","
             + veiculo.getAno()+","
             + veiculo.getPlaca()+"";
            
            pstm.executeUpdate(inserir);

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

           /* pstm.setString(1, cliente.getCpf());
            pstm.setString(2, cliente.getNome());
            pstm.setString(3, cliente.getRg());
*/
            pstm.executeUpdate();






        } catch (SQLException ex) {

            throw new CreateDaoException("Não foi possivel realizar a transação", ex);

        } finally {

            conexao.realseAl(conn, pstm);

        }
    }
}

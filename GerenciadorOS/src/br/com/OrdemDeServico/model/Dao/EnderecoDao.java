/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.OrdemDeServico.model.Dao;
import br.com.OrdemDeServico.model.entity.Endereco;
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
public class EnderecoDao {
    Conexao conexao;
    public EnderecoDao(){
    conexao = new Conexao();
    
    }
      public void cadastrar(Endereco endereco) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset= null;
        
        

        try {
            
            conexao.inicioDaTransacao();
            
          
            conn=conexao.getConexaoDoContexto();
            
            
            
            
            
            pstm = conn.prepareStatement("INSERT INTO endereco(logradouro, complemento, numero, bairro, cidade, uf, cep ) VALUES ( ?, ?, ?, ?, ?, ?, ?)"
                    , PreparedStatement.RETURN_GENERATED_KEYS);         
            
            
            
            pstm.setString(1, endereco.getLogradouro());
            pstm.setString(2, endereco.getComplemento());
            pstm.setInt(3, endereco.getNumero());
            pstm.setString(4, endereco.getBairro());
            pstm.setString(5, endereco.getCidade());
            pstm.setString(6, endereco.getUf());
            pstm.setString(7, endereco.getCep());
            pstm.executeUpdate();
            
            rset = pstm.getGeneratedKeys();
            
           if(rset.next()){
              endereco.setId(rset.getInt(1));
           
           
           }
            
            conexao.fechaTransacao();
            

        } catch (SQLException ex) {

            throw new CreateDaoException("Não foi possivel realizar a transação" + endereco, ex);

        } finally {

            conexao.realseAll(conn, pstm,rset);

        }       
    
}
}
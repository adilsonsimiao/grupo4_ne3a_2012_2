/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adilson
 */
public class Conexao {
    
    
 // Para recuperar as transações que estao sendo executadas no memonto que acontecer algum erro;   
 private static final ThreadLocal<Connection> contexto = new ThreadLocal<Connection>();
    /**
     * Variavel de conexao
     */
    private Connection conn = null;
    /**
     * Variavel do Driver
     */
    private String driver;
    /**
     * Variavel que guarda o valor do usuario
     */
    private String usuario;
    /**
     * Variavel que guarda o valor da senha
     */
    private String senha;
    /**
     * Variavel que guarda o valor da string de conexao
     */
    private String endereco;

    /**
     * Construtor default
     */
    public Conexao() {
        driver = "com.mysql.jdbc.Driver";
        usuario = "root";
        senha = "";
        endereco = "jdbc:mysql://localhost:3306/ordemDeServico";
    }

    /**
     * Cria e retorna a conexao do driver JDBC ao banco de dados
     */
    public Connection getConnection() {
        try {
            Class.forName(this.driver);
            conn = DriverManager.getConnection(endereco, usuario, senha);
        } catch (ClassNotFoundException erro) {
            System.out.println("Falha ao carregar o driver JDBC/ODBC." + erro);
            return null;
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            return null;
        } catch (Exception erro) {
            erro.getMessage();
            System.out.println("Nao foi possivel efetuar a conexao!");
            return null;
        }
        return conn;
    }

    public void realse(PreparedStatement pstm) {

        if (pstm == null) {
            return;
        }
        try {
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // metodo para informar a classe conexao que esta acontecendo  uma transaçao 
    public void inicioDaTransacao() throws SQLException{
    Connection con = getConnection();
    con.setAutoCommit(false);
    contexto.set(con);   
    }
    // metodo para retorna a transaçao fechada
    public void fechaTransacao() throws SQLException{
    commit(getConexaoDoContexto());
    
    }
    //metodo para gravar os dados no banco 
    public void commit(Connection conn) throws  SQLException{
    
    conn.commit();
    
    }
    public Connection getConexaoDoContexto()throws SQLException{
    Connection con= contexto.get();
     if(con == null) {
            throw  new SQLException("Transação invalida");
        }
     if(con.isClosed()) {
            throw  new SQLException("Conexao esta fechada");
        }
     return contexto.get();
    }
    public void realesarTransacao()throws SQLException{
    Connection con =getConexaoDoContexto();
    realse(con);
    contexto.remove();
    
    }
    

    public void realse(Connection conn) {
           
        if (conn == null) {
            return;
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
       public void realse(ResultSet rest) {

        if (rest == null) {
            return;
        }
        try {
            rest.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
       
          public void realseAl(Connection conn,PreparedStatement pstm) {

             realse(conn);
             realse(pstm);
    }
          public void realseAll(Connection conn,PreparedStatement pstm, ResultSet rest) {

             realse(conn);
             realse(pstm);
             realse(rest);
    }
         
}

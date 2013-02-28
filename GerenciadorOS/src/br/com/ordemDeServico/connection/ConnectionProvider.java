package br.com.ordemDeServico.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionProvider {
    private static Connection currentConnection= null;

    public static Connection getConection(){
        if(currentConnection == null){
            try {
                currentConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ordemDeServico", "root", "");
                currentConnection.setAutoCommit(false);
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("Não consegui criar uma conexão para o DAO", ex);
            }
        }
        return currentConnection;
    }

    @Override
    protected void finalize() throws Throwable {
        currentConnection.close();
    }



}

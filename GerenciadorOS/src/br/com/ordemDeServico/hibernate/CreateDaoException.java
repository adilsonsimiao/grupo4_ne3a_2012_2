/*
 * To change this template, choose Tools | Templates
 *** and open the template in the editor.
 */
package br.com.ordemDeServico.hibernate;

/**
 *
 * @author adilson
 */
public class CreateDaoException extends RuntimeException {

    public CreateDaoException() {
    }

    public CreateDaoException(String message) {
        super(message);
    }

    public CreateDaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreateDaoException(Throwable cause) {
        super(cause);
    }

    public CreateDaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}

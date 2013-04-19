/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ofiSys.annotations;

import java.awt.Color;

/**
 *
 * @author lgvalentin
 */
public enum Colors {
    WHITE(Color.WHITE),
    BLACK(Color.BLACK),
    RED(Color.RED),
    GREEN(Color.GREEN),
    BLUE(Color.BLUE);
        
    private Color color;
    private Colors(Color c){
        this.color = c;
    }
    
    public Color getColor(){
        return this.color;
    }  
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author JuanCarlos
 */
public class Token {
    
    private int col;
    private int row;
    private String cadena;
   
    
    public Token(int col, int row, String cadena ) {
        this.col = col;
        this.row = row;
        this.cadena = cadena;
        
    }
    
    public Token(){
        
    }
  
    public int getCol() {
        return (this.col)+1;
    }
    
    public int getRow() {
        return (this.row)+1;
    }
    
    public String getCadena() {
        return this.cadena;
    }
    
    public void setCadena(String c) {
        cadena = c;
    }
    
    
}

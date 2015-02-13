/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.File;

/**
 *
 * @author JuanCarlos
 */
public class CrearFlex {

    private static String path= "src\\clases\\ArchivoFlex.flex";
    /**
     * @param args the command line arguments
     */
    
    public void generarFlex(String path){
     File file = new File(path);
     JFlex.Main.generate(file);
    
    
    }
    
    public static void main(String[] args) {
        CrearFlex c = new CrearFlex();
        c.generarFlex(path);
   
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import java.io.File;
import java.io.FileReader;
import java_cup.parser;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;


/**
 *
 * @author JuanCarlos
 */
public class CrearCup {
    
    public static void main(String[] args) throws FileNotFoundException {
     
        try {
            String opciones[] = new String[5];
            //Seleccionamos la opción de dirección de destino
            opciones[0] = "-destdir";
            //Le damos la dirección
            opciones[1] = "src\\clases\\";
            //Seleccionamos la opción de nombre de archivo
            opciones[2] = "-parser";
            //Le damos el nombre que queremos que tenga
            opciones[3] = "ParserSintactico";
            //Le decimos donde se encuentra el archivo .cup
            opciones[4] = "src\\clases\\AnaSintactico.cup";
            
            java_cup.Main.main(opciones);
        } catch (IOException ex) {
            Logger.getLogger(CrearCup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CrearCup.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
}

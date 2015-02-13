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
public class Orden {
    
    String idioma;
    String estacion;
    
    public Orden(String idioma, String estacion) {
        this.idioma = idioma;
        this.estacion = estacion;
        Traductor t = new Traductor(this);
        t.traduce(this);
    }
    
    

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    
   
}

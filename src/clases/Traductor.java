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
public class Traductor {
    
    
    String auxiliar;
    public static String resultado;
    String es;
    Orden orden;
    public static String idioma;
    
    

    public Traductor(Orden orden) {
        this.orden = orden;
    }

    public Traductor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String getResultado() {
        return resultado;
    }

    public static void setResultado(String resultado) {
        Traductor.resultado = resultado;
    }

    public static String getIdioma() {
        return idioma;
    }

    public static void setIdioma(String idioma) {
        Traductor.idioma = idioma;
    }

    
   

    public String getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(String auxiliar) {
        this.auxiliar = auxiliar;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }
  
    
    public String traduce( Orden e ){
        auxiliar=e.getIdioma();
        es=e.getEstacion();
        if (auxiliar.equals("Dothraki")) {
            idioma="Dothraki";
            if(es.equals("invierno")){
                resultado="aheshke";
                System.out.println(" TRADUCCION ESPAÑOL-DOTHRAKI : aheshke");
                
            }
            
             if(es.equals("verano")){
                resultado="vorsaska";
                System.out.println("TRADUCCION ESPAÑOL-DOTHRAKI : vorsaska");
               
            }
             
            if(es.equals("primavera")){
                resultado="eyelke";
                System.out.println("TRADUCCION ESPAÑOL-DOTHRAKI : eyelke");
            }
             
            if(es.equals("otoño")){
                resultado="arthasat";
               System.out.println("TRADUCCION ESPAÑOL-DOTHRAKI : arthasat");
            }
            
        }else{
                idioma="Valyrio";
               if(es.equals("invierno")){
                resultado="sonar";
                System.out.println("TRADUCCION ESPAÑOL-VALYRIO : sonar");
            }
            
             if(es.equals("verano")){
                resultado="jaedos";
               System.out.println("TRADUCCION ESPAÑOL-VALYRIO : jaedos");
            }
             
            if(es.equals("primavera")){
                resultado="kios";
                System.out.println("TRADUCCION ESPAÑOL-VALYRIO : kios");
              
            }
             
            if(es.equals("otoño")){
                resultado="ropagon";
                System.out.println("TRADUCCION ESPAÑOL-VALYRIO : ropagon");
            }
         
        
        }
     
            return resultado;
    
    }
    
    
    
}

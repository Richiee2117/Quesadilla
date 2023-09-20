/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.quesadilla.negocio;

/**
 *
 * @author USER
 */
public class Operacion {
    
    public boolean esPalidromo (String frase){
        
        frase = frase.toLowerCase().replace("í","i").replace(" ", "").replace(",","").replace("!","").replace("¡","").replace("ó","o").replace("á","a").replace("í","i");
       
        char [] letras = frase.toCharArray();
        
        String reversa = "";
        for (int a = letras.length-1;a>=0;a--){
            reversa += letras[a];
        }
      return frase.equals(reversa);
              
    }
    
    
    
}

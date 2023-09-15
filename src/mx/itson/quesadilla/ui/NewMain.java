/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.quesadilla.ui;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
     System.out.println("Ingrese el texto a evaluar: ");
    Scanner scanner = new Scanner (System.in);
    String oracion = scanner.nextLine();
    String nuevaOracion = oracion.replace("(", "").replace(")", "").replace("-", "").replace(" ", "");
       String [] separado= nuevaOracion.split(",");
        int guaymas =0;
        int hmo =0 ;
        int tijuana=0;
        int desconocido =0;
             for (String t : separado){
             
                 if (t.startsWith("622")){
                    guaymas++;
                 }else if (t.startsWith("662")){
                 hmo++;
                 
                 }else if (t.startsWith("664")){
                 
                 tijuana++;
                 }else{
                 desconocido++;
                    
                     
                 }
     
            
        }
        
  System.out.println("La cantidad de numeros de Guaymas son: "+guaymas);
     System.out.println("La cantidad de numeros de Tijuana son: "+tijuana);
     System.out.println("La cantidad de numeros de Hermosillo son: "+hmo);
     System.out.println("La cantidad de numeros desconocidos son: "+desconocido);
        
      
/*
    boolean estaUsada = oracion.startsWith("a");
    
     if (estaUsada){
        System.out.println("inicia con a");
    
    }else{
        System.out.println("No inicia con a");
    }
        
        if (oracion.startsWith("a")) {
            System.out.println("Inicia con a");
        } else {
            System.out.println("No inicia con a");
        }
    */
        
    
    
    
    }
    
}

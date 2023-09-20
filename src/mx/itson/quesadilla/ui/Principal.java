/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.quesadilla.ui;

import java.util.Scanner;
import mx.itson.quesadilla.negocio.Operacion;

/**
 *
 * @author USER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Ingrese el texto a evaluar: ");
    Scanner scanner = new Scanner (System.in);
    String oracion = scanner.nextLine();
    /*
    char[] arrayChar = oracion.toCharArray();
    for (char a : arrayChar){
        System.out.println(a);
    
    }*/
        //System.out.println(oracion.toUpperCase().trim());
        //System.out.println(oracion.trim());
        
        
        Operacion operacion = new Operacion();
      
      if(operacion.esPalidromo(oracion)){
      System.out.println(oracion);   
      System.out.print("Es palindromo");
      } else{
      System.out.print("No es palindromo");
      }
      
        
            
            
        
            
    }
    
}

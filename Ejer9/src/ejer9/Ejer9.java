/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer9;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Ejer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba palabra: ");
        String pal= leer.nextLine();
        
        if(pal.substring(0,1).equalsIgnoreCase("a")){
            System.out.println("Correcto");
            
        }else{
            System.out.println("Incorrecto");
            
        }
        
    }
    
}

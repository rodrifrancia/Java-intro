/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(System.in);
        System.out.println("Escriba frase: ");
        String frase= leer.nextLine();
        int longi= frase.length();
        if (longi==8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}

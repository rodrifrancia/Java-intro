/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase= leer.nextLine();
        System.out.println(frase);
        System.out.println("frase en mayuscula");
        System.out.println(frase.toUpperCase());
        System.out.println("frase en minusculas");
        System.out.println(frase.toLowerCase());
    }
    
}

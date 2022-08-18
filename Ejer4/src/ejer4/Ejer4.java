/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese grados: ");
        int g= leer.nextInt();
        
        int f= 32 + (9 * g / 5);
        System.out.println("farenheit: "+f);
    }
    
}

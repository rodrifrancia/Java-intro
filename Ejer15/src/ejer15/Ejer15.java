/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer15;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Ejer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Dimension del vector: ");
        int n= leer.nextInt();
        int[] vector= new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento ["+i+"]");
            vector[i]= leer.nextInt();
        }
        
        for (int i = n-1; i >= 0; i--) {
            System.out.print(" ["+vector[i]+"] ");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer16;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Ejer16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Dimension del vector: ");
        int n= leer.nextInt();
        int vector[]= new int[n];
        
        for(int i=0; i<n; i++){
            System.out.println("Elemento ["+i+"]");
            vector[i]= leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("["+i+"]"+vector[i]);
        }
        System.out.println("\nIngrese numero a buscar: ");
        int buscar= leer.nextInt();
        int posi = 0;
        int cont=0;
        for (int i = 0; i < n; i++) {
            if(buscar==vector[i]){
            posi=i;
            cont++;
            }
        }
        System.out.println("El numero esta en la posicion: "+posi+" y se repite: "+cont+" veces");
    }
       
}

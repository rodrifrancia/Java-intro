/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer10;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese limite: ");
        int n= leer.nextInt();
        int suma=0;
        while (suma<=n){
            System.out.println("Ingrese un numero: ");
            int num= leer.nextInt();
            suma=suma+num;
            
        }
        System.out.println("La suma es: "+suma);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer5;

import static java.lang.Math.round;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int num= leer.nextInt();
        System.out.println("El doble es: "+num*2);
        System.out.println("El triple es: "+num*3);
        System.out.println("La raiz cuadrada es: "+round(Math.sqrt(num)));
    }
    
}

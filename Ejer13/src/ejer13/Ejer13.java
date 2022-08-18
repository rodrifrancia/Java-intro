/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer13;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Ejer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese dimension del cuadrado: ");
        int dim= leer.nextInt();
        dim=dim-1;
        for (int i = 0; i <= dim; i++) {
            for (int j = 0; j <= dim; j++) {
                
                if(i>0 && i<dim && j>0 && j<dim){
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
    }
    
}

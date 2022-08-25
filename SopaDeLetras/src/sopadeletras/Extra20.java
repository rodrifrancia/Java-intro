/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopadeletras;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Extra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Dimension vector: ");
        int dim= leer.nextInt();
        int[] vector=crearVector(dim);
        cargarVector(vector,dim);
        mostrarVector(vector,dim);
    }
        public static int[] crearVector(int dim){
        int[] vector= new int[dim];
        return vector;
         }
        
        public static int[] cargarVector(int [] vector,int dim){
            for (int i = 0; i < dim; i++) {
                vector[i]= (int)(Math.random()*10);
            }
        return vector;
        }
        
        public static void mostrarVector(int []vector,int dim){
            for (int i = 0; i < dim; i++) {
                System.out.println(vector[i]+"["+i+"]");
            }
        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class JavaApplication3 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void ordenarVec(int[] vect,int dim){
    int aux;
        for (int k = 1; k < dim; k++) {
            for (int i = 0; i < dim-k; i++) {
            if(vect[i]>vect[i+1]){
            aux=vect[i];
            vect[i]=vect[i+1];
            vect[i+1]=aux;
            }
            }
        }
    }
    
    public static void imprimirVec(int[]vector, int di){
        
    for (int i = 0; i < di; i++) {
            System.out.print("["+vector[i]+"]"+" ");
        }
        System.out.println("");
    }
    
    public static void imprimirOrdenado(int[]vector,int di){
    
        int dimension=vector.length;
        ordenarVec(vector,dimension);
        imprimirVec(vector,dimension);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication3 e= new JavaApplication3();
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Escriba dimension del vector: ");
        int dim= leer.nextInt();
        //vector
        int[] vector= new int[dim];
        
        for (int i = 0; i < dim; i++) {
            System.out.println("Posicion ["+i+"]");
            vector[i]= leer.nextInt();
        }
        e.imprimirVec(vector,dim);
        e.ordenarVec(vector,dim);
        e.imprimirVec(vector,dim);
        /*System.out.println("Escriba fila: ");
        int fil= leer.nextInt();
        System.out.println("Escriba columna: ");
        int col= leer.nextInt();
        int[][] matriz= new int[fil][col];
        
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Escriba posicion ["+i+"]["+j+"]");
                matriz[i][j]= leer.nextInt();
            }
        }
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }*/
    }
    
}

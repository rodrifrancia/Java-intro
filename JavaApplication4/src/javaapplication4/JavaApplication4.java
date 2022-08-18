/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Rodrigo
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []vector = new int[5];
        
        for (int i = 0; i < 5; i++) {
            vector[i]= i+3;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("["+vector[i]+"]");
        }
    }
    
}

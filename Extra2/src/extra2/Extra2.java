/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

/**
 *
 * @author Rodrigo
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A=10;
        int B=20;
        int C=30;
        int D=40;
        
        System.out.println("A= "+A);
        System.out.println("B= "+B);
        System.out.println("C= "+C);
        System.out.println("D= "+D);
        
        int aux=A;
        A=D;
        D=B;
        B=C;
        C=aux;
        System.out.println("\nNuevos valores:");
        System.out.println("A= "+A);
        System.out.println("B= "+B);
        System.out.println("C= "+C);
        System.out.println("D= "+D);
    }
    
}

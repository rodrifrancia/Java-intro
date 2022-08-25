/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer17;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Ejer17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("dimension vector: ");
        int n= leer.nextInt();
        int []vector= new int[n];
        int num,cont1,cont2,cont3,cont4,cont5;
        cont1=cont2=cont3=cont4=cont5=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero: ");
            vector[i]= leer.nextInt();
            if (vector[i]<100000 && vector[i]>9999){
                System.out.println("El numero es de 5 cifras");
                cont5++;
            } else if(vector[i]<10000&&vector[i]>999){
                System.out.println("El numero es de 4 cifras");
                cont4++;
            } else if (vector[i]<1000&&vector[i]>99){
                System.out.println("El numero es de 3 cifras");
                cont3++;
            } else if(vector[i]<100&&vector[i]>9){
                System.out.println("El numero es de 2 cifras");
                cont2++;
            } else if(vector[i]>=0&&vector[i]<=9){
                System.out.println("El numero es de 1 cifra");
                cont1++;
            }
            
        }
            System.out.println("Numeros de 1 cifra: "+cont1);
            System.out.println("Numeros de 2 cifra: "+cont2);
            System.out.println("Numeros de 3 cifra: "+cont3);
            System.out.println("Numeros de 4 cifra: "+cont4);
            System.out.println("Numeros de 5 cifra: "+cont5);
        
    }
    
}

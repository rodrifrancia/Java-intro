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
public class NuevaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num= leer.nextInt();
        if (comprobar(num)==false){
            System.out.println("El numero es primo");
        }else{
            System.out.println("No es primo");
        }
    }
    public static boolean comprobar(int n){
        int cont=0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0)
                cont++;
        }
        return (cont!=2);
        
       
    }
}

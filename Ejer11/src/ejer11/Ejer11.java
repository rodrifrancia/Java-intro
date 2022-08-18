/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer11;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Ejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("numero 1: ");
        int num1= leer.nextInt();
        System.out.println("numero 2: ");
        int num2= leer.nextInt();
        int op;
        char respu='n';
        do{
        System.out.println("Menu");
        System.out.println("");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Salir");
        op= leer.nextInt();
        switch(op){
            case 1: System.out.println("La suma es: "+(num1+num2));
            break;
            case 2: System.out.println("La resta es: "+(num1-num2));
            break;
            case 3: System.out.println("La multiplicacion es: "+(num1*num2));
            break;
            case 4: System.out.println("La division es: "+(num1/num2));
            break;
            case 5: System.out.println("Seguro que desea Salir S/N");
            
        respu = leer.next().charAt(0);
            leer.nextLine();
            if(respu=='n' || respu=='N'){
            break;
            }
        }
        } while(respu=='n');
        
    }
    
}

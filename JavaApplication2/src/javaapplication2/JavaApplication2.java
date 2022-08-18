/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        /*System.out.println("Ingrese una opcion");
        System.out.println("op 1");
        System.out.println("op 2");
        System.out.println("op 3");
        int num= leer.nextInt();
        switch (num){
            case 1: System.out.println("Elegiste el producto 1");
            break;
            case 2: System.out.println("Elegiste el producto 2");
            break;
            case 3: System.out.println("Elegiste el producto 3");
            break;
            default: System.out.println("Opcion incorrecta");
        }*/
        /*int nota= 1;
        while(nota>0 && nota<10){
        
            System.out.println("Ingrese una nota");
            nota=leer.nextInt();
        }*/
        /*int num;
        int i=0;
        do{
            System.out.println("Ingrese un numero entre 1 y 20: ");
            num= leer.nextInt();
            
            for (int j = 0; j < num+1; j++) {
                if(j==0){
                    System.out.print(num+" : ");
                }else{
            System.out.print("*");
                    
                }
        }
            i++;
            System.out.println(" ");
        }while (num>=1 && num<=20 && i<4);*/
        /*  a e i o u
            @ # $ % *   */
        
        System.out.println("Ingrese una frase: ");
        String fras2="";
        String frase= leer.nextLine();
        int longi= frase.length();
        for (int i = 0; i < longi; i++) {
           char x= frase.charAt(i);
            switch (x){
                case 'a': x='@';
                break;
                case 'e': x='#';
                break;
                case 'i': x='$';
                break;
                case 'o': x='%';
                break;
                case 'u': x='*';
                break;
            }
            System.out.print(Character.toString(x));
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class JavaIntro01 {
    int numero;
    boolean logico;
    String cadena = "Hola rodriguito";
    float deci;
    char character;
    
    public void mostrarMensaje(){
        System.out.println(""+cadena);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaIntro01 e= new JavaIntro01();
        Scanner leer= new Scanner(System.in);
        //double doble;
        //String cad= leer.nextLine();
        
       // System.out.println("Hola mundo");
       // System.out.println("Espero que no ande lento");
       // e.mostrarMensaje();
       // doble= leer.nextDouble();
       // System.out.println(""+doble);
         
      System.out.println("Ingresa tu edad: ");
          int edad = leer.nextInt();
      System.out.println("Ingresa tu nombre: ");
        String nombre= leer.next();
        System.out.println("ingrese una letra");
        char n= leer.next().charAt(0);
       
      
        
       /* System.out.println("numero 1: ");
        int num1= leer.nextInt();
        System.out.println("numero 2: ");
        int num2= leer.nextInt();
        if (num1>25 && num2>25){
            System.out.println("ambos son mayor a 25");
        }else if(num1>25 || num2>25 ){
                    System.out.println("hay uno mayor a 25");
                            }
        else{
            System.out.println("ninguno es mayor a 25");
        }*/
        }
    }
    


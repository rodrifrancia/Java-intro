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
public class SopaDeLetras {

   
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        String[][] matriz= new String[20][20];
        String pal;
        int longi,ubi;
        int cont=0;
        do{
        System.out.println("Ingrese 5 palabras: ");
        pal=leer.nextLine();
        longi= pal.length();
        ubi=(int)(Math.random()*11);
        ubicarPalabra(matriz,pal,longi,ubi);
        cont++;
        }while(longi>=3 && longi<=5 &&cont<5);
        if(cont==5){
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        }else{
            System.out.println("Intente otra vez. \n Las palabras tienen que tener \n entre 3 y 5 caracteres");
        }
}
    public static void ubicarPalabra(String[][]matriz ,String pal,int longi, int ubi){
         int cont=1;
         
            for (int i = 0; i < longi; i++) {
                matriz[ubi][i]= pal.substring(i,cont);
                cont++;
        }
      
    }
    public static void llenarMatriz(String [][] m){
    
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(m[i][j]==null) {
                    int val= (int)(Math.random()*9);
                    m[i][j]=(String.valueOf(val));
                }
                } 
        }
    
    }
    public static void mostrarMatriz(String[][]matriz){
         for (int i = 0; i < 20; i++) {
             for (int j = 0; j < 20; j++) {
                 System.out.print(matriz[i][j]+" ");
             }
             System.out.println("");
        }
    }
}
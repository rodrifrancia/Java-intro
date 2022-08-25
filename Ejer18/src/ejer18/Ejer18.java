/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer18;

/**
 *
 * @author Rodrigo
 */
public class Ejer18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][]matriz= new int[4][4];
        
        matriz[0][0] = 2;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = 2;
        matriz[2][0] = -4;
        matriz[2][1] = -2;
        matriz[2][2] = 0;
        /*for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]= (int)(Math.random()*10+1);
            }
        }*/
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
         System.out.println("");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
       mAntiSimetrica(matriz);
    }
    
    public static void mAntiSimetrica(int[][] matriz){
        boolean conf = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(matriz[i][j] == -matriz[j][i]){
                     conf=true;
                }
                
            }
        }
        if (conf){
            System.out.println("Es una matriz antisimetrica");
        }else{
            System.out.println("No es antisimetrica");
        }
        
    
    }
    
}

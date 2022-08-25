/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra7;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */

/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
*/
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Cantidad de numeros: ");
        int n= leer.nextInt();
        int may,suma;
        int num;
        int cont=0;
        suma=may=0;
        int men=1;
        double prom;
       /* while(cont<n ){
            System.out.println("Ingrese un numero: ");
            num= leer.nextInt();
            if(num>0){
            suma=suma+num;
            if(num>may){
            may=num;}
            if(num<men){
            men=num;}
            }else{
                System.out.println("Ingrese numeros mayores a cero");
            }
            
            
            cont++;
        }*/
       do{
           System.out.println("Ingrese un numero: ");
           num=leer.nextInt();
           if(num>0){
           suma=suma+num;
           if(num>may){
            may=num;}
            if(num<men){
            men=num;}
           }else{
               System.out.println("Ingrese numeros mayores a CERO");
           }
           cont++;
       }while(cont<n);
       
        prom=suma/n;
        System.out.println("\n El mayor es: "+may);
        System.out.println("\n El menor es: "+men);
        System.out.println("\n El promedio es: "+prom);
        }
    }
    


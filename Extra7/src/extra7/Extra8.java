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
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        int cont, contP, contI;
        cont = contP = contI = 0;
        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            if(num>0){
            if (num % 2 == 0) {
                contP++;
            } else {
                contI++;
            }

            cont++;
            }else{
            break;
            }
        } while (num % 5 != 0);
        
        System.out.println("Numeros pares: "+contP);
        System.out.println("Numeros impares: "+contI);
        System.out.println("Cantidad de numeros: "+cont);
        System.out.println("FIN");
    }
    
}

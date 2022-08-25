/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer14;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
/*
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
public class Ejer14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese euros: ");
        int euro= leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese cambio: ");
        String cambio= leer.nextLine();
        
        cambiarMoneda(euro,cambio);
    }
    
    public static void cambiarMoneda(double euro,String cambio){
        double cambiaso = 0;
        if (cambio.equalsIgnoreCase("libra")) {
            cambiaso = (euro*0.86);
        } else if (cambio.equalsIgnoreCase("dolar")) {
            cambiaso = euro * 1.28611;
        } else if (cambio.equalsIgnoreCase("yen")) {
            cambiaso = euro * 129.852;
      }
        
        System.out.println("El cambio es: " + cambiaso);
    }
    
}

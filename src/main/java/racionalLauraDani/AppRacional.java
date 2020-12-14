/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racionalLauraDani;

import java.text.DecimalFormat;

/**
 *
 * @author daniel
 */
public class AppRacional {

    public static void main(String[] args) {
    	
    	//Declaración de objetos
        Racional z = new Racional(4, 5);
        Racional k = new Racional(3, 4);

        //Creación de objeto random
        Racional random = new Racional();

        random = random.aleatorio();

        //Impresión de valores de objetos
        z.imprimirConsola();
        k.imprimirConsola();
        random.imprimirConsola();

        //Comparación de racionales z y x
        System.out.println("¿Son los valores iguales? " + Racional.igualdad(z, k));
        
        //Suma de z y k
        z.suma(k);

        System.out.println("La suma de z y k es: " + z.toString());
        
        //División de los valores actualizados de z y k
        Racional div = Racional.division(k, z);
        
        System.out.println("El resultado de la división es: " + div.toString());

    }
}

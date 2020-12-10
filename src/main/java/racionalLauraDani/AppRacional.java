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
        Racional z = new Racional(4, 5);
        Racional k = new Racional(3, 4);

        Racional random = new Racional();

        random = random.aleatorio();

        z.imprimirConsola();
        k.imprimirConsola();
        random.imprimirConsola();

        System.out.println("¿Son los valores iguales? " + Racional.igualdad(z, k));

        System.out.print("La suma de z y k es: ");
        z.suma(k);

    }
}

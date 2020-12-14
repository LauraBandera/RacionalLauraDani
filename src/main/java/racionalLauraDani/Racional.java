/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racionalLauraDani;

import java.util.Random;

/**
 *
 * @author laura
 */
public class Racional {

	//Atributos de la clase
    private int a /*numerador*/, b /*denominado*/;
    static Random aleatorio = new Random();

    //constructor por defecto
    public Racional() {
        this.a = 1;
        this.b = 1;
    }

    //Construtor parametrizado
    public Racional(int a, int b) {
        this.a = a;
        if (b == 0) {
            this.b = 1;
        } else {
            this.b = b;
        }
    }

    //Métodos getters y setters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        if (b == 0) {
            this.b = 1;
        } else {
            this.b = b;
        }
    }

    //Impresión por consola
    public void imprimirConsola() {
        System.out.println("Número racional " + a + "/" + b);
    }

    //Método autogenerado toString
    @Override
    public String toString() {
        return a + "/" + b;
    }

    //Método suma
    public void suma(Racional x) {
        if (this.b == x.b) {
            this.a = this.a + x.a;
        } else {
            this.a = this.a * x.b + this.b * x.a;
            this.b = this.b * x.b;
        }
    }

    //Método resta
    public void resta(Racional x) {
        if (this.b == x.b) {
            this.a = this.a - x.a;
        } else {
            this.a = this.a * x.b - this.b * x.a;
            this.b = this.b * x.b;
        }
    }

    //Método producto
    public void producto(Racional x) {
        this.a = this.a * x.a;
        this.b = this.b * x.b;
    }

    //Método división
    public static Racional division(Racional x, Racional z) {
    	Racional div = new Racional ();
        div.a = z.a * x.b;
        div.b = z.b * x.a;
        
        return div;
    }

    //Método para comprobar la igualdad en los valores
    public static boolean igualdad(Racional x, Racional y) {
        if (x.a * y.b == x.b * y.a) {
            return true;
        }
        return false;
    }

    //Método de creación un objeto aleatorio
    public Racional aleatorio() {
        int a, b;
        do {
            a = aleatorio.nextInt();
        }while(a == 0);
        do {
            b = aleatorio.nextInt();
        }while(b == 0);
        Racional r = new Racional(a,b);
        return r;
    }

}

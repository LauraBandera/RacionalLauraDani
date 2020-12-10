/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racionalLauraDani;

/**
 *
 * @author laura
 */
public class Racional {

    private int a /*numerador*/, b /*denominado*/;

    public Racional() {
        this.a = 1;
        this.b = 1;
    }

    public Racional(int a, int b) {
        this.a = a;

        if (b == 0) {
            this.b = 1;
        } else {
            this.b = b;
        }
    }

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

    public void imprimirConsola() {
        System.out.println("Número racional " + a + "/" + b);
    }

    @Override
    public String toString() {
        return a + "/" + b;
    }

    public void suma(Racional x) {

        if (this.b == x.b) {
            this.a = this.a + x.a;

        } else {

            this.a = this.a * x.b + this.b * x.a;

            this.b = this.b * x.b;

        }

    }

}

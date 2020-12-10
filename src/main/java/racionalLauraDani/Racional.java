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
        }
        
     

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}

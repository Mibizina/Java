/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manomboka;

/**
 *--DIVISION PAR ZERO
 * @author Mihary
 */
public class IEEE {
    public static void main(String [] args)
    {
        float x = 1e30f;
        float y = x*x;
        System.out.println(x+ "au carré = " + y);
        float zero = 0.0f;
        System.out.println("La division de "+ x + "par 0 donne "+ (x/zero));
    }
}

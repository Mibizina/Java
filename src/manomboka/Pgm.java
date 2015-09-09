/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manomboka;

/**
 *--------TEST UNICODE----------
 * @author Mihary
 */
public class Pgm {
    public static void main(String[] args) {
        // TODO code application logic here
    final char carDeb = 100, carFin = 300;
    char c;
    for (c=carDeb; c<carFin;c++)
    {
        System.out.print((int) c + "-");
        System.out.print( c + "  ");
    }
    }
}

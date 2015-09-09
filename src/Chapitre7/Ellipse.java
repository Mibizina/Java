/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre7;

/**
 *
 * @author Mihary
 */
public class Ellipse {
public static void main (String args[])
{
    System.out.println(somme(2, 8, 9));
    System.out.println(somme());
    System.out.println(somme(3));
}
static int somme(int ... valeurs) //notation ... ellipse nombre d'arguments variable
{
    int s = 0;
    for (int v : valeurs)
        s += v;
    return s;
}
}

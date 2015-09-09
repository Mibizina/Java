/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre9;

/**
 *
 * @author Mihary
 */
public class Compte2 {
public static void main (String args[])
{
    final char car = 'e';
    String ch;
    ch = "anticonstitutionnelement";
    int nbCar = 0;
    for (int i = 0; i<ch.length();i++)
        if (ch.charAt(i) == car) nbCar++;
    System.out.println("Le mot comporte " + nbCar + " fois le caractere " +car);
    
    String ch1,ch2;
    
    ch1 = "bonjour1";
    ch2 = "bonjour";
    
    System.out.println(ch2);
    if (ch1 == ch2) System.out.println("Egales");
    else System.out.println("différentes");
}
}

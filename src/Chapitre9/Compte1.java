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
public class Compte1 {
public static void main(String args[])
{
    final char car ='e';
    int i, posCar;
    int nbCar = 0;
    String ch;
    ch="anticonstitutionnellement";
    i = 0;
    do
    {
        posCar = ch.indexOf(car,i);
        if (posCar>=0) {
            nbCar++;
            i = posCar+1;
        }
    }
    while (posCar>=0);
    System.out.println("votre mot comporte " + nbCar + " fois le caractere " + car);
}
}

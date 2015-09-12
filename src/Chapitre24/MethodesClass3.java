/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre24;

/**
 *  Access aux différentes informations relatives aux méthodes d'une classe
 * @author Mihary
 */
import java.lang.reflect.*;
public class MethodesClass3 {
    public static void main (String args[])
    {
        Pointt p = new Pointt();
        Class<?> c = p.getClass();
        Method methodes[] = c.getDeclaredMethods();
        // affichage des informations relatives aux methodes de la classe de p
        for (Method methode : methodes)
        {
            System.out.println("----- Methode de nom : " + methode.getName());
            System.out.print("- type arguments : ");
            Class<?> typeArgs [] = methode.getParameterTypes();
            for (Class<?> typeArg : typeArgs)
            {
                System.out.print(typeArg.getName() + " ");
            }
            System.out.println();
            Class<?> typeRetour = methode.getReturnType();
            System.out.println("- type valeur de retour : " + typeRetour.getName());
            System.out.println("- modificateurs : " + methode.getModifiers());
        }
        // affichage des informations relatives aux constructeurs de la classe de p
        Constructor<?> constructeurs [] = c.getDeclaredConstructors();
        for (Constructor<?> constructeur : constructeurs)
        {
            System.out.println("---- Constructeur de nom : " + constructeur.getName());
            System.out.print("- type arguments : ");
            Class<?> typeArgs[] = constructeur.getParameterTypes();
            for (Class<?> typeArg : typeArgs)
            {
                System.out.print(typeArg.getName() + " ");
            }
            System.out.println("");
            System.out.println("- modificateurs : " + constructeur.getModifiers());
        }
    }
}

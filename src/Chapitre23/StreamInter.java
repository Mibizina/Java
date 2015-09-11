/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre23;

/**
 *  Les principales méthodes intermédiaires d'un stream
 * @author Mihary
 */
import java.util.*;
import java.util.stream.*;
public class StreamInter {
    public static void main (String args[])
    {
        Integer []  tab = {2, 15, -3, 2, -5, 34, 23, 4, -8, 12};
        System.out.println("--- carres des negatifs, double des positifs");
        Stream.of(tab).map(e -> { if (e>0) return 2*e; //ici on peut aussi utilser mapToInt
        else return e*e;
        }).forEach(e -> System.out.print(e + " "));
        System.out.println("\n--  Valeurs et nombre de negatifs");
        long nb_neg = Stream.of(tab).filter(e -> e < 0).peek(e -> System.out.print(e + " ")).count();//peek applique à chaque element la methode de type Consumer fournie en argument
        System.out.println(" ** Nombre de negatifs : " + nb_neg);
        System.out.println("--- Valeurs triees ordre naturel : ");
        Stream.of(tab).sorted().forEach(e -> System.out.print(e + " "));
        System.out.println("\n--- Valeurs triees ordre naturel en parallèle, avec forEachOrdered : ");
        Stream.of(tab).parallel().sorted().forEachOrdered(e -> System.out.print(e + " "));
        System.out.println("\n--- Valeurs triees ordre inverse, sans doublons : ");
        Stream.of(tab).sorted(Comparator.reverseOrder()).distinct().forEach(e -> System.out.print(e + " ")); //impossible si int[] tab
        System.out.println();
    }
}

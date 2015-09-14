/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre25;

/**
 *  Calcul de la duree d'execution d'une partie de code
 * @author Mihary
 */
import java.time.*;
public class CalculDuree {
    public static void main (String args[])
    {
        Instant debut = Instant.now();
            // traitement fictif
        for (long i = 0; i < 1_000_000_000 ; i++) {double x = Math.random();}
        Instant fin = Instant.now();
        Duration duree = Duration.between(debut, fin);
        long duree_ms = duree.toMillis();           //duree totale en ms
        long duree_ns = duree.toNanos();            //duree totale en ns
        System.out.println("duree en ms     : " + duree_ms);
        System.out.println("duree en ns     : " + duree_ns);
        long nb_nanos = duree.getNano();            //partie en ns de la duree
        long nb_sec = duree.getSeconds();           //partie en s de la duree
        System.out.println("duree en s ns : "  + nb_sec + "s " + nb_nanos + "ns");
    }
}

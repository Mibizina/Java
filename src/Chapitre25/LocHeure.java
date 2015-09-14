/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre25;

/**
 *
 * @author Mihary
 */
import java.time.*;
public class LocHeure {
    public static void main (String args[])
    {
        LocalTime maintenant = LocalTime.now();
        System.out.println("Il est                          : " + maintenant);
        LocalTime uneHeure = LocalTime.of(23, 35);
        LocalTime uneHeure1 = LocalTime.of(23, 35, 40);
        LocalTime uneHeure2 = LocalTime.of(23, 35, 40, 15000);
        System.out.println("Une heure                       : " + uneHeure);
        System.out.println("Une heure plus precise          : " + uneHeure1);
        System.out.println("une heure encore plus precise   : " + uneHeure2);
        LocalTime dansTroisHeures = maintenant.plusHours(3);
        System.out.println("Dans 3 heures il sera           : " + dansTroisHeures);
        Duration ecart = Duration.between(maintenant, uneHeure);
        System.out.println("Difference entre ces 2 heures   : " + ecart);
        System.out.println("Difference entre ces 2 heures   : " + ecart.toHours() + "H " + ecart.toMinutes() + "mn ");
            // boucle affiche des horaires de départ, espaces de 12 mn de 14h à 16h
        System.out.println("-- Horaires de depart ---");
        LocalTime courant = LocalTime.of(14, 0);
        LocalTime fin = LocalTime.of(14, 0).plusHours(3);
        Duration increment = Duration.ofMinutes(12);
        do {
            System.out.print(courant.getHour()+ ":" + courant.getMinute() + " ");
            courant =courant.plus(increment);
        }
        while(courant.isBefore(fin));
    }
}

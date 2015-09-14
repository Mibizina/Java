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
import java.time.temporal.*;    // Pour les constantes de ChronoUnit
public class LocDate {
    public static void main (String args[])
    {
        LocalDate aujourdhui = LocalDate.now();         // date du jour
        System.out.println("Aujourd'hui     : " + aujourdhui);
        System.out.println("Nous sommes un  : " + aujourdhui.getDayOfWeek());
        System.out.println("Nous sommes le  : " + aujourdhui.getDayOfYear()+ "eme jour de l'annee");
        LocalDate unJour = LocalDate.of(2015, 3, 13);
        System.out.println("Un jour         : " + unJour);
        LocalDate leMemeJour = LocalDate.of(2015, Month.MARCH, 13);
        System.out.println("Le meme jour    : " + leMemeJour);
        LocalDate dansTroisMois = aujourdhui.plusMonths(3);
        System.out.println("Dans trois mois : " + dansTroisMois);
        System.out.println("Nous serons en  : " + dansTroisMois.getMonth());
            // calcul ecart entre aujourd'hui et unJour et differents affichages
        Period ecart = unJour.until(aujourdhui);
        System.out.println("Ecart           : " + ecart.getYears() + " annees " + ecart.getMonths()+" mois " + ecart.getDays() + " jours");
        System.out.println("Ectart en mois  : " + ecart.toTotalMonths());
        long nbJours = unJour.until(aujourdhui, ChronoUnit.DAYS);
        System.out.println("Ecart en jours  : " + nbJours);
        Period onAjoute = Period.of(1, 2, 3); // 1 an, 2mois, 3jours
        LocalDate plusTard = aujourdhui.plus(onAjoute);
        System.out.println("Plus tard       : " + plusTard);
    }
}

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
import java.time.temporal.*;
public class AjustDate {
    public static void main (String [] args)
    {
        LocalDate aujourdhui = LocalDate.now();
        LocalDate prochainLundi = aujourdhui.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println("Le prochain lundi est : " + prochainLundi);
        int annee =2015;
        LocalDate debut2015 = LocalDate.of(annee, 1, 1);
        LocalDate cinqDimanche = debut2015.with(TemporalAdjusters.dayOfWeekInMonth(5, DayOfWeek.SUNDAY));
        System.out.println("Le cinquieme dimanche de " + annee + " est le : " + cinqDimanche.getDayOfMonth()+ " "  + cinqDimanche.getMonth());
        LocalDate premJourMois = aujourdhui.with(TemporalAdjusters.firstDayOfMonth());
            // remplace LocalDate premJourMois1 = aujourdhui.withDayOfMonth(1);
        System.out.println("Premier jour de ce mois : " + premJourMois);
        LocalDate vendredi4 = aujourdhui.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.FRIDAY));
        System.out.println("Quatrieme vendredi de ce mois : " + vendredi4);
        LocalDate vendredi5 = aujourdhui.with(TemporalAdjusters.dayOfWeekInMonth(5, DayOfWeek.FRIDAY));
        System.out.println("Cinquieme vendredi de ce mois : " + vendredi5);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre25;

/**
 * La classe LocaleDateTime ne prend pas en compte le changement d'heure
 * @author Mihary
 */
import java.time.*;
public class PbDateLocale {
    public static void main (String args[])
    {
        LocalDateTime maintenant = LocalDateTime.of(2014, 3, 26, 15, 30);
        System.out.println("maintenant          = " + maintenant);
        LocalDateTime dansUnMois1 = maintenant.plusMonths(1);
        System.out.println("dans un mois        = " + dansUnMois1);
        LocalDateTime dansUnMois2 = maintenant.plusHours(31*24);
        System.out.println("dans 31 fois 24 h   = " + dansUnMois2);
    }
}

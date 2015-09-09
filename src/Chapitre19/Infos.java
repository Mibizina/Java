/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre19;

/**
 *
 * @author Mihary
 */
import javax.swing.*;
public class Infos extends JApplet{
    public void init()
    {
        String nomMois = getParameter("mois");
        String nomAnnee = getParameter("annee");
        int annee, anneeSuiv;
        System.out.println("Mois = " + nomMois);
        System.out.println("Annee = " + nomAnnee);
        annee = Integer.parseInt(nomAnnee);
        anneeSuiv = annee + 1;
        System.out.println("Annee suivante = " + anneeSuiv);
    }
}

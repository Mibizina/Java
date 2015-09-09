/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 * CREATION D'UNE FENETRE GRAPHIQUE SIMPLE
 * @author Mihary
 */
import javax.swing.*;

public class Premfen0 {
    public static void main (String args[])
    {
        System.out.println("debut main");
        JFrame fen = new JFrame();
        fen.setSize(300, 150);
        fen.setTitle("Ma premiere fenetre");
        System.out.println("avant affichage fenetre");
        fen.setVisible(true);
        System.out.println("fin main");
    }
}

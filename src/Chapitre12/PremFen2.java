/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 *
 * @author Mihary
 */

import Chapitre7.Clavier;
import javax.swing.*;
class MaFen extends JFrame
{
    public MaFen(){
    setTitle("Ma premiere fenetre");
    setBounds(50, 100, 300, 150);
    }
}
public class PremFen2 {
    public static void main (String args[])
    {
        JFrame fen = new MaFen();
        fen.setVisible(true);
        while (true) //fin sur longueur titre nulle
        {
            System.out.print("nouvelle largeur : ");
            int larg = Clavier.lireInt();
            System.out.print("nouvelle hauteur : ");
            int haut = Clavier.lireInt();
            System.out.print("nouveau titre : ");
            String tit = Clavier.lireString();
            if (tit.length() == 0) break;
            fen.setSize(larg,haut);
            fen.setTitle(tit);
        }
    }
}

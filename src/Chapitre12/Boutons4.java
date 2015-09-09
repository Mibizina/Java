/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 *  UNE CLASSE ECOUTEUR PAR OBJET BOUTON
 * @author Mihary
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fen2Btns extends JFrame 
{
    public Fen2Btns()
    {
        setTitle("2 boutons ");
        setSize(300, 200);
        monBouton1 = new JButton("Bouton A");
        monBouton2 = new JButton("Bouton B");
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        contenu.add(monBouton1);
        contenu.add(monBouton2);
        EcouteBouton1 ecout1 = new EcouteBouton1();
        EcouteBouton2 ecout2 = new EcouteBouton2();
        monBouton1.addActionListener(ecout1);
        monBouton2.addActionListener(ecout2);
    }
    class EcouteBouton1 implements ActionListener
    {
        public void actionPerformed(ActionEvent ev)
        {
            System.out.println("action sur le bouton 1");
        }
    }
    class EcouteBouton2 implements ActionListener
    {
        public void actionPerformed(ActionEvent ev)
        {
            System.out.println("action sur le bouton 2");
        }
    }
    
    private JButton monBouton1, monBouton2;
}
public class Boutons4 {
    public static void main (String args[])
    {
        Fen2Btns fen = new Fen2Btns();
        fen.setVisible(true);
    }
}

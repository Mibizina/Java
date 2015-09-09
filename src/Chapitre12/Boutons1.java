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

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Fen2Boutons extends JFrame implements ActionListener
{
    public Fen2Boutons()
    {
        setTitle("Avec 2 boutons");
        setSize(300, 200);
        monBouton1 = new JButton("Bouton A");
        monBouton2 = new JButton("Bouton B");
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        contenu.add(monBouton1);
        contenu.add(monBouton2);
        monBouton1.addActionListener(this); //la fenetre écoute monBouton1
        monBouton2.addActionListener(this); //la fenetre écoute monBouton2
    }
    public void actionPerformed(ActionEvent ev) //gestion commune à tous les boutons
    {
        System.out.println("action sur un bouton");
    }
    private JButton monBouton1, monBouton2;
}

public class Boutons1 {
    public static void main (String args[])
    {
        Fen2Boutons fen = new Fen2Boutons();
        fen.setVisible(true);
    }
}

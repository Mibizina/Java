/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 * UTILISATION METHODE GETSOURCE
 * @author Mihary
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Fen2Boutons2 extends JFrame implements ActionListener
{
    public Fen2Boutons2()
    {
        setTitle("Avec 2 boutons");
        setSize(300, 200);
        monBouton1 = new JButton ("Bouton A");
        monBouton2 = new JButton ("Bouton B");
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        contenu.add(monBouton1);
        contenu.add(monBouton2);
        monBouton1.addActionListener(this);
        monBouton2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ev)
    {
        if (ev.getSource() == monBouton1)
            System.out.println("Action sur le bouton A");
        if (ev.getSource() == monBouton2)
            System.out.println("Action sur le bouton B");
    }
    private JButton monBouton1, monBouton2;
}
public class Boutons2 {
    public static void main (String args[])
    {
        Fen2Boutons2 fen = new Fen2Boutons2();
        fen.setVisible(true);
    }
}

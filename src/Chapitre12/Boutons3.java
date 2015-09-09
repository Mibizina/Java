/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 *  METHODE GetActionCommand
 * @author Mihary
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fen2Btn extends JFrame implements ActionListener
{
    public Fen2Btn()
    {
        setTitle("Avec deux boutons");
        setSize (300, 200);
        monBouton1 = new JButton("Bouton A");
        monBouton2 = new JButton("Bouton B");
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        contenu.add(monBouton1);
        contenu.add(monBouton2);
        monBouton1.addActionListener(this);
        monBouton2.addActionListener(this);
        monBouton1.setActionCommand("Ito ilay bokotra voalohany ");
        
    }
    public void actionPerformed(ActionEvent ev)
    {
        String nom = ev.getActionCommand();
        System.out.println("Action sur bouton " + nom);
    }
    private JButton monBouton1, monBouton2;
}
public class Boutons3 {
    public static void main (String args[])
    {
        Fen2Btn fen = new Fen2Btn();
        fen.setVisible(true);
    }
}

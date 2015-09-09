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
class Fen1Bouton1 extends JFrame implements ActionListener
{
    public Fen1Bouton1()
    {
        setTitle("Premier bouton");
        setSize(300, 200);
        monBouton = new JButton("ESSAI");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(monBouton);
        monBouton.addActionListener(this);
    }
    public void actionPerformed (ActionEvent ev)
    {
        System.out.println("action sur le bouton ESSAI");
    }
    private JButton monBouton;
}
public class Bouton2 {
    public static void main (String args[])
    {
        Fen1Bouton1 fen = new Fen1Bouton1();
        fen.setVisible(true);
    }
}

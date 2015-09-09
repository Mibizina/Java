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

class Fen1Bouton extends JFrame
{
    public Fen1Bouton()
    {
        setTitle("Premier bouton"); setSize(300, 200);
        monBouton = new JButton("ESSAI");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(monBouton);
    }
    private JButton monBouton;
}
public class Bouton1 {
    public static void main (String args[])
    {
        Fen1Bouton fen = new Fen1Bouton();
        fen.setVisible(true);
    }
}

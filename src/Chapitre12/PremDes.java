/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 * DESSINER UN TRAIT
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;

class Fen1 extends JFrame
{
    Fen1()
    {
        setTitle("Essai dessins");
        setSize(300, 150);
        pan = new Panneau1();
        getContentPane().add(pan);
        pan.setBackground(Color.yellow);
    }
    private JPanel pan;
    
}

class Panneau1 extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawLine(15, 10, 100, 50);
        }
    }
public class PremDes {
    public static void main (String args[])
    {
        Fen1 fen = new Fen1();
        fen.setVisible(true);
    }
}

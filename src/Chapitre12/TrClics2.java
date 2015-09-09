/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 *  TRACE PERMANENT DE CLICS
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ma11F extends JFrame
{
    Ma11F ()
    {
        setTitle ("Trace clics permanents");
        setSize (300, 200);
        pan = new Paneau();
        getContentPane().add(pan);
    }
    private Paneau pan;
}
class Paneau extends JPanel
{
    final int MAX = 100;
    public Paneau()
    {
        abs = new int[MAX]; ord = new int [MAX];
        nbclics = 0;
        addMouseListener (new MouseAdapter()
        {
            public void mouseClicked (MouseEvent e)
            {
                if(nbclics < MAX)
                {
                    abs[nbclics] = e.getX();
                    ord[nbclics] = e.getY();
                    nbclics++;
                    repaint();
                }
            }
        });
    }
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        for (int i = 0 ; i<nbclics ; i++)
            g.drawRect(abs[i], ord[i], 5, 5);
    }
    private int abs[], ord[];
    private int nbclics;
}

public class TrClics2 {
    public static void main (String args[])
    {
        Ma11F fen = new Ma11F();
        fen.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 * UTILISATION DE SetEnabled et isEnabled
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fe1BoutDyn extends JFrame implements ActionListener
{
    final int NBOUTONS = 5;
    public Fe1BoutDyn()
    {
        setTitle ("Activation/Desactivation");
        setSize(600, 150);
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        tabBout = new JButton[NBOUTONS];
        for (int i=0; i<NBOUTONS; i++)
        {
            tabBout[i] = new JButton("BOUTON " + i);
            contenu.add(tabBout[i]);
            tabBout[i].addActionListener(this);
        }
    }
    public void actionPerformed (ActionEvent ev)
    {
        System.out.print("Etat BOUTONS = ");
        for (int i =0; i<NBOUTONS ; i++)
        {
            System.out.print (tabBout[i].isEnabled() + " ");
            System.out.println();
            JButton source = (JButton) ev.getSource();
            System.out.println("On désactive le bouton : " + source.getActionCommand());
            source.setEnabled(false);
        }
    }
    private JButton tabBout[];
}

public class BoutDy1 {
    public static void main (String args[])
    {
        Fe1BoutDyn fen = new Fe1BoutDyn();
        fen.setVisible(true);
    }
}
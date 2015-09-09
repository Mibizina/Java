/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre13;

/**
 *  GESTION DES CHECKBOXES
 * @author Mihary
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FenCoches extends JFrame implements ActionListener
{
    public FenCoches()
    {
        setTitle("Exemple de cases a cocher");
        setSize(400, 100);
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        
        coche1 = new JCheckBox("Case 1");
        contenu.add(coche1);
        coche1.addActionListener(this);
        
        coche2 = new JCheckBox("Case 2");
        contenu.add(coche2);
        coche2.addActionListener(this);
        
        Etat = new JButton("Etat");
        contenu.add(Etat);
        Etat.addActionListener(this);
    }
    public void actionPerformed (ActionEvent ev)
    {
        Object source = ev.getSource();
        if (source == coche1) System.out.println("action case 1");
        if (source == coche2) System.out.println("action case 2");
        if (source == Etat) System.out.println("Etat CASES : " + coche1.isSelected() + " " +coche2.isSelected());
    }
    private JCheckBox coche1, coche2;
    private JButton Etat;
}

public class Cases1 {
    public static void main (String args[])
    {
        FenCoches fen = new FenCoches();
        fen.setVisible(true);
    }
}

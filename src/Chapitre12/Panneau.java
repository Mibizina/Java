/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 * CREATION D'UN PANNEAU JAUNE
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;

class Ma1Fe extends JFrame
{
    public Ma1Fe()
    {
        setTitle("Fenetre = panneau jaune");
        setSize(300, 200);
        panneau = new JPanel();
        panneau.setBackground(Color.yellow);
        getContentPane().add(panneau);
        
    }
    private JPanel panneau;
}
public class Panneau {
    public static void main (String args[])
    {
        Ma1Fe fen = new Ma1Fe();
        fen.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 *  AFFICHAGE DES COORDONNEES DES CLICS
 * @author Mihary
 */

import javax.swing.*;
import java.awt.event.*;
class MaF extends JFrame implements MouseListener
{
    public MaF()
    {
        setTitle("Gestion de clic 2.0");
        setBounds(10, 20, 300, 200);
        addMouseListener (this); //la fenetre sera son propre écouteur d'evenements souris
    }
    public void mouseClicked(MouseEvent ev) //methode gerant un clic de souris
    {
        int x = ev.getX();
        int y = ev.getY();
        System.out.println("clic au point de coordonnées " + x +" , "+ y );
    }
     public void mousePressed (MouseEvent ev) {}
     public void mouseReleased (MouseEvent ev) {}
     public void mouseEntered (MouseEvent ev) {}
     public void mouseExited (MouseEvent ev) {}
}

public class Clic2 {
    public static void main (String args[])
    {
        MaF fen = new MaF();
        fen.setVisible(true);
    }
}

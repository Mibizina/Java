/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 * GESTION DE L'EVENEMENT CLIC DANS LA FENETRE
 * @author Mihary
 */

import javax.swing.*;       //pour JFrame
import java.awt.event.*;    //pour MouseEvent et MouseListener

class MaFe extends JFrame implements MouseListener
{
    public MaFe ()          //constructeur
    {
        setTitle ("Gestion de clics");
        setBounds (10, 20, 300, 200);
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent ev)
    {
        n++;
        System.out.println( n + " clic dans la fenetre");
       
    }
    public void mousePressed (MouseEvent ev) {}
    public void mouseReleased (MouseEvent ev) {}
    public void mouseEntered (MouseEvent ev) {}
    public void mouseExited (MouseEvent ev) {}
    private int n;
}
public class Clic1 {
    public static void main (String args[])
    {
        MaFe fen = new MaFe();
        fen.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre16;

/**
 *
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ma1 extends JFrame implements MouseListener
{
    public Ma1()
    {
        setTitle("Traces souris");
        setSize(300,180);
        addMouseListener(this);
    }
    public void mouseClicked (MouseEvent e)
    {
        System.out.println("mouseClicked en " + e.getX() + " " + e.getY());
    }
    public void mousePressed (MouseEvent e)
    {
        System.out.println("mousePressed en " + e.getX() + " " + e.getY());
    }
    public void mouseReleased (MouseEvent e)
    {
        System.out.println("mouseReleased en " + e.getX() + " " + e.getY());
    }
    public void mouseEntered (MouseEvent e){}
    public void mouseExited (MouseEvent e) {}
}
public class Souris1 {
    public static void main (String args[])
    {
        Ma1 fen = new Ma1();
        fen.setVisible(true);
    }
}

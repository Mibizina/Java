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
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class MF1 extends JFrame
{
    public MF1()
    {
        setTitle("Essais drag souris"); setSize(300,200);
        panneau = new Paneau();
        getContentPane().add(panneau);
    }
    private JPanel panneau;
}
class Paneau extends JPanel implements MouseMotionListener
{
    Paneau()
    {
        addMouseMotionListener(this);
        addMouseListener (new MouseAdapter()
        {
           public void mouseReleased(MouseEvent e)
           {
               enCours = false;
               System.out.println("Release X = " + e.getX() + " Y = " + e.getY());
           }
        });
        repaint();
    }
    
    public void mouseDragged (MouseEvent e)
    {
        System.out.println("Drag X = " + e.getX() + " Y = " + e.getY());
        if (!enCours) {
            xDeb = e.getX();
            yDeb = e.getY();
            xFin = xDeb;
            yFin = yDeb;
            enCours = true;
        }
        else {
            xFin = e.getX(); yFin = e.getY();
        }
        repaint();
    }
    public void mouseMoved (MouseEvent e) {
}
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        int xd, xf, yd, yf;
        xd = Math.min(xDeb, xFin); xf = Math.max(xDeb, xFin);
        yd = Math.min(yDeb, yFin); yf = Math.max(yDeb, yFin);
        g.drawRect(xd, yd, xf-xd, yf-yd);
    }
    private boolean enCours = false;
    private int xDeb, yDeb, xFin, yFin;
}
public class Drag1 {
    public static void main (String args[])
    {
        MF1 fen= new MF1();
        fen.setVisible(true);
    }
}

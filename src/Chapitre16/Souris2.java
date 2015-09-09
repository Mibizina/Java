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
class MF extends JFrame implements MouseListener
{
    public MF()
    {
        setTitle("Traces souris");
        setSize(300,180);
        addMouseListener(this);
    }
    public void mouseClicked (MouseEvent e)
    {
        details ("mouseClicked ", e);
    }
    public void mousePressed (MouseEvent e)
    {
        details ("MousePressed", e);
    }
    public void mouseReleased (MouseEvent e)
    {
        details("MouseReleased", e);
    }
    public void mouseEntered (MouseEvent e){ details ("MouseEntered", e);}
    public void mouseExited (MouseEvent e) { details ("MouseExited",e );}
    public void mouseDragged (MouseEvent e) {details ("MouseDragged", e);}
    public void mouseMoved (MouseEvent e) { details ("MouseMoved", e);}
    public static void details (String txt, MouseEvent e)
    {
        System.out.print(txt + " X = "+e.getX() + " Y = " + e.getY());
        System.out.print("   Ctr = " + e.getClickCount());
        System.out.print("   Boutons : ");
        if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0)
            System.out.print("gauche ");
        if ((e.getModifiers() & InputEvent.BUTTON2_MASK) !=0 )
            System.out.print("milieu ");
        if ((e.getModifiers() & InputEvent.BUTTON3_MASK) !=0 )
            System.out.print("droite ");
        if (e.isPopupTrigger()) System.out.print("Popup");
        System.err.println("");
    }
}
public class Souris2 {
    public static void main (String args[])
    {
        MF fen = new MF();
        fen.setVisible(true);
    }
}

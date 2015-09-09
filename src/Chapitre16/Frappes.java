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
class MF5 extends JFrame
{
    public MF5()
    {
        setTitle("Affichage caracteres");
        setSize(300,180);
        Container contenu = getContentPane();
        pan = new Paneau2();
        contenu.add(pan);
        addKeyListener(new KeyAdapter() 
        { public void keyTyped(KeyEvent e)
            { pan.setCaractereCourant (e.getKeyChar());
            }
        });
    }
    private Paneau2 pan;
}
class Paneau2 extends JPanel
{
    public Paneau2()
    {
        addMouseListener (new MouseAdapter()
        {
            public void mouseClicked (MouseEvent e)
            {
                Graphics g = getGraphics();
                String ch = "" + caractereCourant;
                g.drawString(ch, e.getX(), e.getY());
                g.dispose();
            }
        });
    }
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
    }
    public void setCaractereCourant (char c)
    {
        caractereCourant = c;
    }
    private char caractereCourant = ' ';
}
public class Frappes {
    public static void main (String args[])
    {
        MF5 fen =  new MF5();
        fen.setVisible(true);
    }
}

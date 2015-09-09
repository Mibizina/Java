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
class MF6 extends JFrame
{
    public MF6 ()
    {
        setTitle("Affichage caracteres 2 panneaux");
        setSize(400,180);
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        pan1 = new Paneau6(Color.red); contenu.add(pan1);
        pan2 = new Paneau6(Color.cyan); contenu.add(pan2);
        //Pour arréter le programme à la fermeture de l'intrerface graphique
        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing (WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    private Paneau6 pan1, pan2;
}
class Paneau6 extends JPanel
{
    public Paneau6(Color c)
    {
        setPreferredSize(new Dimension(160,100));
        setBackground(c);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e)
            {
                Graphics g = getGraphics();
                String ch = "" + caractereCourant;
                g.drawString(ch, e.getX(), e.getY());
                g.dispose();
                requestFocus();
            }
        
        });
        addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e)
            {
                caractereCourant = e.getKeyChar();
            }
        });
    }
    public boolean isFocusTraversable()
    {
        return true;
    }
    private char caractereCourant = '*';
}
public class Frappes2 {
    public static void main (String args[])
    {
        MF6 fen = new MF6();
        fen.setVisible(true);
    }
}

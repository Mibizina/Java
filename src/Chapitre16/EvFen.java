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
class MF7 extends JFrame implements WindowListener
{
    public MF7()
    {
        setTitle("Evenements fenetre");
        setSize(300,100);
        addWindowListener(this);
        //Pour arréter le programme à la fermeture de l'intrerface graphique
        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing (WindowEvent e)
            {
                System.exit(0);
            }
        });
        //######################################################################
    }
    public void windowClosing (WindowEvent e)
    {
        System.out.println("fenetre en cours de fermeture");
    }
    public void windowOpened (WindowEvent e)
    {
        System.out.println("overture fenetre");
    }
    public void windowIconified (WindowEvent e)
    {
        System.out.println("fenetre en icone");
    }
    public void windowDeiconified (WindowEvent e)
    {
        System.out.println("icone en fenetre");
    }
    public void windowClosed (WindowEvent e)
    {
        System.out.println("fenetre fermee");
    }
    public void windowActivated (WindowEvent e)
    {
        System.out.println("fenetre activee");
    }
    public void windowDeactivated (WindowEvent e)
    {
        System.out.println("fenetre desactive");
    }
}
public class EvFen {
    public static void main (String args [])
    {
        MF7 fen = new MF7();
        fen.setVisible(true);
    }
}

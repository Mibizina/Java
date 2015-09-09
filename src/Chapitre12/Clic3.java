/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 * UTILISATION DE MOUSEADAPTER
 * @author Mihary
 */

import javax.swing.*;
import java.awt.event.*;
class MaF1 extends JFrame
{
    public MaF1()
    {
        setTitle("Gestion de clics 3.0");
        setBounds(10, 20, 300, 200);
        addMouseListener (new MouseAdapter()
        {
            public void mouseClicked(MouseEvent ev)
            {
                int x = ev.getX();
                int y = ev.getY();
                System.out.println("clic au point de coordonnees " + x + " , " + y);
            }
        });
    }
}
public class Clic3 {
    public static void main (String args[])
    {
        MaF1 fen = new MaF1();
        fen.setVisible(true);
    }
}

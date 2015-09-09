/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre18;

/**
 *
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;

class Mfl1 extends JFrame
{
    Mfl1 ()
    {
        setTitle("Essais Lignes");
        setSize(300,150);
        pan = new Paneaul1();
        getContentPane().add(pan);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private JPanel pan;
}
class Paneaul1 extends JPanel
{
    public void paintComponent (Graphics g)
    {
        g.drawRect(20, 10, 60, 40);
        g.drawLine(20, 100, 150, 20);
        g.drawOval(130, 60, 110, 50);
    }
}
public class Lignes1 {
    public static void main (String args[])
    {
        Mfl1 fen = new Mfl1();
        fen.setVisible(true);
    }
}

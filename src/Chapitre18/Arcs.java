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
class MFa extends JFrame
{
    public MFa()
    {
        setTitle("Essais arcs");
        setSize(400, 120);
        pan = new Paneaua();
        getContentPane().add(pan);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private JPanel pan;
}
class Paneaua extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int r = 50;
        g.translate(10, 20);
        g.drawArc(0, 0, 2*r, 2*r, 45, 135);
        g.translate(2*r+20, 0);
        g.drawArc(0, 0, 2*r, r, 30, 210);
        g.translate(2*r+20, 0);
        g.drawArc(0, 0, 2*r, r, 45, -210);
    }
}
public class Arcs {
    public static void main (String args[])
    {
        MFa fen = new MFa();
        fen.setVisible(true);
    }
}

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
class MFl2 extends JFrame
{
    public MFl2()
    {
        setTitle("Essais coins arrondis");
        setSize(350, 100);
        pan = new Paneaul2();
        getContentPane().add(pan);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private JPanel pan;
}
class Paneaul2 extends JPanel
{
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        int larg = 80, haut = 50;
        g.translate(20, 10); g.drawRoundRect(0, 0, larg, haut, 10, 10);
        g.translate(100, 0); g.drawRoundRect(0, 0, larg, haut, 40, 25);
        g.translate(100, 0); g.drawRoundRect(0, 0, larg, haut, larg, haut);
    }
}
public class Lignes2 {
    public static void main (String args[])
    {
        MFl2 fen = new MFl2();
        fen.setVisible(true);
    }
}

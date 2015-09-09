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
class MF1 extends JFrame
{
    MF1()
    {
        setTitle("Essai texte");
        setSize(300, 150);
        pan = new Paneau();
        getContentPane().add(pan);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private JPanel pan;
}
class Paneau extends JPanel
{
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        int x = 20, y =30;
        String ch1 = "bonjour";
        String ch2 = " monsieur"; 
        g.drawString(ch1, x, y);
        FontMetrics fm = g.getFontMetrics();
        x += fm.stringWidth(ch1);
        g.drawString(ch2, x, y);
        y += fm.getHeight();
        g.setColor(Color.red);
        g.drawString(ch2, x, y);
        Font fl = new Font("Serif", Font.BOLD+Font.ITALIC, 20);//Font.PLAIN Romain(normal), Font.BOLD Gras, Font.ITALIC, Font.BOLD+Font.ITALIC
        g.setColor(Color.red.brighter());
        g.drawString(ch2, x, y+50);
    }
}
public class PremTxt1 {
    public static void main (String args[])
    {
        MF1 fen = new MF1();
        fen.setVisible(true);
    }
}

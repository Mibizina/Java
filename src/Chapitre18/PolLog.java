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
class MFl extends JFrame
{
    public MFl()
    {
        setTitle("POLICES LOGIQUES");
        setSize(700, 250);
        pan = new Paneau1();
        getContentPane().add(pan);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private JPanel pan;
}
class Paneau1 extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        String fontes[] = {"SansSerif", "Serif", "Monospaced", "Dialog", "DialogInput"};
        int styles[] = {Font.PLAIN, Font.BOLD, Font.ITALIC, Font.PLAIN, Font.BOLD+Font.ITALIC};
        int tailles[] = {12, 10, 18, 32, 24};
        int x = 10, y = 10;
        for (int i = 0; i<fontes.length ; i++)
        {
            g.setFont(new Font(fontes[i], styles[i], tailles[i]));
            FontMetrics fm = g.getFontMetrics();
            String ch = fontes[i] + " " + tailles[i] + " abcdefghijklmnopqrstuvwxyz";
            y += fm.getAscent();
            g.drawString(ch, x, y);
            y += fm.getDescent() + fm.getLeading();
        }
        FontMetrics fm = g.getFontMetrics();
        //y += fm.getDescent() + fm.getLeading();
        g.setFont(new Font("Serif", Font.ITALIC, 55));
        g.drawString("hello world", x, y+40);
    }
}

public class PolLog {
    public static void main (String args[])
    {
        MFl fen = new MFl();
        fen.setVisible(true);
    }
}
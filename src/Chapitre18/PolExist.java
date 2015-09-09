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
class MFp extends JFrame
{
    public MFp()
    {
        setTitle("POLICES EXISTANTES");
        setSize(600, 300);
        pan = new Paneau2();
        Dimension d = new Dimension(500, 3000);
        pan.setPreferredSize(d);
        defil = new JScrollPane(pan);
        getContentPane().add(defil);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private JPanel pan;
    private JScrollPane defil;
}
class Paneau2 extends JPanel
{
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        String fontes[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        int x=10, y=10;
        for (int i= 0; i< fontes.length ; i++)
        {
            g.setFont(new Font (fontes[i], Font.PLAIN, 12));
            FontMetrics fm = g.getFontMetrics();
            y += fm.getAscent();
            String ch = fontes[i] + " " + "abcdefghijklmnopqrstuvwxyz";
            g.drawString(ch, x, y);
            y += fm.getDescent() + fm.getLeading();
        }
        mena = new Color (127, 0, 0);
        g.setColor(mena);
        g.setFont(new Font("Serif", Font.BOLD, 30));
        g.drawString("HELLO WORLD", x, y+30);
    }
    private Color mena;
}
public class PolExist {
    public static void main (String args[])
    {
        MFp fen = new MFp();
        fen.setVisible(true);
    }
}

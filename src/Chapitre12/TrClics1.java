/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 *
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Maf11 extends JFrame
{
    Maf11()
    {
        setTitle("Traces de clics");
        setSize(300, 150);
        pan = new JPanel();
        getContentPane().add(pan);
        pan.addMouseListener(new EcouteClic(pan));
    }
    private JPanel pan;
}

class EcouteClic extends MouseAdapter
{
    public EcouteClic (JPanel pan)
    {
        this.pan = pan;
    }
    public void mouseClicked (MouseEvent ev)
    {
        int x = ev.getX(), y = ev.getY();
        Graphics g = pan.getGraphics();
        g.drawRect(x, y, 50, 50);
        g.dispose();
    }
    private JPanel pan;
}

public class TrClics1 {
    public static void main (String args[])
    {
        Maf11 fen = new Maf11();
        fen.setVisible(true);
    }
}

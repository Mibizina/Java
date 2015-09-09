/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 *  FORCER LE DESSIN DANS UN PANNEAU
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Maf2 extends JFrame implements ActionListener
{
    Maf2()
    {
        setTitle("Exemple appel repaint");
        setSize(300, 200);
        Container contenu = getContentPane(); 
//création panneau pour le dessin
        pan = new Panneau2();
        pan.setBackground(Color.cyan);
        contenu.add(pan);
//création bouton "rectangle"
        rectangle = new JButton("Rectangle");
        contenu.add(rectangle, "North");
        rectangle.addActionListener(this);
//création bouton "ovale"
        ovale = new JButton("Ovale");
        contenu.add(ovale, "South");
        ovale.addActionListener(this);
    }
    public void actionPerformed (ActionEvent ev)
    {
        if (ev.getSource() == rectangle) pan.setRectangle();
        if (ev.getSource() == ovale) pan.setOvale();
        pan.repaint(); //pour forcer la peinture du panneau des maintenant
    }
    private Panneau2 pan;
    private JButton rectangle, ovale;
}
class Panneau2 extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (ovale) g.drawOval(80, 20, 120, 60);
        if (rectangle) g.drawRect(80, 20, 120, 60);
    }
    public void setRectangle() {rectangle = true ; ovale = false; }
    public void setOvale() {rectangle = false; ovale = true; }
    private boolean rectangle = false, ovale = false;
}

public class Repaint {
    public static void main (String args[])
    {
        Maf2 fen = new Maf2();
        fen.setVisible(true);
    }
}

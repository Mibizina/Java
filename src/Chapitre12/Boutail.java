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
import manomboka.Clavier;

class Fen2Btns1 extends JFrame
{
    final int NBOUTONS = 4;
    public Fen2Btns1()
    {
        setTitle("Modif taille des boutons");
        setSize(300, 150);
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        boutons = new JButton[NBOUTONS];
        for (int i =0; i<NBOUTONS; i++)
        {
            boutons[i] = new JButton ("NUM " + i);
            contenu.add(boutons[i]);
        }
    }
    public void setTaillBout (int num, int l, int h)
    {
        boutons[num].setPreferredSize(new Dimension(l, h));
        boutons[num].revalidate();
    }
    private JButton boutons[];
}

public class Boutail {
    public static void main (String args[])
    {
        Fen2Btns1 fen = new Fen2Btns1();
        fen.setVisible(true);
        int num, l, h;
        while (true)
        {
            System.out.print("num bouton : ");
            num = Clavier.lireInt();
            System.out.print("larg bouton : ");
            l = Clavier.lireInt();
            System.out.print("haut bouton : ");
            h = Clavier.lireInt();
            fen.setTaillBout(num, l, h);
        }
    }
}

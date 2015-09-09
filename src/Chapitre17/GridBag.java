/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre17;

/**
 *
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;
class MFg extends JFrame
{
    //4 lignes, 5 colonnes fictives
    public static int NBOUTONS = 10;
    public static int x[] = {0, 3, 3, 0, 0, 3};
    public static int y[] = {0, 0, 1, 2, 3, 2};
    public static int larg[] = {3, 2, 2, 3, 3, 2};
    public static int haut[] = {2, 1, 1, 1, 1, 2};
    public static int px [] = {60, 40, 0, 0, 0, 0}; //largeur B1(60) B2(40)
    public static int py [] = {0, 25, 25, 25, 25, 25};//hauteur B2 B3 B4 B5 (25)
    public MFg()
    {
        setTitle("Exemple GridbagLayout");
        setSize(350, 180);
        Container contenu = getContentPane();
        GridBagLayout g = new GridBagLayout();
        contenu.setLayout(g);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        for (int i = 0; i<x.length ; i++)
        {
            c.gridx = x[i]; c.gridy = y[i];
            c.gridwidth = larg[i]; c.gridheight = haut[i];
            c.weightx = px[i]; c.weighty = py[i];
            contenu.add(new JButton ("Bouton" + (i+1)),c );
        }
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
public class GridBag {
    public static void main (String args[])
    {
        MFg fen = new MFg();
        fen.setVisible(true);
    }
}

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
class MF77 extends JFrame
{
    public MF77()
    {
        setTitle("Exemple strut Glue");
        setSize(150,200);
        Container contenu = getContentPane();
        bVert = Box.createVerticalBox();
        contenu.add(bVert);
        b1 = new JButton("Bouton1");
        bVert.add(b1);
        bVert.add(Box.createVerticalStrut(30));// espace 10 pixel
        b2 = new JButton("Bouton2");
        bVert.add(b2);
        bVert.add(Box.createGlue()); //espacement maximal pour la case à cocher
       coche1 = new JCheckBox("case à cocher");
       bVert.add(coche1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private Box bVert;
    private JButton b1,b2;
    private JCheckBox coche1;
}
public class Layout7 {
    public static void main (String args[])
    {
        MF77 fen = new MF77();
        fen.setVisible(true);
    }
}

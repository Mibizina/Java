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

class MF1 extends JFrame
{
    public static int NBOUTONS = 8;
    public MF1()
    {
        setTitle("Exemple FlowLayout");
        setSize (350, 180);
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        boutons = new JButton[NBOUTONS];
        int n=1;
        for (int i = 0; i<NBOUTONS; i++)
        {
            boutons[i] = new JButton("Boutons " + n );
            n*= 10;
            contenu.add(boutons[i]);
        }
    }
    private JButton boutons[];
}
public class Layout2 {
    public static void main (String args[])
    {
    MF1 fen = new MF1();
    fen.setVisible(true);
    }
}

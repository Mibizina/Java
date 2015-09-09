/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre17;

/**
 * BORDERLAYOUT
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;
class MaFenetre extends JFrame
{
    /**
     *BorderLayout g = new BorderLayout();
     * g.setHgap(15); //intervalle horizontal entre composants de 15 pixels
     * g.setVgap(8); //intervalle vertical entre composants de 8 pixels
     * conteneur.setLayout(g);
     */
    public static int NBOUTONS = 5 ;
    public MaFenetre()
    {
        setTitle("Exemple borderlayout");
        setSize(300,180);
        Container contenu = getContentPane();
        boutons = new JButton[NBOUTONS];
        for (int i = 0; i<NBOUTONS; i++) boutons[i] = new JButton("Bouton " + i);
        contenu.add(boutons[0]);
        contenu.add(boutons[1], BorderLayout.NORTH);
        contenu.add(boutons[2], BorderLayout.SOUTH);
        contenu.add(boutons[3], BorderLayout.WEST);
        contenu.add(boutons[4], BorderLayout.EAST);
    }
    private JButton boutons[];
}
public class Layout1 {
    public static void main (String args[])
    {
        MaFenetre fen = new MaFenetre();
        fen.setVisible(true);
    }
}

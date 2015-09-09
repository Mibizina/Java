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
class MFt extends JFrame
{
    public static int NBOUTONS = 4;
    public MFt()
    {
        setTitle("Exemple GroupLayout");
        setSize(400,80);
        Container contenu = getContentPane();
        boutons = new JButton[NBOUTONS];
        for(int i= 0 ; i<NBOUTONS ; i++)
        {
            boutons [i] = new JButton("Bouton " + i);
        }
        GroupLayout ges = new GroupLayout(contenu);
        contenu.setLayout(ges);
        // hg = description horizontale du groupa
        GroupLayout.SequentialGroup hg = ges.createSequentialGroup();
        ges.setHorizontalGroup(hg);
        for (JButton bouton : boutons) hg.addComponent(bouton);
        // hv = description verticale du groupa
        //GroupLayout.ParallelGroup hv = ges.createParallelGroup();
        GroupLayout.SequentialGroup hv = ges.createSequentialGroup();// choisir entre la ligne en dessus et celle-ci pour les dispositions
        ges.setVerticalGroup(hv);
        for (JButton bouton: boutons) hv.addComponent(bouton);
        /*
        GroupLayout.ParallelGroup hv = ges.createParallelGroup();
        ges.setVerticalGroup(hg);
        for (JButton bouton: boutons) hv.addComponent(bouton);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ges.setHorizontalGroup(hv);
        for (JButton bouton : boutons) hg.addComponent(bouton);
        */
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private JButton boutons[];
}
public class TestGroupLayout {
    public static void main (String args[])
    {
        MFt fen = new MFt();
        fen.setVisible(true);
    }
}

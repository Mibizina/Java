/*
 * 2 groupes
 */
package Chapitre17;

/**
 *
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;

class MFg1 extends JFrame
{
    public static int NBOUTONS = 6;
    public MFg1()
    {
        setTitle("Exemple GroupLayout 2");
        setSize(400,150);
        Container contenu = getContentPane();
        boutons = new JButton[NBOUTONS];
        for  ( int i=0; i<NBOUTONS ; i++)
        {
            boutons[i] = new JButton ("Bouton " + i);
        }
            GroupLayout ges = new GroupLayout(contenu);
            contenu.setLayout(ges);
            ges.setAutoCreateGaps(true); //pour espacer les composants entre eux
            ges.setAutoCreateContainerGaps(true); //pour espacer les composants du bord
            
            // description première colonne suivant les 2 axes
            GroupLayout.ParallelGroup col1h = ges.createParallelGroup();
            col1h.addComponent(boutons[0]);
            col1h.addComponent(boutons[2]);
            col1h.addComponent(boutons[4]);
            GroupLayout.SequentialGroup col1v = ges.createSequentialGroup();
            col1v.addComponent(boutons[0]);
            col1v.addComponent(boutons[2]);
            col1v.addComponent(boutons[4]);
            GroupLayout.ParallelGroup col2h = ges.createParallelGroup();
            col2h.addComponent(boutons[1]);
            col2h.addComponent(boutons[3]);
            col2h.addComponent(boutons[5]);
            GroupLayout.SequentialGroup col2v = ges.createSequentialGroup();
            col2v.addComponent(boutons[1]);
            col2v.addComponent(boutons[3]);
            col2v.addComponent(boutons[5]);
            
            // description horizontale du groupe de colonnes
            GroupLayout.SequentialGroup hg = ges.createSequentialGroup();
            ges.setHorizontalGroup(hg);
            hg.addGroup(col1h);
            hg.addGroup(col2h);
            
            //description verticale du groupe de colonnes
            GroupLayout.ParallelGroup hv = ges.createParallelGroup();
            ges.setVerticalGroup(hv);
            hv.addGroup(col1v);
            hv.addGroup(col2v);
      
    }
    private JButton boutons[];
}
public class TestGroupLayout2 {
    public static void main (String args [])
    {
        MFg1 fen = new MFg1();
        fen.setVisible(true);
    }
}

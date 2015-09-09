/*
 * GridLayout
 */
package Chapitre17;

/**
 *
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;

class MF4 extends JFrame
{
    
    public static int NBOUTONS = 10;
    public MF4()
    {
        setTitle ("Exemple GridLayout");
        setSize(350, 180);
        Container contenu = getContentPane();
        contenu.setLayout(new GridLayout(4, 3, 6, 4));//4 lignes, 3 colonnes, intervalle horizontal 6, intervalle verticale 4
        boutons = new JButton[NBOUTONS];
        for (int i=0 ; i<NBOUTONS ; i++)
        {
            boutons[i] = new JButton ("Bouton " + i);
            contenu.add(boutons[i]);
        }
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    private JButton boutons[];
}
public class Layout4 {
    public static void main (String args[])
    {
        MF4 fen = new MF4();
        fen.setVisible(true);
    }
}

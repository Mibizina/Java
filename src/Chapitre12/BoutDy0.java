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

class FenBoutDyn extends JFrame
{
    public FenBoutDyn()
    {
        setTitle("Boutons dynamiques");
        setSize(500, 150);
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        crBouton = new JButton("CREATION BOUTON");
        contenu.add(crBouton);
        EcoutCr ecoutCr = new EcoutCr (contenu);
        crBouton.addActionListener(ecoutCr);
    }
    private JButton crBouton;
}
class EcoutCr implements ActionListener
    {
        public EcoutCr(Container contenu)
        {
            this.contenu = contenu;
        }
        public void actionPerformed(ActionEvent ev)
        {
            JButton nouvBouton = new JButton("BOKOTRA");
            contenu.add(nouvBouton);
            contenu.validate(); //pour recalculer 
        }
        private Container contenu;
    }

public class BoutDy0 {
    public static void main (String args[])
    {
        FenBoutDyn fen = new FenBoutDyn();
        fen.setVisible(true);
    }
}

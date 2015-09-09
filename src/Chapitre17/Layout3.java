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
import java.awt.event.*;
import javax.swing.event.*;
class MF2 extends JFrame implements ActionListener
{
    public static int NBOUTONS = 8;
    public MF2()
    {
        setTitle("Exemple CardLayout");
        setSize(400,180);
        setResizable(false);
        Container contenu = getContentPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panCard = new JPanel(); // panneau pour la pile
        contenu.add(panCard);
        panCom = new JPanel(); // panneau pour les boutons de parcours de la pile
        contenu.add(panCom, "South");
        /* creation de la pile de boutons */
        pile = new CardLayout (30,10);//30 px de part et d'autre, 20px en haut et en bas
        panCard.setLayout (pile);
        boutons = new JButton[NBOUTONS];
        for (int i=0 ; i<NBOUTONS; i++)
        {
            boutons[i] = new JButton ("Bouton " + i);
            panCard.add(boutons[i], "Bouton"); // identification obligatoire ici
           
        }
        text = new JLabel("Helloworld");
        //text.setText("HelloWorld");
            panCard.add(text, "le texte");
        /*Création des boutons de parcours de la pile*/
        prec = new JButton("Précédent"); panCom.add(prec);
        prec.addActionListener(this);
        suiv = new JButton("Suivant"); panCom.add(suiv);
        suiv.addActionListener(this);
        prem = new JButton("Premier"); panCom.add(prem);
        prem.addActionListener(this);
        der = new JButton("dernier"); panCom.add(der);
        der.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton source = (JButton)e.getSource();
        if (source == prec) pile.previous (panCard);
        if (source == suiv) pile.next(panCard);
        if (source == prem) pile.first(panCard);
        if (source == der) pile.last(panCard);
    }
    private JButton boutons[];
    private JPanel panCard, panCom;
    private CardLayout pile;
    private JButton prec, suiv, prem, der;
    private JLabel text;
}
public class Layout3 {
    public static void main (String []args)
    {
        MF2 mafen = new MF2();
        mafen.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre15;

/**
 *
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MaF extends JFrame
{
    public MaF()
    {
        setTitle("Lohateny");
        setSize(300,100);
        menu = new JMenuBar();
        setJMenuBar(menu);
        menuCouleur = new JMenu("COULEUR");
        menu.add(menuCouleur);
        actionRouge = new MonAct("EN ROUGE", Color.red);
        actionJaune = new MonAct("EN JAUNE", Color.yellow);
        menuCouleur.add(actionRouge);
        menuCouleur.add(actionJaune);
        
        boutonRouge = new JButton((String)actionRouge.getValue(Action.NAME));
        getContentPane().add(boutonRouge, "South");
        boutonRouge.addActionListener(actionRouge);
    }
    private MonAct actionRouge, actionJaune;
    private JMenuBar menu;
    private JMenu menuCouleur;
    private JMenuItem optionRouge, optionJaune;
    private JButton boutonRouge;
}
class MonAct extends AbstractAction
{
    public MonAct(String nom, Color couleur)
    {
        super(nom);
        this.couleur = couleur;
    }
    public void actionPerformed(ActionEvent e)
    {
        if (couleur == Color.red) System.out.println("action rouge, chaine de commande : " + e.getActionCommand());
        if (couleur == Color.yellow) System.out.println("action jaune, chaine de commande : " + e.getActionCommand());
        
    }
    private Color couleur;
}

public class Action3 {
    public static void main (String args[])
    {
        MaF fen = new MaF();
        fen.setVisible(true);
    }
}

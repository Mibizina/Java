/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre16;

/**
 *
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MF4 extends JFrame
{
    public MF4()
    {
        setTitle("Colorations");
        setSize(300,100);
        Container contenu = getContentPane();
        pan = new Paneau1();
    }
    private Paneau1 pan;
}
class Paneau1 extends JPanel
{
    public Paneau1()
    {
        actionRouge = new ActionCouleur("rouge", Color.red, this);
        actionBleu = new ActionCouleur ("bleu", Color.blue, this);
        actionJaune = new ActionCouleur ("jaune", Color.yellow, this);
        registerKeyboardAction(actionRouge, KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.ALT_MASK|InputEvent.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        registerKeyboardAction(actionBleu, KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.ALT_MASK|InputEvent.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        registerKeyboardAction(actionJaune, KeyStroke.getKeyStroke(KeyEvent.VK_J, InputEvent.ALT_MASK|InputEvent.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
    }
    private ActionCouleur actionRouge, actionBleu, actionJaune;
}
class ActionCouleur extends AbstractAction
{
    public ActionCouleur(String nomCouleur, Color couleur, Paneau1 pan)
    {
        super (nomCouleur);
        this.nomCouleur = nomCouleur;
        this.couleur =couleur;
        this.pan = pan;
    }
    public void actionPerformed (ActionEvent e)
    {
        pan.setBackground (couleur);
    }
    private String nomCouleur;
    private Color couleur;
    private Paneau1 pan;
}


public class Colore1 {
    public static void main (String args[])
    {
        MF4 fen = new MF4();
        fen.setVisible(true);
    }
}

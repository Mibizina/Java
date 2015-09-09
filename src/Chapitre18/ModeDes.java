/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre18;

/**
 *
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MFModes extends JFrame implements ActionListener
{
    public MFModes()
    {
        setTitle("DESSINS");
        setSize(350, 250);
        Container contenu = getContentPane();
        pan = new PaneauModes();
        contenu.add(pan);
        rouge = new JButton("Rouge");
        contenu.add(rouge, "North");
        rouge.addActionListener(this);
        bleu = new JButton("Bleu");
        contenu.add(bleu, "South");
        rouge.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed (ActionEvent e)
    {
        if (e.getSource() == rouge) pan.setBackground(Color.red);
        if (e.getSource() == bleu) pan.setBackground(Color.cyan);
    }
    private PaneauModes pan;
    private JButton rouge, bleu;
}
class PaneauModes extends JPanel
{
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        g.setXORMode(getBackground()); // mode XOR fonde sur la couleur de fond
        /* rectangle et ovale de meme couleur (orange) se chevauchant */
        g.setColor(Color.orange);
        g.fillRect(10, 30, 150, 100);
        g.fillOval(30, 10, 100, 150);
        /* rectangle jaune et ovale vert se chevauchant */
        g.setColor(Color.yellow);
        g.fillRect(170, 30, 150, 100);
        g.setColor(Color.green);
        g.fillOval(190, 10, 100, 150);
    }
}
public class ModeDes {
    public static void main (String args[])
    {
        MFModes fen = new MFModes();
        fen.setVisible(true);
    }
}

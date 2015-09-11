/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre23;

/**
 * Utilisation d'expressions lambda pour ActionListener
 * @author Mihary
 */
import java.awt.*; import javax.swing.*;
public class FenCoches extends JFrame{ // plus de implements ActionListener
    public FenCoches()
    {
        setTitle("Exemples de case à cocher");
        setSize(400, 100);
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        coche1 = new JCheckBox("case 1"); contenu.add(coche1);
        coche1.addActionListener(ee -> System.out.println("action case 1"));
        coche2 = new JCheckBox("case 2"); contenu.add(coche2);
        coche2.addActionListener(ee -> System.out.println("action case 2"));
        Etat = new JButton("Etat"); contenu.add(Etat);
        Etat.addActionListener(ee -> System.out.println("Etat CASES : " + coche1.isSelected() + " " + coche2.isSelected()));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private JCheckBox coche1, coche2;
    private JButton Etat;
}
class Cases1
{
    public static void main(String args[])
    {
        FenCoches fen = new FenCoches();
        fen.setVisible(true);
    }
}
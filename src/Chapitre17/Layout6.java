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

class MF7 extends JFrame
{
    public MF7()
    {
        setTitle("Exemple BoxLayout hztl");
        setSize(200, 150);
        Container contenu = getContentPane();
        bVert = Box.createVerticalBox();
        contenu.add(bVert);
        b1 = new JButton("Bouton1");
        bVert.add(b1);
        txt = new JTextField(20);
        bVert.add(txt);
        coche1 = new JCheckBox("case à cocher");
        bVert.add(coche1);
        etiq = new JLabel("Bonjour");
        bVert.add(etiq);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    private Box bVert;
    private JButton b1;
    private JCheckBox coche1;
    private JTextField txt;
    private JLabel etiq;
}
public class Layout6 {
    public static void main (String args[])
    {
        MF7 fen = new MF7();
        fen.setVisible(true);
    }
}

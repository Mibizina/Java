/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre19;

/**
 *
 * @author Mihary
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

public class App2Bout extends JApplet implements ActionListener{
    public void init()
    {
        pan =new JPanel();
        panCom = new JPanel();
        Container contenu = getContentPane();
        contenu.add(pan);
        contenu.add(panCom, "South");
        rouge = new JButton("Rouge");
        jaune = new JButton("Jaune");
        rouge.addActionListener(this);
        jaune.addActionListener(this);
        panCom.add(rouge);
        panCom.add(jaune);
    }
    public void actionPerformed (ActionEvent e)
    {
        if(e.getSource() == rouge) pan.setBackground(Color.red);
        if (e.getSource() == jaune) pan.setBackground(Color.yellow);
    }
    private JPanel pan, panCom;
    private JButton rouge, jaune;
}

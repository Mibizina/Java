/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre16;

/**
 *  Ctrl+alt+r rouge
 *  Ctrl+alt+b bleu
 *  Ctrl+alt+g vert
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MF3 extends JFrame
{
    public MF3()
    {
        setTitle("Colorations");
        setSize(300,180);
        Container contenu = getContentPane();
        pan = new JPanel();
        contenu.add(pan);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e)
            {
                if (e.isControlDown() && e.isAltDown())
                {
                    int touche = e.getKeyCode();
                    switch (touche)
                    {
                        case KeyEvent.VK_R : pan.setBackground (Color.red);break;
                        case KeyEvent.VK_B : pan.setBackground (Color.blue); break;
                        case KeyEvent.VK_G : pan.setBackground (Color.green);break;
                    }
                }
            }
        });
        
    }
    private JPanel pan;
}
public class Colore0 {
    public static void main (String args [])
    {
    MF3 fen = new MF3();
    fen.setVisible(true);
    }
}

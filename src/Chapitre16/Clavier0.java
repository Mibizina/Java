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
class MF2 extends JFrame implements KeyListener
{
    public MF2()
    {
        setTitle("Exemple lecture de clavier");
        setSize(300,180);
        addKeyListener(this);
    }
    public void keyPressed (KeyEvent e)
    {
        int code = e.getKeyCode();
        
        if ((e.getKeyCode() == KeyEvent.VK_E) && ((e.getModifiers() & InputEvent.CTRL_MASK) !=0))
            System.out.println("Touche " + code + " pressee " + e.getKeyText(code));
    }
    public void keyReleased (KeyEvent e)
    {
        int code = e.getKeyCode();
        System.out.println("Touche " + code + " relachee " + e.getKeyText(code));
    }
    public void keyTyped (KeyEvent e)
    {
        char c = e.getKeyChar();
        System.out.println("Caractere frappe : " + c + " de code " + (int)c);
    }
}
public class Clavier0 {
    public static void main (String args[])
    {
        MF2 fen = new MF2();
        fen.setVisible(true);
    }
}

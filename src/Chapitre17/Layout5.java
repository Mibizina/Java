/*
 * BoxLayout Horizontal
 */
package Chapitre17;

/**
 *
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;

class MF5 extends JFrame
{
    public MF5()
    {
        setTitle("Exemple BoxLayout Hztl");
        setSize(550,100);
        Container contenu = getContentPane();
        
        bHor = Box.createHorizontalBox();
        contenu.add(bHor);
        b1 = new JButton ("Bouton1");
        bHor.add(b1);
        txt =new JTextField(20);
        bHor.add(txt);
        coche1 = new JCheckBox ("case à cocher");
        bHor.add(coche1);
        etiq = new JLabel("Bonjour");
        bHor.add(etiq);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private Box bHor;
    private JButton b1;
    private JCheckBox coche1;
    private JLabel etiq;
    private JTextField txt;
}
public class Layout5 {
    public static void main (String args[])
    {
        MF5 fen = new MF5();
        fen.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre14;

/**
 *
 * @author Mihary
 */
import javax.swing.*;

class MaFenetre extends JFrame
{
    MaFenetre()
    {
        setTitle("Essai message");
        setSize(400,150);
    }
}
public class Mess1 {
    public static void main (String [] args)
    {
    MaFenetre fen = new MaFenetre();
    JOptionPane.showMessageDialog(fen, "Hello", "Adala lety",JOptionPane.WARNING_MESSAGE);
    JOptionPane.showConfirmDialog(null, "Akory lahaly e");
    JOptionPane.showConfirmDialog(null, "voulez-vous continuer", "INCiDENT Majeur", JOptionPane.YES_NO_OPTION);
    JOptionPane.showConfirmDialog(null, "voulez-vous continuer", "INCiDENT Mineur", JOptionPane.YES_NO_CANCEL_OPTION);
    JOptionPane.showConfirmDialog(null, "voulez-vous continuer", "INCiDENT Majeur", JOptionPane.PLAIN_MESSAGE);
    }
}

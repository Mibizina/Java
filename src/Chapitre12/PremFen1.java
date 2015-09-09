/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 * UTILISATION D'UNE CLASSE FENETRE PERSONNALISEE
 * @author Mihary
 */
import javax.swing.*;
class MaFenetre extends JFrame
{
    public MaFenetre()
    {
        setTitle("Ma premiere fenetre");
        setSize(300, 150);
    }
}
public class PremFen1 {
    public static void main (String args[])
    {
        JFrame fen = new MaFenetre();
        fen.setVisible(true);
        JFrame fen1 = new MaFenetre();
        fen1.setVisible(true);
    }
}

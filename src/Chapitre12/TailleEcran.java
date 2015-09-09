/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre12;

/**
 * CONNAITRE LA DIMENSION DE L'ECRAN
 * @author Mihary
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Vvkl extends JFrame
{
    Vvkl()
    {
        setTitle ("Taille fenetre");
        Toolkit tk = Toolkit.getDefaultToolkit(); //Toolkit fournit les dimensions de l'écran sous la forme d'un objet de type Dimension
        Dimension dimEcran = tk.getScreenSize();
        int larg = dimEcran.width;
        int haut = dimEcran.height;
        System.out.println("la taille de l'écran est " + larg+ " X " + haut);
        setSize(larg/2, haut/2);
    }
}

public class TailleEcran {
    public static void main (String args[])
    {Vvkl fen = new Vvkl();
    fen.setVisible(true);
    }
}

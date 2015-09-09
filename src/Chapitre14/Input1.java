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


public class Input1 {
public static void main(String [] args)
{
    String txt;
    while (true)
    {
        txt = JOptionPane.showInputDialog(null, "Donnez un texte", "Varavarankely", JOptionPane.INFORMATION_MESSAGE);
        if (txt== null)
        {
            System.out.println("pas de texte saisi");
            
        }
        else System.out.println("texte saisi " + txt);
    }
    
}
}

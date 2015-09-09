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

public class Confirrm1 {
public static void main (String [] args)
{
    while (true)
    {
        rep = JOptionPane.showConfirmDialog(null, "Voulez-vous continuer", "hello", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println("reponse : " +  rep);
        if (rep == 0)
        {
            System.out.println("helloworld");
        }
    }
    
    
}
static int rep;
}

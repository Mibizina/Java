/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre9;

/**
 *
 * @author Mihary
 */
public class EnumValeurs {
    public static void main (String args[])
    {
        System.out.println("Liste des valeurs de type Jour");
        for (Jour j : Jour.values())
        {
            System.out.println(j.toString());
        }
    }
}

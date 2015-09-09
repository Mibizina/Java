/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre7;

/**
 *
 * @author Mihary
 */
class Util
{
    static void raz(int t[] [])
    { 
        int i,j;
        for( i=0 ;i<t.length; i++)
            for (j=0 ; j<t[i].length ; j++)
                t[i][j] = 0;
    }
    static void affiche (int t[][])
    {
        int i,j;
        for (i=0; i<t.length ; i++)
        { System.out.print("Ligne de rang " + i + " = ");
        for (j=0; j<t[i].length ;j++)
            System.out.print(t[i][j] + " ");
        System.out.println();
        }
        
    }
}
public class Tab2ind1 {
    public static void main (String args[])
    {
        int t[][] = {{1,2,3},{11,12}, {21,22,23,24}};
        System.out.println("t avant raz : ");
        Util.affiche(t);
        Util.raz(t);
        System.out.println("Après raz : ");
        Util.affiche(t);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre9;

/**
 *  TRI LEXICOGRAPHIQUE
 * @author Mihary
 */
public class TriCH 
{
    public static void main(String args[])
    {
        String tabCh[] = {"java" , "c", "pascal", "c++", "ada", "basic", "fortran"};
        String temp;
        int i, j;
        int nbCh = tabCh.length;
        for (i=0 ; i<nbCh-1; i++)
            for (j=0; j<nbCh; j++)
                if ( (tabCh[i].compareTo(tabCh[j]) ) > 0)
                {
                    temp = tabCh[i];
                    tabCh[i] = tabCh[j];
                    tabCh[j] = temp;
                }
        System.out.println("Chaines triees : ");
        for (i=0; i<nbCh; i++) System.out.println(tabCh[i]);
    }
}
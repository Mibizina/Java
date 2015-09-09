/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre9;

/**
 *  CONVERSION CHAINE ET TABLEAU DE CARACTERE
 * @author Mihary
 */
public class ConvChCar {
    public static void main(String args[])
    {
        char mot [] = {'b','o','n','j','o','u','r'};
        String ch = new String(mot);
        System.out.println(ch);
        for(int i =0; i<mot.length ;i++) System.out.print(mot[i]);
        System.out.println();
        String ch1 = "BONJOUR";
        char mot1 [];
        mot1 = ch1.toCharArray();
        for(int j =0; j<mot.length ;j++) System.out.print(mot1[j]);
        System.out.println();
    }
}

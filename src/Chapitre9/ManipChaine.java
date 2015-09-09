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
public class ManipChaine {
public static void main(String args[])
{
    String ch = "bonjour";
    String ch1 = ch.replace('o', 'e');
    System.out.println(ch1);
    String ch2 = ch.substring(2);
    System.out.println(ch2);
    String ch3 = ch.substring(1, 3);
    System.out.println(ch3);
    String a = "    \n\tdes separateurs avant, pendant\t\n et apres \n\t    ";
    System.out.println(a);
    String a1 = a.trim();
    System.out.println(a1);
}
}

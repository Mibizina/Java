/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre9;

/**
 *  TEST STRINGBUFFER
 * @author Mihary
 */
public class TstStB {
    public static void main (String args[])
    {
        String ch = "la java";
        StringBuffer chBuf = new StringBuffer (ch);
        System.out.println(chBuf);
        chBuf.setCharAt (3, 'J'); System.out.println(chBuf);
        chBuf.setCharAt(1, 'e'); System.out.println(chBuf);
        chBuf.append(" 2"); System.out.println(chBuf);
        chBuf.insert(3, " langage "); System.out.println(chBuf);
    }
}

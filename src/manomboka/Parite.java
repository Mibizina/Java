/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manomboka;

/**
 *
 * @author Mihary
 */
public class Parite {
     public static void main(String[] args) {
         int n;
         n = 121;
         if ((n&1) == 0)
         {
             System.out.println(n + " pair");
         }
         else
         {
             System.out.println(n + " impair");
         }
     }
}

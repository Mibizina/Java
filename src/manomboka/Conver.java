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
public class Conver {
    public static void main(String[] args) {
        byte b1 = 50, b2 = 100;
        int n;
        n = b1 * b2; //b1 et b2 convertis en int avant le calcul
        System.out.println(b1 + "*" + b2 + "=" + n);
        int n1 = 100000, n2= 200000;
        long l1 =200000;
        long p,q;
        p= n1*n2;
        q= n1*l1;
        System.out.println(n1 + "*" + n2 + "=" + p);
        System.out.println(b1 + "*" + l1 + "=" + q);
        char c, c1;
        c = 'a';
        c1 = (char) (c+1);
        System.out.println(c + "+" + 1 + "=" + c1);
    }
}

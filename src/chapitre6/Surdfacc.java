/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapitre6;

/**
 * SURDEFINITION ET DROITS D'ACCES CHAPITRE 6 P142
 * @author Mihary
 */
public class Surdfacc 
{public static void main (String args[])
    {   A a= new A();
        a.g();
        System.out.println("---dans main");
        int n = 2; float x = 2.5f;
        a.f(n); a.f(x);
    }
}
class A{
    public void f(float x)
    {
        System.out.println("f(float) x = " + x);
    }
    public void f(int x)
    {
        System.out.println("f(int) x = " + x);
    }
    public void g()
    {
        int n = 1; float x=1.5f;
        System.out.println("---dans g");
        f(n); f(x);
    }
}

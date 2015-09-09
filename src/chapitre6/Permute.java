/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapitre6;

/**
 *
 * @author Mihary
 */
class Pointa
{
    public Pointa(int abs, int ord)
    {
        x = abs; y = ord;
    }    
    private int x,y;

    public void permuter(Pointa a)
    {
        Pointa c = new Pointa(0,0);
        c.x = a.x; c.y = a.y;
        a.x = x; a.y = y;
        x = c.x; y = c.y;
    }
    
    public void afficher()
    {System.out.println("Coordonnées : " + x + " " + y);}

}
public class Permute {
    public static void main (String args[])
    {
        Pointa a = new Pointa(1,2);
        Pointa b = new Pointa(2,5);
        a.afficher();b.afficher();
        a.permuter(b);
        a.afficher();b.afficher();
    }
}

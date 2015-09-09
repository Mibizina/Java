/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mihary
 */
class Cercle{
    class Centre
    {
        public Centre(int x, int y)
        {
            this.x = x; this.y = y;
        }
        public void affiche()
        {
            System.out.println(x + " " + y);
        }
        private int x,y;
    }
    public Cercle(int x, int y, double r)
    {
        c = new Centre(1,5);
        this.r = r;
    }
    public void affiche()
    {
        System.out.print("cercle de rayon " + r +" et de centre ");
        c.affiche();
    }
    public void deplace(int dx, int dy)
    {
        c.x +=dx; c.y +=dy;
    }
    private Centre c;
    private double r;
}

public class TstCercl {
public static void main (String args[])
{
    Cercle c1 = new Cercle(1,2,5.6);
    c1.affiche();
    c1.deplace(1, 1);
    c1.affiche();
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre8;

/**
 *
 * @author Mihary
 */
class Point
{
    public Point(int x, int y)
    {
        this.x = x; this.y =y;
    }
    public void deplace(int dx, int dy)
    {
        x += dx; y += dy;
    }
    public void affiche()
    {
        System.out.println("Je suis en " + x + " " + y);
    }
    private int x,y;
}

class PointCol extends Point
{
    public PointCol(int x, int y, byte couleur)
    {
        super(x,y);
        this.couleur = couleur;
    }
    public void affichec()
    {
        affiche();
        System.out.println(" et ma couleur est " + couleur);
    }
    private byte couleur;
}

public class TstPcol3 {
    public static void main (String args [])
    {
        PointCol pc1 = new PointCol(3, 5, (byte)3);
        pc1.affiche();
        pc1.affichec();
        
        PointCol pc2 = new PointCol(5, 8, (byte)2);
        pc2.affichec();
        pc2.deplace(1, -3);
        pc2.affichec();
    }
}

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
public class PointConstructeur {
    private int x,y;
    public PointConstructeur(int abs, int ord){
        x = abs;
        y = ord;
    }
     public void deplace (int dx, int dy)
    {
        x+=dx;
        y+=dy;
    }
    
    public void affiche()
    {
        System.out.println("Je suis le point de coordonné x = "+ x + " y = " + y);
    }
}

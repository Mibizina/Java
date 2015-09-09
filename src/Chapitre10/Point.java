/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre10;

/**
 *
 * @author Mihary
 */
class Point 
{
    public Point(int x, int y) throws ErrConst
    { 
        if ((x<0) || (y<0)) throw new ErrConst();
        this.x = x; this.y = y;
    }
    public void affiche()
    {
        System.out.println("coordonnées : " + x + " " + y);
    }
    public void deplace(int dx, int dy) throws ErrDepl
    {
       if ((x+dx)<0 || (y+dy<0)) throw new ErrDepl();
        x += dx; y += dy;
    }
    private int x,y,dx,dy;
}
class ErrConst extends Exception
{}
class ErrDepl extends Exception
{}
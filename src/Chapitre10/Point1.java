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
class Point1 {
public Point1 (int x, int y) throws ErrConst1
{
    if ((x<0) || (y<0)) throw new ErrConst1(x,y);
    this.x = x; this.y = y;
}
public void affiche1()
{
    System.out.println("Coordonnées : " + x + " " + y);
}
private int x ,y;
}
class ErrConst1 extends Exception
{
    ErrConst1 (int abs, int ord)
    {
        this.abs = abs; this.ord = ord;
    }
    public int abs,ord;
}

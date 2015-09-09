/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre10;

/**
 *  REDECLENCHEMENT D'UNE EXCEPTION
 * @author Mihary
 */
class Point3
{
    public Point3(int x, int y) throws ErrConst3
    {
        if ((x<=0) || (y<=0)) throw new ErrConst3();
        this.x = x;this.y =y;
    }
    public void f() throws ErrConst3
    {
        try 
        {
            Point3 p = new Point3(-3 , 2);
        }
        catch (ErrConst3 e)
        {
            System.out.println("dans catch (ErrConst3) de f");
            throw e; //on repasse l'exception à un niveau superieur
        }
    }
    private int x,y;
}
class ErrConst3 extends Exception
{}
public class Redecl {
  public static void main (String args[]) 
  {try
   { 
       Point3 a = new Point3 (1, 4);
   a.f();
   }
  catch (ErrConst3 e)
  {
      System.out.println("dans catch (ErrConst) de main");
  }
  System.out.println("apres le bloc try main");    
  }
}

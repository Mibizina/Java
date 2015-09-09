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
class Point4
{
    public Point4(int x, int y) throws ErrConst4
    {
        if ((x<=0) || (y<=0)) throw new ErrConst4();
        this.x = x; this.y = y;
    }
    public void f() throws ErrConst4, ErrBidon
    {
        try 
        {
            Point4 p = new Point4 (-3, 2);
        }
        catch(ErrConst4 e){
            System.out.println("dans le catch (ErrConst) de f");
            throw new ErrBidon(); //on lance une nouvelle exception
        }
    }
    private int x, y;
}
class ErrConst4 extends Exception
{}
class ErrBidon extends Exception
{}
public class Redecl1 {
  public static void main (String args[])
  {
      try
      {
          Point4 a = new Point4(1, 4);
          a.f();
      }
      catch (ErrConst4 e)
      {
          System.out.println("Dans le catch (ErrConst4) de main");
      }
      catch (ErrBidon e)
      {
          System.out.println("dans catch (ErrBidon) de main");
      }
      System.out.println("Apres le bloc try main");
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre11;

import Chapitre9.Clavier;

/**
 * UTILISATION DE WAIT ET NOTIFY ALL
 * @author Mihary
 */
public class Synchr4 {
    public static void main (String args[])
    {
       Nombre nomb = new Nombre();
       Thread calc = new ThrChange(nomb);
       Thread aff = new ThrAffi (nomb);
       System.out.println("Suite de carres - tapez retour pour arreter");
       calc.start(); aff.start();
       Clavier.lireString();
       calc.interrupt();aff.interrupt();
    }
    
}

class Nombre 
{
    public synchronized void calcul() throws InterruptedException
    {
        if (!pret)
        {
            n++;
            carre = n*n;
            pret = true;
            notifyAll();
        }
        else wait();
    }
    public synchronized void affiche()
    {
        try
        {
            if (pret)
            {
                System.out.println(n + " a pour carre " + carre);
                notifyAll();
                pret = false;
            }
            else wait();
        }
        catch (InterruptedException e){}
    }
    public boolean pret ()
    {
        return pret;
    }
    private int n=1, carre;
    private boolean pret = false;
}

class ThrChange extends Thread
{
    public ThrChange (Nombre nomb)
    {
        this.nomb = nomb;
    }
    public void run()
    {try
    {
        while (!interrupted())
        {
            nomb.calcul();
            sleep(5);
        }
    }
    catch (InterruptedException e){}
    
        }
    private Nombre nomb;
}
class ThrAffi extends Thread
{
    public ThrAffi(Nombre nomb)
    {
        this.nomb = nomb;
    }
    public void run()
    {
        try
        {
            while (!interrupted())
            {
                nomb.affiche();
                sleep(2);
            }
        }
        catch (InterruptedException e){}
    }
    private Nombre nomb;
}
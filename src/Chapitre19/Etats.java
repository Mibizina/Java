/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre19;

import javax.swing.JApplet;

/**
 *
 * @author Mihary
 */

public class Etats extends JApplet{
    public Etats()
    {
        System.out.println("Construction");
    }
    public void init()
    {
        System.out.println("Appel init");
    }
    public void start()
    {
        System.out.println("Appel start");
    }
    public void stop()
    {
        System.out.println("Appel stop");
    }
    public void destroy()
    {
        System.out.println("Appel destroy");
    }
}

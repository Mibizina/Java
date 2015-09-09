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
public class TstPcol2 {
public static void main (String args[])
{
    Pointcol pc1 = new Pointcol();
    pc1.initialise(3, 5);
    pc1.colore((byte)3);
    pc1.affiche();
    pc1.affichec();
    Pointcol pc2 = new Pointcol();
    pc2.initialisec(5, 8, (byte)2);
    pc2.affichec();
    pc2.deplace(1, -3);
    pc2.affichec();
}
}

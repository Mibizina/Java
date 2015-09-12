/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre24;

/**
 *  Accès aux différentes informations relatives aux champs d'une classe
 * @author Mihary
 */
import java.lang.reflect.*; //pour les methodes de Class
public class MethodesClass2 {
    public static void main (String args[])
    {
        Pointt p = new Pointt();
        Class<?> c = p.getClass();
        Field champs[] = c.getDeclaredFields();
        // affichage des informations relatives aux champs de la classe de p
        for (Field champ : champs)
        {
            System.out.println("--- Champ de nom : " + champ.getName());
            System.out.println("type : " + champ.getType().getName());
            int mod = champ.getModifiers();
            System.out.println("modificateurs : " + mod);
            if (Modifier.isPrivate(mod)) System.out.println("prive");
            if (Modifier.isStatic(mod))  System.out.println("Static");
        }
    }
}
class Pointt
{
    public Pointt() {x=0; y=0; compte++;}
    public Pointt(int x, int y){this.x = x; this.y = y; compte++;}
    public void deplace (int dx, int dy) {x+=dx; y+=dy;}
    public void symetrise() {x =- x; y = -y;}
    public static void afficheNbre()
    {
        System.out.println("il y a " + compte + "points");
    }
    private int x, y;
    public static int compte = 0;
    protected int z;
}
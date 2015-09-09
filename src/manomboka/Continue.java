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
public class Continue {
     public static void main(String[] args) {
            int i;
            for (i=1;i<10;i++)
            {
              System.out.println("Boucle " + i);
              if (i<4) continue;
              System.out.println("Fin Boucle " + i);
            }
            System.out.println("ON EST SORTIE DE LA BOUCLE ");
    }
}

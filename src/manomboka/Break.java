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
public class Break {
        public static void main(String[] args) {
            int i;
            for (i=1;i<10;i++)
            {
                if (i==5) break;
                System.out.println("début tour " + i);
                System.out.println("KAIZA ");
                
                System.out.println("fin tour " + i);
            }
        System.out.println("FIN BOUCLE ");
        }
       
}

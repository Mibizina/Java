/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre9;

/**
 *
 * @author Mihary
 */
public class EnumSwitch {
public static void main (String args[])
{
    Andro anio;
    anio = Andro.alatsinainy;
    switch (anio)
    {
        case alatsinainy:
        case talata:
        case alarobia:
        case alakamisy: System.out.println("Mikandra isika an!"); break;
        case zoma: System.out.println("Efa hifarana ny herinandro"); break;
        case sabotsy : 
        case alahady : System.out.println("Faran'ny herinandro ity eeeee!");
            
    }
}
}
enum Andro {alatsinainy, talata, alarobia, alakamisy, zoma, sabotsy, alahady}
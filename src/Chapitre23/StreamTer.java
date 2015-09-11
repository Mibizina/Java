/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre23;

/**
 *
 * @author Mihary
 */
import java.util.stream.*;
import java.util.*;
public class StreamTer {
    public static void main (String args[])
    {
        // max, min, sum, average sur un IntStream
        int [] tab = {2, 15, -3, 2, -5, 34, 23, 4, -8, 12};
        OptionalInt max = IntStream.of(tab).max();
        // exploitation de max avec IsPresent
        if (max.isPresent())
            System.out.println("Max pos de tab avec isPresent = " + max.getAsInt());
        //exploitation de max avec orElse (par convention ici 0 si valeur absente)
        System.out.println("Max pos de tab avec orElse =    " + max.orElse(0));
        //exploitation de max avec ifPresent
        max.ifPresent(xx -> System.out.println("Max pos de tab avec ifPresent = " + max.getAsInt()));
        int somme = IntStream.of(tab).filter(ee->ee>0).sum();
        System.out.println("Somme des positifs de tab : " + somme);
        OptionalDouble moyenne = IntStream.of(tab).filter(ee -> ee<0).average();
        if (moyenne.isPresent())
            System.out.println("Moyenne des <0 de tab = " + moyenne.getAsDouble());
        else System.out.println("Aucun nombre <0 dans tab ");
            System.out.println("Somme des >0 de tab : " + somme);
        // max sur un Stream<Integer>
        Integer [] tabObj = {2, 15, -3, 2, -5, 34, 23, 4, -8, 12};
        Optional<Integer> maxObj = Stream.of(tabObj).max(Comparator.naturalOrder());
        if (maxObj.isPresent())
            System.out.println("Max de positifs de tabObj = " + maxObj.get());
    }
}
/*
 * Methode reduce
    IntStream int;
stri.reduce (0, (xx, yy) -> xx + yy
Point somme2 = strPoints.reduce (new Point(0,0),
(p,q) -> ( new Point (p.getX() + q.getY()+q.getY())));

Methode Collect
List<Point> liste = strInt.map(xx -> new Point (xx, 2*xx)).collect(Collectors.toList());
Map<Integer, Point> mapPoints = strInt.distinct().map(xx -> new Point(xx, 2*xx)).collect(Collectors.toMap(Point::getX, xx -> xx));

Map<Integer, List<Point>> mapPoints2 = strInt.map(xx -> new Point (xx, 2*xx)).collect(Collectors.groupingBy(Point::getX));

String ch = strInt.map(xx -> new Point (xx, 2*xx)).map(xx -> "[" + xx.getX()+", "+xx.getY()+"]").collect(Collectors.joining(" ; ")) ;

 * 
*/
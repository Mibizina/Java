/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre24;

/**
 * Obtention des annotations présentes sur un élément
 * @author Mihary
 */
import java.lang.annotation.*;
import java.lang.reflect.*;
public class IntroAnnot2 {
    public static void main (String args[]) throws NoSuchMethodException
    {
        Annotation[] annotationsDeC = C.class.getAnnotations();
        System.out.println("Annotations de la classe C : ");
        for (Annotation c : annotationsDeC)
            System.out.println(c.annotationType().getName());
        
        Method m1 = C.class.getDeclaredMethod("f");
        Annotation[] annotationsDEf = m1.getAnnotations();
        System.out.println("Annotations de la methode C.f");
        for (Annotation c : annotationsDEf)
            System.out.println(c.annotationType().getName());
        
        Annotation[] annotationsDeD = D.class.getAnnotations();
        System.out.println("Annotations de la classe D : ");
        for (Annotation c : annotationsDeD)
            System.out.println(c.annotationType().getName());
        Annotation[] annotationsDeclDeD = D.class.getDeclaredAnnotations();
        System.out.println("Annotations declarees de la classe D : ");
        for (Annotation c : annotationsDeclDeD)
            System.out.println(c.annotationType().getName());
    }
}

@Deprecated
@Infos(message = "Message Classe C", value = 20)
class C
{
    @Deprecated
    @Infos (message = "Message methode f")
    void f() {}
}
class D extends C
{
    @Override
    void f() {}
}
//erreur à ignorer

/*
@Retention (RetentionPolicy.RUNTIME)
@Inherited
@interface Infos


{
    String message() default "Rien";
    int value() default 0;
}

*/
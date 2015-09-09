/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre20;

/**
 *  COTE SERVEUR
 * @author Mihary
 */
import java.io.*;
import java.net.*;

public class Serveur {
    public static void main (String args[]) throws IOException
    {
        int port = 1000;
        ServerSocket sersoc = new ServerSocket(port);
        System.out.println("serveur actif sur le port " + port);
        while (true)
        {
            Socket soc = sersoc.accept(); //accept c'est pour la socket associé à l'objet
            InputStream flux = soc.getInputStream();
            BufferedReader entree = new BufferedReader(new InputStreamReader(flux));
            String message = entree.readLine();
            System.out.println("message reçu sur le serveur = " + message);
        }
    }
}

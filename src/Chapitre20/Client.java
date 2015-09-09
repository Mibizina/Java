/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre20;

/**
 *
 * @author Mihary
 */
import java.net.*;
import java.io.*;
public class Client {
    public static void main (String args[]) throws IOException
    {
        String hote = "127.0.0.1";
        int port = 1000;
        Socket soc = new Socket(hote, port);
        OutputStream flux = soc.getOutputStream();
        OutputStreamWriter sortie = new OutputStreamWriter (flux);
        sortie.write("message envoye au serveur ou pas \n");
        sortie.flush(); //pour forcer l'envoi de la ligne , flush vide le tampon
    }
}

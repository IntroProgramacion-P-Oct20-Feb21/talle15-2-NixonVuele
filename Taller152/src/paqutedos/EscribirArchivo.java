/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqutedos;
import java.util.Formatter;
import paquetetres.*;

/**
 *
 * @author reroes
 */
public class EscribirArchivo {
    public static void equipos(String datos){
        try {
            Formatter salida = new Formatter("data/problema2.txt");
            salida.format("%s\n", datos);
            salida.close();

        } catch (Exception e) {
            System.err.println("NO es posible crear el archivo");
            System.exit(1);

        }
    }
    
}
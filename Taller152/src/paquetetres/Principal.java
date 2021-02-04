/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;
import java.util.Scanner;
import paquetetres.EscribirArchivo;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal="";
        String[] libros = {"El camino a un mejor programador", 
            "Scrum & eXtreme Programming", 
            "Lógica de programación", 
            "Metodología programación orientada a objetos", 
            "Java Como Programar", 
            "Python 3 al descubierto"};
        
        String[] autores = {"Anónimo", 
            "Eugenia Bahit", 
            "Omar Iván Trejos Buriticá", 
            "López Román Leobardo", 
            "Dietel, P. y Dietel, H", 
            "Fernández Arturo"};
        
        int[] clave1 = {2, 1, 0, 2, 0, 1};
        
        int[] clave2 = {1, 1, 1, 2, 2, 0};
        
        int[][] identificativoLibro = {
            {8761, 12334, 34567},
            {65431, 43211, 7890},
            {123890, 12344, 2345} };
        try {
            System.out.println("Libros a prestar:\n"
                + "El camino a un mejor programador opción 0\n"
                + "Scrum & eXtreme Programming  opción 1\n"
                + "Lógica de programación opción 2\n"
                + "Metodología programación orientada a objetos opción 3\n"
                + "Java Como Programar opción 4 \n"
                + "Python 3 al descubierto opción 5\n"
                + "Segun el numero de las opcionciones cual libro desea leer?");
            int numLibro = entrada.nextInt();
            if (numLibro>5 ||numLibro<0) {
                throw new Exception("No existe un libre con esa opcion.");   
                }
            if (numLibro >= 0 && numLibro <= 5) {
                int i =clave1[numLibro];
                int j =clave2[numLibro];
                cadenaFinal = String.format("Se le presta el libro %s "
                        + "cuyo autor es: %s y tiene un identificativo de %d",
                        libros[numLibro],autores[numLibro],
                        identificativoLibro[i][j]);
            }
            EscribirArchivo.agregarLibros(cadenaFinal);
        } catch (Exception e) {
            System.err.println("Lo sentimos no existe un libro con esa opcion");
        }
    }

}
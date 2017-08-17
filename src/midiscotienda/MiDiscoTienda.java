/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midiscotienda;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class MiDiscoTienda {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Bienvenido al catálogo de discos");
        
        System.out.println("Creación del disco");
        System.out.println("Disco: ");
        String disco = in.next();
        System.out.println("Artista: ");
        String artista = in.next();
        System.out.println("Género: ");
        String genero = in.next();
        System.out.println("Imagen: ");
        String imagen = in.next();        
        Disco d = new Disco(disco,artista,genero,imagen);
        
        System.out.println("Creación de canción");
        System.out.println("Nombre canción: ");
        String cancion = in.next();
        System.out.println("Precio: ");
        Double precio = in.nextDouble();
        System.out.println("Duración: ");
        Double duracion = in.nextDouble();
        System.out.println("Tamaño: ");
        Double tamaño = in.nextDouble();   
        System.out.println("Calidad: ");
        Double calidad = in.nextDouble();   
        d = new Disco(disco,artista,genero,imagen);
    }
    
}

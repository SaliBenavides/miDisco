/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midiscotienda;

/**
 *
 * @author Estudiante
 */
public class Disco {
    private String nombre,artista,genero,imagen;
    private Cancion[] cancion;

    public Disco(String nombre, String artista, String genero, String imagen) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.imagen = imagen;
        this.cancion = new Cancion[3];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public Cancion[] cancion(){
       return this.cancion;
    }
    
}

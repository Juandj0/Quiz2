/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class WebGallery {
    private String nombre;
   public WebGallery(String nombre) {
        this.artistas = new ArrayList();
          
       
        this.compradores = new ArrayList();
        this.nombre=nombre;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private ArrayList<Artista> artistas;
    private ArrayList<Comprador> compradores;

   
     public void addArtista(Artista artista){
        this.artistas.add(artista);
    }
    
      public void addComprador(Comprador comprador){
        this.compradores.add(comprador);
    }
    public String getNombre() {
        return nombre;
    }
    public void valorTotalObras(ArrayList<Artista> artistas){
    
    
    }
    public void ObrasDeUnartista(String nombreArtista){
    
    
    }
    
}

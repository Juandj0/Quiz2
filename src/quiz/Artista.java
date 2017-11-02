/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Artista extends Usuario {
    private ArrayList<Obra> obras;

    public Artista(String nombre) {
        super(nombre);
        this.obras = new ArrayList();
    }
    public void addObra(Obra obra){
        this.obras.add(obra);
    }
    public void listarObras(){
    
    
    }
    public int ValorTotalObras(){
    int valort=0;
    return valort;
    }
}

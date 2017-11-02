/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.io.*;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Quiz {

     public static void main (String[] args){
        File archivoLectura = new File("quiz.txt");
            WebGallery w= new WebGallery("Galeria virtual");
        try{
        
            String tipo =" ";
            Scanner archivo = new Scanner (archivoLectura);
            archivo.useDelimiter(";");
            archivo.useDelimiter(",");
      
           
            while(archivo.hasNext()){
              
               String nombre= archivo.next();
               Artista a= new Artista(nombre);
              if(archivo.hasNextInt()){
              int obras= archivo.nextInt();
              int valorObra=0;
                for(int i=1;i< obras;i++){
                      String obra = archivo.next();
                      if (archivo.hasNextInt()){
                        valorObra=archivo.nextInt();
                          
                        
                        
                      }
                }
                    
                }
            
             
             }
             //  System.out.println(nombre);

            }
         catch(FileNotFoundException ex){
        }
                    int continuar = 1, opcion = 0;
                        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Bienvenido a " +w.getNombre());
            System.out.println();
            System.out.println("1. Añadir un artista");
            System.out.println("2. Añadir un nuevo comprador");
            System.out.println("3. Mostrar el precio de las obras almacenadas");
            System.out.println("4. Mostrar las obras de un autor");
            System.out.println(" ");
            opcion = in.nextInt();
            switch (opcion){
                case 1:

             
//                if (tipo.equals("P")){
//                    String nombre = archivo.next();
//                    int edad = archivo.nextInt();
//                    String profesion = archivo.next();
//                    double salario = archivo.nextDouble();
//                    Profesor profesor = new Profesor(profesion, salario, nombre, edad);
//                    universidad.addPersona(profesor);
//                }else if (tipo.equals("E")){
//                    String nombre = archivo.next();
//                    int edad = archivo.nextInt();
//                    String carrera = archivo.next();
//                    Estudiante est = new Estudiante(carrera, nombre, edad);
//                    universidad.addPersona(est);
//                }
            }
//            for (int i = 0; i< universidad.getPersonas().size();i++){
//            System.out.println(universidad.getPersonas().get(i).getNombre());
//            }
            
             
       
    } while(continuar == 1);
    
    }
    
}

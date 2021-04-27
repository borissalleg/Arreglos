/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import Personas.Persona;
import arreglos.Vector;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Forsaken
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          
        
          Scanner sc = new Scanner(System.in);
        /*  
          int tamano;
          System.out.print("Digite el tamaño del vector");
          tamano=sc.nextInt();
          Vector v = new Vector(tamano);
          
          for (int i=0;i<=tamano;i++)
          {
              int x=i+1;
            Persona p = new Persona();  
            System.out.print("Digite Nombre de la persona "+""+x);
            p.setNombre(sc.next());
            
            System.out.print("Digite Edad de la persona "+""+x);
            p.setEdad(sc.nextInt());
               
            v.insertar(p);
          }    
          
           System.out.print(v.getV());
           v.imprimirvector();
        
        
       
          
     */
        
       boolean salir = false;
        int t,opcion; //Guardaremos la opcion del usuario
        System.out.println("Digite de cuantos elementos será el vector");
        t= sc.nextInt();
        Vector v = new Vector(t);
            
        while (!salir) {
 
            System.out.println("1. insertar elementos");
            System.out.println("2. listar vector");
            System.out.println("3. Indicar elementos");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        {    
                            Persona p = new Persona();  
                            System.out.print("Digite Nombre de la persona "+"");
                            p.setNombre(sc.next());

                            System.out.print("Digite Edad de la persona "+"");
                            p.setEdad(sc.nextInt());
                            v.insertar(p);
                        }                          
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        if (!v.vectorvacio())
                             v.imprimirvector();
                        else
                            System.out.println("El vector aún no contiene elementos ");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        System.out.println("El vector tiene alamacenado "+v.getI()+1+" elementos de "+t+(-1));
                    
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }    
        
    }
    
}

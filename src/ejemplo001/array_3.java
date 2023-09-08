/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo001;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class array_3 {
    
      Scanner teclado=new Scanner(System.in); // objeto para leer valores de teclado
    
    public void array1(){
    int arreglo1[];
    
        System.out.println("Teclea el tamano del vector");
        int tamano=teclado.nextInt();
        
        
        arreglo1=new int[tamano];
        
        
        
        //System.out.println(arreglo1.length);
        
        for(int i = 0; i<tamano; i++){
            System.out.println("Teclea el valor del indice "+i+": ");
            int valor =teclado.nextInt();
            arreglo1[i]= valor;
        }
        
        for(int i = 0; i<tamano; i++){
            System.out.println("El valor del indice "+i+" es: "+arreglo1[i]);
        }
    }
    
}

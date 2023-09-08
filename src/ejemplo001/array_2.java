/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo001;

import java.util.Scanner; //importar clase para leeer desde el teclado
/**
 *
 * @author LSO
 */
public class array_2 {
    Scanner teclado=new Scanner(System.in); // objeto para leer valores de teclado
    
    public void array1(){
    int arreglo1[];
    
        System.out.println("Teclaea el tamaño del vector");
        int tamano=teclado.nextInt();
        
        arreglo1=new int[tamano];
        
        System.out.println(arreglo1.length);
        
    }
    
}

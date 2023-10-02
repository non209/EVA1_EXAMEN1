/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer7;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EJER7  {

    
    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("¿Cuál cálculo busca realizar?");
       System.out.println("1. Calcular la pendeinete para un valor de x");
       System.out.println("2. Calcular el área entre dos valores de x");
       
        int opcion = scanner.nextInt();
            switch (opcion) {
                case 1-> {
                    
        System.out.println("Ingresa el valor de x: ");
        double x = scanner.nextDouble();
        double pendiente = 2 * x; 
        System.out.println("La pendiente en x = " + x + " es " + pendiente); 
    }
                case 2-> {       
              System.out.println("Capture el valor de la x inicial: ");
              double xInicial = scanner.nextDouble();
              System.out.println("Capture el valor de la x final: ");
              double xFinal = scanner.nextDouble();
              
              
        double area  = (xFinal * xFinal * xFinal / 3) - (xInicial * xInicial * xInicial / 3);
            System.out.println("El área bajo la curva de x = " + xInicial + " y x = " + xFinal + " es " + area);
                }
            default-> System.out.println("Opción no válida");
              }
    }
        
     
        
}
        
              
         
       
       
       
    


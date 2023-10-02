/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc3_tuberia;

import java.util.Scanner;

/**
 *
 * @author Yahir
 */
public class EJERC3_TUBERIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);

        System.out.print("Radio de la tubería (metros): ");
        double radio = input.nextDouble();

        System.out.print("Velocidad del flujo de agua (m/s): ");
        double velocidad = input.nextDouble();

        double flujo = 3.1416 * Math.pow(radio, 2) * velocidad;
        System.out.println("Respuesta" + flujo + " m^3/s");

    
    }
    
}

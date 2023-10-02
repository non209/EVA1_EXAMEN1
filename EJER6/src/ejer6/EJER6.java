/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer6;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EJER6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la velocidad angulari inicial de la rueda en radianes: ");
            double velocidadInicial = input.nextDouble();
        System.out.println("Ingresa la velocidad final de la rueda en radianes: ");
            double velocidadFinal = input.nextDouble();
        System.out.println("Ingresa el tiempo de rotación en segundos: ");
            double tiempo = input.nextDouble();
        System.out.println("Ingresa el radio de la rueda en metros: ");
            double radio = input.nextDouble();
        
            
            double distanciaAngular = (velocidadInicial + velocidadFinal) * tiempo  / 2.0;
            double distanciaMetros = distanciaAngular * radio;
            double velocidadAngularPromedio = distanciaAngular / tiempo;
            double velocidadMetrosPorSegundoPromedio = distanciaMetros / tiempo;
            double aceleracionAngular = (velocidadFinal - velocidadInicial) / tiempo;
            double aceleracionMetrosPorSegundoCuadrado = aceleracionAngular * radio;
            double frecuenciaGiro = velocidadFinal / (2 * Math.PI);
            
        System.out.println("Resultados: ");
        System.out.println("Distancia angular recorrida (θ): " + distanciaAngular + " radianes");
        System.out.println("Distancia en metros recorrida (s): " + distanciaMetros + " metros");
        System.out.println("Velocidad angular promedio (ω promedio): " + velocidadAngularPromedio + " radianes/s");
        System.out.println("Velocidad en m/s promedio (v promedio): " + velocidadMetrosPorSegundoPromedio + " m/s");
        System.out.println("Aceleración angular (α): " + aceleracionAngular + " radianes/s^2");
        System.out.println("Aceleración en m/s^2 (a): " + aceleracionMetrosPorSegundoCuadrado + " m/s^2");
        System.out.println("Frecuencia de giro: " + frecuenciaGiro + " Hertz");

            
        
    }
    
}

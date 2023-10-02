/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
    import java.util.Scanner;

    /**
    *
    * @author angel
    *
    */
public class EJER4_CIRC_ELEC {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Captura el voltaje en voltios: ");
        double voltaje = scanner.nextDouble();

        
        double[] resistencias = new double[5];

       
            for (int i = 0; i < 5; i++) {
        System.out.print("Ingresa el valor de la resistencia " + (i + 1) + " en ohms: ");
            resistencias[i] = scanner.nextDouble();
        }

       
        double sumaInversa = 0.0;
            for (int i = 0; i < 5; i++) {
            sumaInversa += 1.0 / resistencias[i];
        }
        double resistenciaEquivalente = 1.0 / sumaInversa;

       
        double intensidadCorriente = voltaje / resistenciaEquivalente;

       
        System.out.println("Resultado de la resistencia: " + resistenciaEquivalente + " ohms");
        System.out.println("Intensidad de corriente: " + intensidadCorriente + " ampers");

       
            for (int i = 0; i < 5; i++) {
        double intensidadResistencia = voltaje / resistencias[i];
        System.out.println("Intensidad de la corriente en la resistencia " + (i + 1) + ": " + intensidadResistencia + " ampers");
            
            
        }
        
    }
    
}
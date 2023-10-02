/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fdp_exa_practico_eva1;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class FDP_EXA_PRACTICO_EVA1 {

    
    //Conversor de temperaturas
    
    public static void main(String[] args) {

        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la temperaruta en grados farenheit:");
        double Farenheit = captu.nextDouble();
        
        
       double celcius = (Farenheit - 32) * 1.8;
       double kelvin = Farenheit + 273.15;
       
       
       System.out.println(Farenheit + " grados Farenheit son equivalentes a: " + celcius + " grados celcius");
       System.out.println(Farenheit + " grados Farenheit son equivalentes a: " + kelvin + " grados kelvin");
     
       
       
    }
    
}



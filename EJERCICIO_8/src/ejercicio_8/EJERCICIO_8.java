
package ejercicio_8;

import java.util.Scanner;

public class EJERCICIO_8 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       double a, b, c, dist, sum, cx, cy, vx1, vx2, vy1, vy2, foco1, foco2, focoy1, focoy2;       
       
        System.out.println("Programa para calcular:\nLas distancias focales.\nCoordenadas de los vertices.\nLas coordenadas del centro al foco. \n ");
        
        System.out.println("Por favor introduzca _a_");
        a = sc.nextDouble();
        System.out.println("Por favor introduzca _b_");
        b = sc.nextDouble();
        System.out.println("Por favor introduzca las coordenadas del centro de la hiperbola: 'x' 'y'  ");
        cx = sc.nextDouble();
        cy = sc.nextDouble();
        
        
        
        
        
        
        
        
        
        
        //Distancia del centro al foco
        c = Math.sqrt(a*a + b*b);
        System.out.println("Esta es la distancia que hay del centro al foco: "+c);
        vx1 = cx + a;
        vx2 = cx - a;
        vy1 = cy;
        vy2 = cy;
   
        foco1 = cx + c;
        foco2 = cx - c;
        
        focoy1 = cy;
        focoy2 = cy;
        //coordenadas de los vertices
         System.out.println("Coordenadas de los vértices: (" + vx1 + ", " + vy1 + "), (" + vx2 + ", " + vy2 + ")");
        //coordenadas de los focos 
        System.out.println("Coordenadas de los focos: (" + foco1 + ", " + focoy1 + "), (" + foco2 + ", " + focoy2 + ")");
        
    }
    
}

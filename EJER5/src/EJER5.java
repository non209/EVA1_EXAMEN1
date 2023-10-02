 import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
        double g = 9.81;
        
        double vo ; // velocidad inicial
        System.out.println("Cual es la velocidad inicial? (m/s)?");
        vo = sc.nextDouble();
        
        double angulo = 45;
        double sen;
        sen = 707106781;
        double altura;
        double distancia;
        
        double voe = (vo * vo);
        double sene = (sen * sen);
       
        
        double senee = ( sen*(2 * angulo) );
        
        System.out.println("La altura maxima que alcanza es de:" + (voe*sene) / (g*2) + "m");
        
        //vel inicial en y
        double vely = vo*(sen);
        double t = vely / g;
        
        double cos = 707106781;
        double velx = vo*(cos);
        
        System.out.println("La distancia maxima recorrida es de:" + (t*velx) + "m");
    }
}


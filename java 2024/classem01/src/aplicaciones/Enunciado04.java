package aplicaciones;
import java.util.Scanner;


public class Enunciado04 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la base del rectangulo: ");
        double base = scanner.nextDouble();
        
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = scanner.nextDouble();
        
        double area = base * altura;
        
        double perimetro = 2 * (base + altura);
        
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        
        scanner.close();
    }
    
}

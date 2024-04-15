package aplicaciones;
import java.util.Scanner;


public class Enunciado05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el radio y la altura del cilindro
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();
        
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();
        
        // Definir el valor de pi
        double pi = Math.PI;
        
        // Calcular el área total del cilindro
        double areaTotal = 2 * pi * radio * (radio + altura);
        
        // Calcular el volumen del cilindro
        double volumen = pi * Math.pow(radio, 2) * altura;
        
        // Mostrar resultados
        System.out.println("El area total del cilindro es: " + areaTotal);
        System.out.println("El volumen del cilindro es: " + volumen);
        
        scanner.close();
    }
    
}

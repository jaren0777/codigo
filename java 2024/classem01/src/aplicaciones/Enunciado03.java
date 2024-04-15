package aplicaciones;
import java.util.Scanner;


public class Enunciado03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el largo del terreno en metros: ");
        double largo = scanner.nextDouble();
        
        System.out.print("Ingrese el ancho del terreno en metros: ");
        double ancho = scanner.nextDouble();
        
        double costoPorMetroCuadrado = 750;
        
        double area = largo * ancho;
        
        double precio = area * costoPorMetroCuadrado;
        
        // Mostrar resultados
        System.out.println("El area del terreno es: " + area + " metros cuadrados");
        System.out.println("El precio del terreno es: S/. " + precio);
        
        scanner.close();
    }
    
}

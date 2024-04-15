package aplicaciones;
import java.util.Scanner;

public class Enunciado02 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de Indice de Masa Corporal (IMC)");
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.println("-------reporte------");
        System.out.println("--------------------"); 
        System.out.println("Su indice de masa corporal (IMC) es: " + imc);
        
        scanner.close();
    }
    
}

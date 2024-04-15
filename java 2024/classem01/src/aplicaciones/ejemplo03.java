package aplicaciones;
import java.util.Scanner;


public class ejemplo03 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      float base, altura, area;
        System.out.print("ingrese un numero para base : ");
        base = Float.parseFloat(teclado.nextLine());
        
        System.out.print("ingrese un numero para altura : ");
        altura = Float.parseFloat(teclado.nextLine());
        area = base * altura;
        System.out.println("-----reporte-----");
        System.out.println("-----------------");
        System.out.println("la base es : " + base);
        System.out.println("la altura es : " + altura);
        
        System.out.println("el area es : " + area);
    }
    
}

package aplicaciones;
import java.util.Scanner;

public class CEjemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float base, altura, area;
        System.out.print("Ingrese valor de la base:");
        base = Float.parseFloat(teclado.nextLine());
        System.out.print("Ingrese valor de la altura:");
        altura = Float.parseFloat(teclado.nextLine());        
        
        area = base*altura;
                        
        System.out.println("------Reporte-------");
        System.out.println("------------");
        System.out.println("la base es:" + base);
        System.out.println("la altura es:" + altura);
        System.out.print("el area es:"+area);
        
        
    }
    
}

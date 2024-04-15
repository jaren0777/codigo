package aplicaciones;
import java.util.Scanner;
public class CEjemplo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float peso, estatura, IMC;
        System.out.print("Ingrese su peso:");
        peso = Float.parseFloat(teclado.nextLine());
        System.out.print("Ingrese su estatura:");
        estatura = Float.parseFloat(teclado.nextLine());        
        
        IMC = peso/(estatura*estatura);
                        
        System.out.println("------Reporte-------");
        System.out.println("------------");
        System.out.println("la base es:" + peso);
        System.out.println("la altura es:" + estatura);
        System.out.println("el IMC es:"+ IMC);
        
        
    }
    
}
    

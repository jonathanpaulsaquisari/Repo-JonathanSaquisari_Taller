import java.util.Random;
import java.util.Scanner;
public class IfSimple {
    public static void main(String[] args) {
    Scanner tcl = new Scanner(System.in);
    int edad;
        System.out.println("Ingrese su edad: ");
        edad = tcl.nextInt();
        if (edad >= 18) 
            System.out.println("Acceso Permitido");
    }
}
import java.util.Scanner;
public class IfDoble {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int nota_final;
        System.out.print("Ingrese la nota final (0-100): ");
        nota_final = tcl.nextInt();
        if(nota_final >= 70)
            System.out.println("Aprobado");
        else
            System.out.println("Reprobado");
    }
}

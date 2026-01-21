import java.util.Scanner;
public class DoWhileBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1.Saludar" + "\n" + "2.Mostrar fecha" + "\n" + "" + "3.Salir");
            System.out.print("Ingreso: ");
            opcion = tcl.nextInt();
            if (opcion == 1) {
                System.out.println("Hola bienvenido");
            } else if (opcion == 2) {
                System.out.println("Es 2026");
            } else if (opcion == 0) {
                System.out.println("Saliste exitosamente");
            } else {
                System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
    }
}

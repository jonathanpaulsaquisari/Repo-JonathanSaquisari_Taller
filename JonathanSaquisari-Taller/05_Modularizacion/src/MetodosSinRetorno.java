import java.util.Scanner;
public class MetodosSinRetorno {
    int n;
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Mostrar saludo");
            System.out.println("2. Mostrar tabla de un número");
            System.out.println("3. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = tcl.nextInt();
            switch (opcion) {
                case 1:
                    mostrarSaludo();
                    break;
                case 2:
                    System.out.print("Ingrese un número: ");
                    int n = tcl.nextInt();
                    mostrarTabla(n);
                    break;

                case 3:
                    System.out.println("Salida exitosa");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }

    public static void mostrarSaludo() {
        System.out.println("Hola mucho gusto");
    }

    public static void mostrarTabla(int n) {
        if (n > 0) {
            for (int i = 1; i <= 12; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        } else {
            System.out.println("El numero no es mayor a 0");
        }
    }
}

import java.util.Scanner;
public class ArregloCarga {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        do {
            System.out.print("Ingrese el valor del arreglo (que este entre 1 y 50): ");
            n = tcl.nextInt();
        } while (n < 1 || n > 50);
        int arreglo[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese los valores dentro del arreglo: ");
            arreglo[i] = tcl.nextInt();
        }
        System.out.println("Carga completada");
    }
}

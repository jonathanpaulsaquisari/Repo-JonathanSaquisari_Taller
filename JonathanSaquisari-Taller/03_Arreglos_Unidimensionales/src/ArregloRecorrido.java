import java.util.Scanner;
public class ArregloRecorrido {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contpar = 0, contimpar = 0, n;
        System.out.print("Ingrese el tamaño del arreglo: ");
        n = tcl.nextInt();
        int arreglo[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese los valores en el arreglo: ");
            arreglo[i] = tcl.nextInt();
            if (arreglo[i] % 2 == 0) {
                contpar++;
            } else {
                contimpar++;
            }
        }
        System.out.println("Pares: " + contpar);
        System.out.println("Impares: " + contimpar);
    }
}

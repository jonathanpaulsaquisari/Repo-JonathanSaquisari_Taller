import java.util.Scanner;
public class ArregloProcesamiento {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n, suma = 0, mayor, menor;
        double promedio;
        do {
            System.out.print("Ingrese el tamaño del arreglo: ");
            n = tcl.nextInt();
        } while (n < 1 || n > 50);
        int arreglo[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese los valores del arreglo: ");
            arreglo[i] = tcl.nextInt();
            suma += arreglo[i];
        }
        mayor = arreglo[0];
        menor = arreglo[0];
        for (int i = 0; i < n; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        promedio = suma / n;
        System.out.println("El valor mayor del arreglo es: " + mayor);
        System.out.println("El valor menor del arreglo es: " + menor);
        System.out.printf("El promedio del arreglo es de: %.2f", promedio);
    }
}
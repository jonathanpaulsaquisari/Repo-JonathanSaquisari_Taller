import java.util.Scanner;
public class MatrizProcesamiento {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f, c, sumatot = 0, sumaDiag = 0;
        System.out.print("Ingrese el numero de filas de la matriz: ");
        f = tcl.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz: ");
        c = tcl.nextInt();
        int matriz[][] = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Ingrese los valores de la matriz: ");
                matriz[i][j] = tcl.nextInt();
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                sumatot += matriz[i][j];
            }
        }
        System.out.println("La suma de todos los elementos es de: " + sumatot);
        if (f == c) {
            for (int i = 0; i < f; i++) {
                sumaDiag += matriz[i][i];
            }
            System.out.println("La suma en la diagonal principal es: " + sumaDiag);
        } else {
            System.out.println("Diagonal no aplica");
        }
    }
}
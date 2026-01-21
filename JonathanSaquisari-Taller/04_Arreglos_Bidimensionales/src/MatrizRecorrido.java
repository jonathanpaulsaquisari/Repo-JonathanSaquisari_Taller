import java.util.Scanner;
public class MatrizRecorrido {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f, c, suma;
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
        System.out.println("MATRIZ");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < f; i++) {
            suma = 0;
            for (int j = 0; j < c; j++) {
                suma += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + "-> suma = " + suma);
        }
    }
}
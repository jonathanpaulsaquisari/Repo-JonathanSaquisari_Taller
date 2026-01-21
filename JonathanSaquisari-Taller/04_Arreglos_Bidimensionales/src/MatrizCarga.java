import java.util.Scanner;
public class MatrizCarga {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f, c;
        do {
            System.out.print("Ingrese el numero de filas de la matriz: ");
            f = tcl.nextInt();
        } while (f < 1 || f > 10);
        do {
            System.out.print("Ingrese el numero de columnas de la matriz: ");
            c = tcl.nextInt();
        } while (c < 1 || c > 10);
        int matriz[][] = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Ingrese los valores en la matriz: ");
                matriz[i][j] = tcl.nextInt();
            }
        }
        System.out.println("Matriz cargada");
    }
}

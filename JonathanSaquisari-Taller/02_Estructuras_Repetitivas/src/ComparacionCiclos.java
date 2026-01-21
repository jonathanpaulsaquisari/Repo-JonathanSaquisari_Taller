import java.util.Scanner;
public class ComparacionCiclos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n, sumaW = 0, sumaDo = 0, sumaFor = 0, i = 1;
        System.out.print("Ingrese un numero mayor o igual a 1: ");
        n = tcl.nextInt();
        if (n >= 1) {
            while (i <= n) {
                sumaW += i;
                i++;
            }
            i = 1;
            do {
                sumaDo += i;
                i++;
            } while (i <= n);

            for (int j = 1; j <= n; j++) {
                sumaFor += j;
            }
            System.out.println("Suma con while: " + sumaW);
            System.out.println("Suma con do-while: " + sumaDo);
            System.out.println("Suma con for: " + sumaFor);

            if (sumaW != sumaDo && sumaW != sumaFor) {
                System.out.println("Revisar implementacion");
            }
        } else {
            System.out.println("No ingreso un numero mayor o igual a 1");
        }
    }
}

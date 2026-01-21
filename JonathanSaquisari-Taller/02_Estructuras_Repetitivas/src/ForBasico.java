import java.util.Scanner;
public class ForBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        System.out.print("Ingrese un numero positivo para su tabla del 1 al 12: ");
        n = tcl.nextInt();
        if (n > 0) {
            for (int i = 1; i <= 12; i++) {
                System.out.println(n + "*" + i + "=" + n * i);
            }
        } else {
            System.out.println("EL NUMERO NO ES POSITIVO");
        }
    }
}

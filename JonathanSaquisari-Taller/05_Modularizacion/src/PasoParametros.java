import java.util.Scanner;
public class PasoParametros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int nota = leerNota(tcl);
        String estado = calcularEstado(nota);
        System.out.println("Nota: " + nota);
        System.out.println("Estado: " + estado);
    }
    public static int leerNota(Scanner tcl) {
        int nota;
        do {
            System.out.print("Ingrese su nota entre (0-100): ");
            nota = tcl.nextInt();
        } while (nota < 0 || nota > 100);
        return nota;
    }
    public static String calcularEstado(int nota) {
        if (nota >= 70) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}

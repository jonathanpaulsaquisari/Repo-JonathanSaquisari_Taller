import java.util.Scanner;
public class MetodosConRetorno {
    public static void main(String[] args) {
        double num1, num2;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = tcl.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = tcl.nextInt();
        System.out.println("Suma: " + mostrarsuma(num1, num2));
        System.out.println("Resta: " + mostrarresta(num1, num2));
        System.out.println("Producto: " + mostrarmultiplicar(num1, num2));
        System.out.println("Mayor: " + mostrarMayor(num1, num2));
    }
    public static double mostrarsuma(double num1, double num2) {
        double sumar;
        sumar = num1 + num2;
        return sumar;
    }

    public static double mostrarresta(double num1, double num2) {
        double restar;
        restar = num1 - num2;
        return restar;
    }
    public static double mostrarmultiplicar(double num1, double num2) {
        double multiplicar;
        multiplicar = num1 * num2;
        return multiplicar;
    }
    public static double mostrarMayor(double num1, double num2) {
        double mayor;
        if (num1 > num2) {
            mayor = num1;
            return num1;
        } else {
            mayor = num2;
        }
        return num2;
    }
}

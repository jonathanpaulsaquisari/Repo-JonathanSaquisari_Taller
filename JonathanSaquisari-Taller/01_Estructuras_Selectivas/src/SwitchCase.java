import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion, num1, num2;
        System.out.print("Ingrese el primer numero: ");
        num1 = tcl.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = tcl.nextInt();
        System.out.println("Ingrese el numero de que operacion desea realizar");
        System.out.println("1.Suma"+"\n"+"2.Restar"+"\n"+"3.Multiplicar"+"\n"+"4.Dividir");
        System.out.print("Ingreso: ");
        opcion = tcl.nextInt();
        
        
    }
}

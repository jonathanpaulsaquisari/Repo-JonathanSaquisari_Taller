import java.util.Scanner;
public class WhileBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String contra = "utpl";
        String ingreso = "";
        int cont = 0;
        while (!ingreso.equals(contra)) {            
            System.out.println("Ingrese la contraseña: ");
            ingreso = tcl.next();
            cont++;
        }
        System.out.println("Acceso concedido en " + cont + " intentos");
    }
}

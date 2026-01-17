import java.util.Scanner;
public class IfAnidado {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int puntaje;
        System.out.print("Ingrese un puntaje(0-100): ");
        puntaje = tcl.nextInt();
        if (puntaje <= 69) {
            System.out.println("En proceso");
        }
        else
            if(puntaje <=89){
                System.out.println("Bueno");
            }
        else
                System.out.println("Excelente");
    }
}
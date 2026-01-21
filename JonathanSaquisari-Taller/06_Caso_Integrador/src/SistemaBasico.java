import java.util.Scanner;
public class SistemaBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n = 0;
        String nombres[] = null;
        int notas[] = null;
        int opcion;
        do {
            System.out.println("1. Registrar estudiantes");
            System.out.println("2. Mostrar listado");
            System.out.println("3. Mostrar estadísticas");
            System.out.println("4. Buscar estudiante por nombre");
            System.out.println("0. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = tcl.nextInt();
            switch (opcion) {
                case 1:
                    n = leerEnteroEnRango(tcl);
                    nombres = new String[n];
                    notas = new int[n];
                    registrarEstudiantes(tcl, nombres, notas);
                    break;
                case 2:
                    if (nombres != null) {
                        mostrarListado(nombres, notas);
                    } else {
                        System.out.println("No registro a los estudiantes");
                    }
                    break;
                case 3:
                    if (nombres != null) {
                        mostrarEstadisticas(nombres, notas);
                    } else {
                        System.out.println("No registro a los estudiantes");
                    }
                    break;
                case 4:
                    if (nombres != null) {
                        tcl.nextLine();
                        buscarPorNombre(tcl, nombres, notas);
                    } else {
                        System.out.println("No registro a los estudiantes");
                    }
                    break;
                case 0:
                    System.out.println("Salida exitosa");
                    break;
                default:
                    System.out.println("Opción no valida");
            }

        } while (opcion != 0);
    }
    public static int leerEnteroEnRango(Scanner tcl) {
        int valor;
        do {
            System.out.print("Ingrese cantidad de estudiantes entre (1..30): ");
            valor = tcl.nextInt();
            tcl.nextLine();
        } while (valor < 1 || valor > 30);
        return valor;
    }
    public static int leerNotaValida(Scanner sc) {
        int nota;
        do {
            System.out.print("Ingrese nota (0..100): ");
            nota = sc.nextInt();
            sc.nextLine();
        } while (nota < 0 || nota > 100);
        return nota;
    }
    public static void registrarEstudiantes(Scanner tcl, String nombres [], int notas []) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = tcl.nextLine();
            notas[i] = leerNotaValida(tcl);
        }
        System.out.println("Registro Realizado");
    }
    public static void mostrarListado(String[] nombres, int[] notas) {
        System.out.println("\n LISTADO DE ESTUDIANTES");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " = " + notas[i]);
        }
    }
    public static double calcularPromedio(int[] notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return  suma / notas.length;
    }
    public static void mostrarEstadisticas(String[] nombres, int[] notas) {
        int mayor = notas[0];
        int menor = notas[0];
        int posMayor = 0;
        int posMenor = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
                posMayor = i;
            }
            if (notas[i] < menor) {
                menor = notas[i];
                posMenor = i;
            }
        }
        System.out.printf("Promedio del curso: %.2f%n", calcularPromedio(notas));
        System.out.println("Mayor nota: " + mayor + " (" + nombres[posMayor] + ")");
        System.out.println("Menor nota: " + menor + " (" + nombres[posMenor] + ")");
    }
    public static void buscarPorNombre(Scanner tcl, String[] nombres, int[] notas) {
        System.out.print("Ingrese nombre a buscar: ");
        String buscar = tcl.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                System.out.println("Nota de " + nombres[i] + ": " + notas[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nombre no registrado");
        }
    }
}
import java.util.Scanner;

public class ejercicio_03 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada por teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una calificacion entre 0 y 10
        System.out.print("Introduce una calificacion (entre 0 y 10): ");
        int calificacion = scanner.nextInt();

        // Verificar si la calificacion esta dentro del rango permitido
        if (calificacion >= 0 && calificacion <= 10) {
            // Comprobar si la calificación es mayor o igual a 5
            if (calificacion >= 5) {
                System.out.println("APROBADO");
            } else {
                System.out.println("NO APROBADO");
            }
        } else {
            // Si la calificacion no esta dentro del rango, mostrar un mensaje de error
            System.out.println("Calificacion fuera de rango. Debe estar entre 0 y 10.");
        }
        // Cerrar el objeto Scanner
        scanner.close();
    }
}

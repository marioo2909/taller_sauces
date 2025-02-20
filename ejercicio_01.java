import java.util.Scanner;

public class ejercicio_01 {
    public static void main(String[] args) {
        // Crea el objeto Scanner para lectura por teclado
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario introducir un número
        System.out.print("Por favor, ingrese un número entero positivo: ");
        int number = scanner.nextInt();

        // Comprueba si el número es positivo
        if (number > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número no es positivo.");
        }
		// A comment here
        // Cierra el scanner
        scanner.close();
    }
}
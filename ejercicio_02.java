import java.util.Scanner;

public class ejercicio_02 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada por teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número entero positivo
        System.out.print("Introduce un numero entero positivo: ");
        int numero = scanner.nextInt();

        // Verificar si el número es positivo
        if (numero > 0) {
            // Comprobar si el número es múltiplo de 5
            if (numero % 5 == 0) {
                System.out.println("El numero introducido es multiplo de 5");
            } else {
                System.out.println("El numero introducido no es multiplo de 5");
            }
        } else {
            System.out.println("Por favorcillo, introduce un numero positivo.");
        }
	}
}

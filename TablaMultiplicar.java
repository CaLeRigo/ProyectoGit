import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {

        String salida = "";
        int numero;

        Scanner teclado = new Scanner(System.in);

        // Pedir número al usuario
        System.out.print("Introduce un número entre 1 y 10: ");
        numero = teclado.nextInt();

        // Guardar mensaje inicial
        salida = "Tabla de multiplicar del número " + numero;

        // Validaciones
        if (numero > 0) {

            if (numero < 11) {

                for (int i = 1; i <= 10; i++) {

                    salida += "\n" + numero + " * " + i + " = " + (numero * i);

                }

            } else {

                System.out.println("El número debe estar entre 1 y 10");

            }

        } else {

            System.out.println("El número debe ser mayor que cero");

        }

        // Mostrar resultado
        System.out.println(salida);

        teclado.close();
    }
}

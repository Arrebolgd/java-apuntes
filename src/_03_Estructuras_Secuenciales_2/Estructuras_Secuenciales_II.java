package _03_Estructuras_Secuenciales_2;

import java.util.Scanner;

public class Estructuras_Secuenciales_II {
    public static void main(String[] args) {
        /*
        Dados 2 números, solicitados al usuario, calcular y mostrar su suma, resta, división y multiplicación.
         */

        int numero1, numero2;
        Scanner input = new Scanner(System.in);

        System.out.println("Indica el primer número: ");
        numero1 = input.nextInt();

        System.out.println("Indica el segundo número: ");
        numero2 = input.nextInt();

        System.out.printf("""
                La suma de ambos es %d.
                La resta de ambos es %d.
                La multiplicación de ambos es %d.
                La división de ambos es %.2f.
                """, (numero1 + numero2), (numero1 - numero2), (numero1 * numero2), ((float) numero1 / (float) numero2));
    }
}

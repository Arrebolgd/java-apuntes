package _01_Estructuras_Secuenciales_1;

import java.util.Scanner;

public class _3_Lectura_Todos_Tipos {

    public static void main(String[] args) {
        /*
        Realiza un programa que lea cada uno de los tipos de datos:
        · Palabra, línea, entero, double, float y booleano.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra = input.next();
        input.nextLine();

        System.out.println("Introduce una linea: ");
        String linea = input.nextLine();

        System.out.println("Introduce un entero: ");
        int entero = input.nextInt();

        System.out.println("Introduce un double: ");
        double decimal = input.nextDouble();

        System.out.println("Introduce un float: ");
        float decimalPequeño = input.nextFloat();

        System.out.println("Todo bien? ");
        boolean bien = input.nextBoolean();

        input.close();

        System.out.println("Palabra: " + palabra + "\n"
                + "Linea: " + linea + "\n"
                + "Entero: " + entero + "\n"
                + "Decimal: " + decimal + "\n"
                + "Float: " + decimalPequeño + "\n"
                + "Boolean: " + bien);
    }
}

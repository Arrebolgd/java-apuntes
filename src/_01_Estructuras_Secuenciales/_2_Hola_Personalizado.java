package _01_Estructuras_Secuenciales;

import java.util.Scanner;

public class _2_Hola_Personalizado {

    public static void main(String[] args) {
        /* Solicite al usuario el nombre y su edad, para luego saludarle. */


        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;

        System.out.println("Introduce tu nombre: ");
        nombre = input.nextLine();

        System.out.println("Introduce tu edad: ");
        edad = input.nextInt();

        System.out.println("Hola " + nombre + " felices " + edad + " años.");
    }
}

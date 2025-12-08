package _50_Examen_2024;

import java.util.Scanner;

public class _00_Examen_2024_Evaluacion_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        final String LETRAS = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ ";
        String mensaje;
        int[] posicionesCifradas;
        int clave = 0;
        int posicion = 0;

        System.out.println("Introduce el texto que quieres cifrar: ");
        mensaje = sc.nextLine();
        posicionesCifradas = new int[mensaje.length()];
        System.out.println("Introduce el desplazamiento");
        clave = sc.nextInt();

        for (int i = 0; i < posicionesCifradas.length; i++) {

            for (int j = 0; j < LETRAS.length(); j++) {
                if (mensaje.toUpperCase().charAt(i) == ' ')
                    posicion = LETRAS.length()-1;
                else if (mensaje.toUpperCase().charAt(i) == LETRAS.charAt(j))
                    posicion = j+3;
            }
        posicionesCifradas[i] = posicion;
        }
        for (int posicionesCifrada : posicionesCifradas) {
            System.out.print(LETRAS.charAt(posicionesCifrada));
        }
    }
}
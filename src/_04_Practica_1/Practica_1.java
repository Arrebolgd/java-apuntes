package _04_Practica_1;

import java.util.Scanner;

public class Practica_1 {
    public static void main(String[] args) {
        /*
        · Preguntar al usuario cuantas monedas tiene de cada tipo:
            · 2€
            · 1€
            · 50 céntimos
            · 20 céntimos
            · 10 céntimos
        · Calcular el total de dinero que posee el usuario.
        · Calcular cuantos billetes de 5€ completos le darían en el banco si llevara to-do ese dinero.
        · Calcular el dinero sobrante que no llega a formar un billete de 5€.
         */
        Scanner input = new Scanner(System.in);
        double monedas2e, monedas1e, monedas50c, monedas20c, monedas10c;

        System.out.println("¿Cuantas monedas de 2€ hay?");
        monedas2e = input.nextInt();
        System.out.println("¿Cuantas monedas de 1€ hay?");
        monedas1e = input.nextInt();
        System.out.println("¿Cuantas monedas de 50ce hay?");
        monedas50c = input.nextInt();
        System.out.println("¿Cuantas monedas de 20ce hay?");
        monedas20c = input.nextInt();
        System.out.println("¿Cuantas monedas de 10ce hay?");
        monedas10c = input.nextInt();

        double dineroTotal = (monedas2e * 2) + monedas1e + (monedas50c * 0.50) + (monedas20c * 0.20) + (monedas10c * 0.10);
        int billetesDe5e = (int) dineroTotal / 5;
        double dineroSobrante = dineroTotal - (billetesDe5e * 5);
        System.out.printf("""
                Hay %.0f monedas de 2€, %.0f monedas de 1€, %.0f monedas de 50ce, %.0f monedas de 20ce, %.0f monedas de 10ce.
                El usuario tiene %.2f €.
                El usuario tendra %d billetes de 5 €.
                Sobrarán %.2f €, despues de intercambiar el dinero por billetes de 5 €.
                """, monedas2e, monedas1e, monedas50c, monedas20c, monedas10c, dineroTotal, billetesDe5e, dineroSobrante);
    }
}

package _91_Trabajo_Amigo_Invisible;

import java.util.Arrays;
import java.util.Scanner;

public class _00_Amigo_Invisible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos amigos participan?");
        String[] amigos = new String[sc.nextInt()];
        int[] unOrderedRandom = new int[amigos.length];

        sc.nextLine();

        for (int i = 0; i < amigos.length; i++) {
            System.out.print("Nombre" + (i+1) +":");
            amigos[i] = sc.nextLine();
        }

        int random;
        for (int i = 0; i < unOrderedRandom.length; i ++){
            random = randomFunc((int)((Math.random() * unOrderedRandom.length) + 1), unOrderedRandom);
            if(random == i)
                random = randomFunc((int)((Math.random() * unOrderedRandom.length) + 1), unOrderedRandom);

            unOrderedRandom[i] = random;
        }
        int z = 0;
        for(String name : amigos){
            System.out.println(name + "->" + amigos[(unOrderedRandom[z] -1)]);
            z++;
        }
    }
    public static int randomFunc(int number, int[] asignedArray){
        for (int j : asignedArray) {
            if (j == number) {
                number = randomFunc((int) ((Math.random() * asignedArray.length) + 1), asignedArray);
            }
        }
        return number;
    }
}

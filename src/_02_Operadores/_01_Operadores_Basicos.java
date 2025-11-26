package _02_Operadores;

public class _01_Operadores_Basicos {
    public static void main(String[] args) {
        // Operadores de Asignación

        // =
        // Asigna un valor a una variable, forma más simple de asignación.
        int numEjemploAsignacion;
        numEjemploAsignacion = 7;
        System.out.println("· Comprobación de Operadores de Asignación: " + numEjemploAsignacion);

        // Operadores Aritméticos
        // Encargados de realizar operaciones aritméticas básicas.

        int numero1, numero2;
        // +
        // Suma 2 valores
        numero1 = 2;
        numero2 = 4;
        System.out.println("· Comprobación del Operador Aritmético [+]: " + (numero1 + numero2));

        // -
        // Resta 2 valores
        // Reasignamos la variable "numero2"
        numero2 = 6;
        System.out.println("· Comprobación del Operador Aritmético [-]: " + (numero2 - numero1));

        // *
        // Multiplica 2 valores
        System.out.println("· Comprobación del Operador Aritmético [*]: " + (numero1 * numero2));

        // /
        // Divide 2 valores
        float numeroDecimal1 = 7f, numeroDecimal2 = 3f;
        System.out.println("· Comprobación del Operador Aritmético [-]: " + (numeroDecimal1 / numeroDecimal2));

        // %
        // Divide 2 valores y devuelve como resultado de la operación el resto de la división
        System.out.println("· Comprobación del Operador Aritmético [-]: " + (numeroDecimal1 % numeroDecimal2));

        // Operadores de Asignación Compuestos
        // Son una mezcla de "Operación Aritmética" y "Asignación"
        numero1 = 10;
        numero2 = 5;

        // +=
        // Suma y asigna
        numero1 += numero2;
        System.out.println("· Comprobación de Asignación Compuesta [+=]: " + numero1);

        // -=
        // Resta y asigna
        numero2 = 2;
        numero1 -= numero2;
        System.out.println("· Comprobación de Asignación Compuesta [-=]: " + numero1);

        // *=
        // Multiplica y asigna
        numero1 *= numero2;
        System.out.println("· Comprobación de Asignación Compuesta [*=]: " + numero1);

        // /=
        // Divide y asigna

        // %=
        // Devuelve el modulo (resto de la división) y asigna

        // Operadores Lógicos

        // >

        // <

        // >=

        // <=

        // ||

        // &&

        // !
    }
}

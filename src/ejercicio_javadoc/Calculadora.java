package ejercicio_javadoc;

/**
 * La clase Calculadora proporciona métodos para realizar operaciones aritméticas básicas.
 * Soporta suma, resta, multiplicación y división.
 * 
 * @version 8
 * @since 2024-04-01
 * @author IvánFM
 * 
 */
public class Calculadora {

    /**
     * Suma dos números enteros.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return La suma de los dos números.
     * @throws IllegalArgumentException si alguno de los números es negativo.
     * @see 
     */
    public static int sumar(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Los números deben ser positivos");
        }
        return a + b;
    }

    /**
     * Resta dos números enteros.
     *
     * @param a El número del que se resta.
     * @param b El número que se resta.
     * @return La diferencia entre los dos números.
     */
    public static int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return El producto de los dos números.
     */
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros.
     *
     * @param a El dividendo.
     * @param b El divisor.
     * @return El cociente de la división.
     * @throws ArithmeticException si se intenta dividir por cero.
     * @see <a href="https://es.wikipedia.org/wiki/Divisi%C3%B3n_por_cero">División por cero en Wikipedia</a>
     */
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    /**
     * Método principal para probar la funcionalidad de la calculadora.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Prueba de los métodos de la calculadora
        int num1 = 10;
        int num2 = 5;
        System.out.println("Suma: " + sumar(num1, num2));
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Multiplicación: " + multiplicar(num1, num2));
        System.out.println("División: " + dividir(num1, num2));
    }
}


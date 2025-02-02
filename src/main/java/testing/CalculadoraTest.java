package testing;

import javabean.Suma;
import javabean.Resta;
import java.util.Scanner;

/**
 * <p>Clase que representa una calculadora con operaciones básicas:
 * (Suma, resta, multiplicación y cociente).
 * El usuario puede elegir la operación a realizar</p>
 *
 * <p>Ejemplo de uso</p>
 * <pre>{code
 * Suma suma1 = new Suma();
 * double resultado_suma1 = suma1.sumaDosReales();
 * System.out.println("El resultado es: " + resultado_suma1);
 * }</pre>
 *
 * @author Paula Arroyo
 * @author Ramses
 * @author Kevin Crespo Romero
 * @version 1.0
 * @see Suma
 * @see Resta
 */

public class CalculadoraTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige qué operación quieres hacer: ");
        System.out.println(
                "1: Sumar | 2: Restar | 3: Multiplicar | 4: Cociente");

        int eleccion = scanner.nextInt();

        switch(eleccion){
            case 1: // ---------------------- SUMA ------------------------ //
                /**
                 * <p>Hace la operación de sumar las cantidades
                 * que introduce el usuario y muestra los resultados
                 * y la cantidad del valor acumulado de las tres
                 * operaciones.</p>
                 *
                 * @param resultado_suma1
                 * @param resultado_suma2
                 * @param resultado_suma3
                 * @param valorAcumulado
                 *
                 * @return El resultado de las sumas y
                 * el valor acumulado de las mismas.
                 */
                Suma suma1 = new Suma();

                double resultado_suma1 = suma1.sumaDosReales();
                int resultado_suma2    = suma1.sumaDosEnteros();
                double resultado_suma3 = suma1.sumaTresReales();

                System.out.println("El resultado es: " + resultado_suma1);
                System.out.println("El resultado es: " + resultado_suma2);
                System.out.println("El resultado es: " + resultado_suma3);
                System.out.println(
                        "El valor acumulado de todas las operaciones es: "
                                + suma1.getValorAcumulado());
                break;

            case 2: // ---------------------- RESTA ----------------------- //
                /**
                 * <p>Hace la operación de restar las cantidades
                 * que introduce el usuario y muestra los resultados
                 * y la cantidad del valor acumulado de las tres
                 * operaciones.</p>
                 *
                 * @param resultado_resta1
                 * @param resultado_resta2
                 * @param resultado_resta3
                 * @param valorAcumulado
                 *
                 * @return El resultado de las restas y
                 * el valor acumulado de las mismas.
                 */
                Resta resta1 = new Resta();
                double resultado_resta1 = resta1.restaDosReales();
                int resultado_resta2    = resta1.restaDosEnteros();
                double resultado_resta3 = resta1.restaTresReales();

                System.out.println("El resultado es: " + resultado_resta1);
                System.out.println("El resultado es: " + resultado_resta2);
                System.out.println("El resultado es: " + resultado_resta3);
                System.out.println(
                        "El valor acumulado de todas las operaciones es: "
                                + resta1.getValorAcumulado());
                break;

            case 3:
                //TODO Multiplicar
                break;

            case 4:
                //TODO Cociente
                break;

            default:
                System.out.println("Debes elegir una operación válida.");
        }



    }
}



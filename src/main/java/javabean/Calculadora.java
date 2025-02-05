package javabean;

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
 * @author Paula Arroyo Ajenjo
 * @author Adrian Ramses Muñoz Rodriguez
 * @author Kevin Crespo Romero
 * @version 1.0
 * @see Suma
 * @see Resta
 *
 * TODO: @see resto de clases
 */

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int bandera=0;

        do{
            System.out.println("REALIZAR OPERACION:\n"+"1. Sumar\n"+"2. Restar\n"+"3 Multiplicar\n"+"4. Dividir\n"+"5. SALIR");

            switch (entrada.nextInt()){

                //sumar
                case 1:
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

                    double resultado_suma1 = 	suma1.sumaDosReales();
                    int resultado_suma2    = 	suma1.sumaDosEnteros();
                    double resultado_suma3 = 	suma1.sumaTresReales();

                    System.out.println("El resultado es: " + resultado_suma1);
                    System.out.println("El resultado es: " + resultado_suma2);
                    System.out.println("El resultado es: " + resultado_suma3);

                    System.out.println(
                            "El valor acumulado de todas las operaciones es: "
                                    + suma1.getValorAcumulado());

                    /*
                    SumaNuevo sumar = new SumaNuevo();
                    System.out.println("La suma de dos reales es: " + sumar.sumarDosReales(5.4 , 5.6));
                    System.out.println("La suma de dos reales es: " + sumar.sumarDosEnteros(5 , 5));
                    System.out.println("La suma de dos reales es: " + sumar.sumarTresReales(5.5 , 20.10 , 10.2));
                    System.out.println("El valor acumulado de todas las operaciones es: " + sumar.getValorAcumulado());
                     */

                    break;

                //restar
                case 2:
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

                    double resultado_resta1 = 	resta1.restaDosReales();
                    int resultado_resta2    = 	resta1.restaDosEnteros();
                    double resultado_resta3 = 	resta1.restaTresReales();

                    System.out.println("El resultado es: " + resultado_resta1);
                    System.out.println("El resultado es: " + resultado_resta2);
                    System.out.println("El resultado es: " + resultado_resta3);

                    System.out.println(
                            "El valor acumulado de todas las operaciones es: "
                                    + resta1.getValorAcumulado());

                    /*
                    RestaNuevo restar = new RestaNuevo();
                    System.out.println("La suma de dos reales es: " + restar.restarDosReales(5.4 , 5.6));
                    System.out.println("La suma de dos reales es: " + restar.restarDosEnteros(5 , 5));
                    System.out.println("La suma de dos reales es: " + restar.restarTresReales(5.5 , 20.10 , 10.2));
                    System.out.println("El valor acumulado de todas las operaciones es: " + restar.getValorAcumulado());
                    */

                    break;

                // TODO: multiplicar
                case 3:

                    //ramses





                    break;

                    // TODO: dividir
                case 4:


                    //paula





                    break;



                    //salir
                case 5:
                    bandera=1;

                    break;
            }



        }while(bandera != 1);

    }//fin main
}//fin clase


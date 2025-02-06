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
                    Suma sumar = new Suma();
                    System.out.println("La suma de dos reales es: " + sumar.sumarDosReales(5.4 , 5.6));
                    System.out.println("La suma de dos reales es: " + sumar.sumarDosEnteros(5 , 5));
                    System.out.println("La suma de dos reales es: " + sumar.sumarTresReales(5.5 , 20.10 , 10.2));
                    System.out.println("El valor acumulado de todas las operaciones es: " + sumar.getValorAcumulado());


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
                    Resta restar = new Resta();
                    System.out.println("La suma de dos reales es: " + restar.restarDosReales(5.4 , 5.6));
                    System.out.println("La suma de dos reales es: " + restar.restarDosEnteros(5 , 5));
                    System.out.println("La suma de dos reales es: " + restar.restarTresReales(5.5 , 20.10 , 10.2));
                    System.out.println("El valor acumulado de todas las operaciones es: " + restar.getValorAcumulado());

                    break;

                // TODO: multiplicar

                case 3:

                    Producto producto = new Producto();
                    int num1;
                    int num2;
                    int num3;

                    double num4;
                    double num5;
                    //ramses


                    System.out.println("1. Multiplicar 2 enteros\n"+"2. Multiplicar 3 enteros\n"+"3 Multiplicar 2 reales\n"+"4 potencia");

                    switch (entrada.nextInt()){
                        case 1:

                            System.out.println("ingrese un numero entero");

                             num1 = entrada.nextInt();

                            System.out.println("ingrese otro numero entero");

                             num2 = entrada.nextInt();

                            System.out.println(producto.multiplicar(num1 , num2));

                            break;

                        case 2:



                            System.out.println("ingrese un numero entero");

                             num1 = entrada.nextInt();

                            System.out.println("ingrese otro numero entero");

                             num2 = entrada.nextInt();

                            System.out.println("ingrese otro numero entero");

                            num3 = entrada.nextInt();

                            System.out.println(producto.multiplicar(num1 , num2, num3));


                            break;

                       case 3:


                           System.out.println("ingrese un numero real");

                           num4 = entrada.nextDouble();

                           System.out.println("ingrese otro numero real");

                           num5 = entrada.nextDouble();

                           System.out.println(producto.multiplicar(num4 , num5));

                           break;

                        case 4:

                            System.out.println("ingrese la base");

                            num1 = entrada.nextInt();

                            System.out.println("ingrese el exponente");

                            num2 = entrada.nextInt();

                            System.out.println(producto.potencia(num1 , num2));


                            break;
                    }



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


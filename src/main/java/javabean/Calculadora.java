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
 * @see Cociente
 * @see Producto
 */

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int bandera=0;

        do{
            System.out.println("REALIZAR OPERACION:\n"+"1. Sumar\n"+"2. Restar\n"+"3. Multiplicar\n"+"4. Dividir\n"+"5. SALIR");

            switch (entrada.nextInt()){

                //sumar
                case 1:
                    /**
                     * <p>Hace la operación de sumar las cantidades
                     * que se asignan y muestra los resultados.</p>
                     * @see Suma
                     * @param entero1
                     * @param entero2
                     * @param real1
                     * @param real2
                     * @param real3
                     * @return El resultado de las sumas.
                     */
                    Suma sumar = new Suma();
                    int entero1;
                    int entero2;
                    double real1;
                    double real2;
                    double real3;

                    System.out.println("1. Sumar 2 reales\n"+"2. Sumar 2 enteros\n"+"3. Sumar 3 reales.");

                    switch (entrada.nextInt()) {
                        case 1:
                            System.out.println("ingrese un numero real");
                            real1 = entrada.nextDouble();

                            System.out.println("ingrese otro numero real");
                            real2 = entrada.nextDouble();

                            System.out.println("La suma de dos reales es: " + sumar.sumarDosReales(real1, real2));
                            break;

                        case 2:
                            System.out.println("ingrese un numero entero");
                            entero1 = entrada.nextInt();

                            System.out.println("ingrese otro numero entero");
                            entero2 = entrada.nextInt();

                            System.out.println("La suma de dos enteros es: " + sumar.sumarDosEnteros(entero1, entero2));
                            break;

                        case 3:
                            System.out.println("ingrese el primer numero real");
                            real1 = entrada.nextDouble();

                            System.out.println("ingrese el segundo numero real");
                            real2 = entrada.nextDouble();

                            System.out.println("ingrese el tercer numero real");
                            real3 = entrada.nextDouble();

                            System.out.println("La suma de tres reales es: " + sumar.sumarTresReales(real1, real2, real3));
                            break;
                    }//Cierre switch SUMAR
                    break;

                //restar
                case 2:
                    /**
                     * <p>Hace la operación de restar las cantidades
                     * que se asignan y muestra los resultados.
                     * @see Resta
                     * @param entero_1
                     * @param entero_2
                     * @param real_1
                     * @param real_2
                     * @param real_3
                     * @return El resultado de las restas.
                     */
                    Resta restar = new Resta();
                    int entero_1;
                    int entero_2;
                    double real_1;
                    double real_2;
                    double real_3;

                    System.out.println("1. Restar 2 reales\n"+"2. Restar 2 enteros\n"+"3. Restar 3 reales.");

                    switch (entrada.nextInt()) {
                        case 1:
                            System.out.println("ingrese un numero real");
                            real_1 = entrada.nextDouble();

                            System.out.println("ingrese otro numero real");
                            real_2 = entrada.nextDouble();

                            System.out.println("La resta de dos reales es: " + restar.restarDosReales(real_1, real_2));
                            break;

                        case 2:
                            System.out.println("ingrese un numero entero");
                            entero_1 = entrada.nextInt();

                            System.out.println("ingrese otro numero entero");
                            entero_2 = entrada.nextInt();

                            System.out.println("La resta de dos enteros es: " + restar.restarDosEnteros(entero_1, entero_2));
                            break;

                        case 3:
                            System.out.println("ingrese el primer numero real");
                            real_1 = entrada.nextDouble();

                            System.out.println("ingrese el segundo numero real");
                            real_2 = entrada.nextDouble();

                            System.out.println("ingrese el tercer numero real");
                            real_3 = entrada.nextDouble();

                            System.out.println("La resta de tres reales es: " + restar.restarTresReales(real_1, real_2, real_3));
                            break;

                    }//Cierre switch RESTAR
                    break;


                // multiplicar
                case 3:
                    /**
                     * <p>Clase {@code Producto}</p>
                     *
                     * <p>Intancia de la Clase {@code Producto} que implementa el metodo {@code multiplicar} usa sobrecarga de metodos y devuelve el resultado de una multiplicacion
                     * que devuelve un dato de tipo {@code Doueble}; Tiene un segundo metodo {@code potencia} que calcula la potencia de la base y el exponente que le pasen por parametro
                     *  y devuelve un dato de tipo {@code Doueble};
                     * </p>
                     *
                     * @see javabean.Producto
                     * @see javabean.Producto.multiplica
                     * @see javabean.Producto.potencia
                     *@author Adrian Ramses Muñoz Rodriguez
                     *
                     * @param num1 recibe un dato de tipo {@code int}
                     * @param num2 recibe un dato de tipo {@code int}
                     * @param num3 recibe un dato de tipo {@code int}
                     * @param num4 recibe un dato de tipo {@code Doueble}
                     * @param num5 recibe un dato de tipo {@code Doueble}
                     * @return El resutado de la operacion que se le indique en un dato de tipo {@code Doueble}
                     */
                    Producto producto = new Producto();
                    int num1;
                    int num2;
                    int num3;

                    double num4;
                    double num5;
                    //ramses


                    System.out.println("1. Multiplicar 2 enteros\n"+"2. Multiplicar 3 enteros\n"+"3. Multiplicar 2 reales\n"+"4. potencia");

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

                    // Dividir
                case 4:

                    /**
                     * <p>todos los métodos que están relacionados con la división de la calculadora</p>
                     * @author Paula Arroyo
                     * @see Cociente
                     * @param numero1
                     * @param numero2
                     * @param numero3
                     * @param numero4
                     * @param numero5
                     * @return El resultado de las divisiones u otras operaciones como la raiz cuadrada
                     */

                   /* Cociente cocientes = new Cociente();
                    System.out.println("La división de dos reales es: " + cocientes.dividirReales(12.5, 2.5));
                    System.out.println("La división de dos enteros es: " + cocientes.dividirEnteros(10, 5));
                    System.out.println("El inverso de un número real es: " + cocientes.inversoReal(2));
                    System.out.println("La raiz de un número es: " + cocientes.raiz(64));

                    */

                    Cociente cociente = new Cociente();
                    int numero1;
                    int numero2;
                    int numero3;

                    double numero4;
                    double numero5;
                    //Paula


                    System.out.println("1. Dividir Reales\n"+"2. Dividir Enteros\n"+"3. Inverso Real\n"+"4. Raíz Cuadrada");

                    switch (entrada.nextInt()){
                        case 1:

                            System.out.println("ingrese un numero real");

                            numero4 = entrada.nextDouble();

                            System.out.println("ingrese otro numero real");

                            numero5 = entrada.nextDouble();

                            System.out.println(cociente.dividirReales(numero4 , numero5));

                            break;

                        case 2:

                            System.out.println("ingrese un numero entero");

                            numero1 = entrada.nextInt();

                            System.out.println("ingrese otro numero entero");

                            numero2 = entrada.nextInt();

                            System.out.println(cociente.dividirEnteros(numero1 , numero2));


                            break;

                        case 3:


                            System.out.println("ingrese un numero real");

                            num4 = entrada.nextDouble();

                            System.out.println(cociente.inversoReal(num4));

                            break;

                        case 4:

                            System.out.println("ingrese un numero real");

                            num5 = entrada.nextDouble();

                            System.out.println(cociente.raiz(num5));


                            break;
                    }


                    break;


                    //salir
                case 5:
                    bandera=1;

                    break;
            }

        }while(bandera != 1);

        entrada.close();
    }//fin main
}//fin clase


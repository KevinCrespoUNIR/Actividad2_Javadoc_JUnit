package javabean;

/**
 * <p>Clase Producto </p>
 *
 * <pre>La clase {@code Producto} se encarga de hacer todas las operaciones necesarias para multiplicacion y potencias
 * </pre>
 * @author Adrian Ramses Muñoz Rodriguez
 * gitHub: https://github.com/RamsesMR
 * @version 1.1
 */
public class Producto {


    /**
     * El contructor de la clase esta vacio
     */
    public Producto() {

    }


    /**
     * <pre> Multiplica 2 numeros de tipo {@code int} y retorna el resultado de la operacion en un dato de tipo {@code double}</pre>
     *
     * @param num1 primer numero de tipo {@code int} a multiplicar
     * @param num2 segundo numero de tipo {@code int} a multiplicar
     * @return El resultado de la operacion en un dato de tipo {@code double}
     */
    public double multiplicar(int num1, int num2){


        return num1*num2;
    }

    /**
     *  <pre> Multiplica 3 numeros de tipo {@code int}  y retorna el resultado de la operacion en un dato de tipo {@code double}</pre>
     *
     * @param num1 primer numero de tipo {@code int} a multiplicar
     * @param num2 segundo numero de tipo {@code int} a multiplicar
     * @param num3 tercer numero de tipo {@code int} a multiplicar
     * @return El resultado de la operacion en un dato de tipo {@code double}
     */
    public double multiplicar(int num1, int num2, int num3){


        return num1*num2*num3;
    }


    /**
     * <pre> Multiplica 2 numeros de tipo {@code double}  y retorna el resultado de la operacion en un dato de tipo {@code double}</pre>
     *
     * @param num1 primer numero de tipo {@code double} a multiplicar
     * @param num2 segundo numero de tipo {@code double} a multiplicar
     * @return El resultado de la operacion en un dato de tipo {@code double}
     */

    public double multiplicar(double num1, double num2){

        return num1*num2;
    }


    /**
     *
     * <pre> Esta operacion devuelve la potencia de dos numeros de tipo {@code int} y retorna el resultado de la operacion en un dato de tipo {@code double}</pre>
     * @param num1 primer numero de tipo {@code int} base
     * @param num2 segundo numero de tipo {@code int} exponente
     * @return El resultado de la operacion en un dato de tipo {@code double}
     * @throws IllegalArgumentException Si {@code num1} es negativo.
     */

    public double potencia(int num1, int num2){

        if(num1 <  0){

            throw new IllegalArgumentException("La base no puede ser un numero negativo");
        }

        return Math.pow(num1, num2);
    }

}//llave de clase

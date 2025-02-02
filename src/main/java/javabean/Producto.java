package javabean;

/**
 * <p>Clase Producto </p>
 *
 * <pre>La clase {@code Producto} se encarga de hacer todas las operaciones necesarias para multiplicar
 * posee un solo atributo{@code resultado}  de tipo {@code double} a la cual accederemos luego de cada
 * operacion para mostrar el resultado de la misma
 * </pre>
 * @author Adrian Ramses Muñoz Rodriguez
 * @version 1.1
 * @
 */
public class Producto {


    /**
     * <p>Atributo de clase {@code resultado} </p>
     *
     * Este atributo es {@code private} de tipo {@code double} guardara todos los resultados de las operacion y se debe acceder a esta para mostrar el reultado de cada operacion,
     * con cada nueva operacion la variable pierde el valor anterior y tomara el valor de la nueva operacion.
     * Este atributo es de tipo {@code double} para facilitar el majeno de asignar el resultado de una operacion con numero de tipo {@code int} o {@code double}
     *
     */
    private double resultado;


    /**
     * El contructor de la clase esta vacio
     */
    public Producto() {

    }


    /**
     *
     *
     * @return una cantidad de tipo {@code double} resulado de la operacion
     */
    public double getResultado() {
        return resultado;
    }


    /**
     * <pre> Multiplica 2 numeros de tipo {@code int}  y asigna el resutlado al atributo de clase {@code resultado} de tipo {@code double}</pre>
     *
     * @param num1 primer numero entero
     * @param num2 segundo numero entero
     * @return asigna el resultado de la operacion al atributo de clase {@code resultado}
     */
    public double multiplicar(int num1, int num2){


        return this.resultado= num1*num2;
    }

    /**
     *  <pre> Multiplica 3 numeros de tipo {@code int}  y asigna el resutlado al atributo de clase {@code resultado} de tipo {@code double}</pre>
     *
     * @param num1 primer numero de tipo {@code int}
     * @param num2 segundo numero de tipo {@code int}
     * @param num3 tercer numero de tipo {@code int}
     * @return asigna el resultado de la operacion al atributo de clase {@code resultado}
     */
    public double multiplicar(int num1, int num2, int num3){


        return this.resultado= num1*num2*num3;
    }


    /**
     * <pre> Multiplica 2 numeros de tipo {@code double}  y asigna el resutlado al atributo de clase {@code resultado} de tipo {@code double}</pre>
     *
     * @param num1 primer numero de tipo {@code double}
     * @param num2 segundo numero de tipo {@code double}
     * @return asigna el resultado de la operacion al atributo de clase {@code resultado}
     */

    public double multiplicar(double num1, double num2){

        return this.resultado= (num1*num2);
    }


    /**
     *
     * <pre> Esta operacion devuelve la potencia de dos numeros de tipo {@code int} y el resultado lo asigna al atributo de clase {@code resultado} </pre>
     * @param num1 primer numero de tipo {@code int}
     * @param num2 segundo numero de tipo {@code int}
     * @return asigna el resultado de la operacion al atributo de clase {@code resultado}
     */

    public double potencia(int num1, int num2){

        return this.resultado=Math.pow(num1, num2);
    }
}

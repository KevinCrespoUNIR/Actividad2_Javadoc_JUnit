package javabean;

/**
 *<p>Clase Calculadora </p>
 *
 * <pre>Implementa 4 clases como atributos de intancias que son las que nos va a permiri hacer las operaciones correspondiente </pre>
 *
 * @see Producto
 * @see Sumar
 * @see Restar
 * @see Dividir
 *
 *
 * @author Paula Arroyo
 * @author Kevin
 * @author Adrian Muñoz Rodriguez
 * @version 1.1
 */

public class Calculadora {

//atributos de clases
    /**
     *
     * @see Producto
     * @see Sumar
     * @see Restar
     * @see Dividir
     */
   double resultado = 0;
    Producto producto = new Producto();
   //constructor


    /**
     * metodo constructor vacio
     */
    public Calculadora() {
    }

    //getter

    /**
     *
     * @return el valor actual de la variable {@code private} de tipo {@code double} resultado, que contiene el valor de la ultima operacion realizada
     */
    public double getResultado() {
        return resultado;
    }


    //metodos propios

    /**
     * @author Adrian Ramses Muñoz Rodriguez
     *
     * @param a
     * @param b
     * @return
     */
    public void multiplicar(int a, int b) {

        this.resultado=producto.multiplicar(a,b);
        System.out.println(resultado);
    }

    /**
     * @author Adrian Ramses Muñoz Rodriguez
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public void multiplicar(int a, int b,int c) {

      this.resultado=producto.multiplicar(a,b,c);
        System.out.println(resultado);
    }

    /**
     * @author Adrian Ramses Muñoz Rodriguez
     *
     * @param a
     * @param b
     * @return
     */
    public void multiplicar(double a, double b) {

        this.resultado=producto.multiplicar(a,b);
        System.out.println(resultado);
    }

    /**
     * @author Adrian Ramses Muñoz Rodriguez
     *
     * @param a
     * @param b
     * @return
     */
    public void potencia(int a, int b) {

        this.resultado=producto.potencia(a,b);
        System.out.println(resultado);
    }



    public static void main(String[] args) {


Calculadora calculadora = new Calculadora();

        calculadora.potencia(2,3);
        calculadora.multiplicar(2,3);

    }
}

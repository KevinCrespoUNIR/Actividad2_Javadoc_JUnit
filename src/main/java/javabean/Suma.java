package javabean;

/**
 * <p>La clase contiene las funciones que suman números, ya sean reales o enteros,
 * recibiendo dos o tres parámetros de entrada y devolviendo su resultado.
 * La salida es la suma de los valores proporcionados.</p>
 * @author Kevin Crespo Romero
 * @link <a href="https://github.com/KevinCrespoUNIR">Mi perfil de GitHub</a>
 * @version 1.0
 * @see Calculadora
 */
public class Suma {

    /**
     * <p>Suma dos números reales y devuelve el resultado.</p>
     * @param real1 Primer número a sumar.
     * @param real2 Segundo número a sumar.
     * @return La suma de real1 y real22.
     * @throws IllegalArgumentException si se introduce un dato que no sea numérico.
     */
    public double sumarDosReales(double real1, double real2){

        return real1 + real2;
    }

    /**
     * <p>Suma dos números enteros y devuelve el resultado.</p>
     * @param entero1 Primer número a sumar.
     * @param entero2 Segundo número a sumar.
     * @return La suma de entero1 y entero2.
     * @throws IllegalArgumentException si se introduce un dato que no sea numérico o entero.
     */
    public int sumarDosEnteros(int entero1, int entero2){

        return entero1 + entero2;
    }

    /**
     * <p>Suma tres números enteros y devuelve el resultado.</p>
     * @param real1 Primer número a sumar.
     * @param real2 Segundo número a sumar.
     * @param real3 Tercer número a sumar.
     * @return La suma de real1, real2, real3.
     * @throws IllegalArgumentException si se introduce un dato que no sea numérico.
     */
    public double sumarTresReales(double real1, double real2, double real3){

        return real1 + real2 + real3;
    }
}

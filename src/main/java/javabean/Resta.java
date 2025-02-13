package javabean;

/**
 * <p>La clase contiene las funciones que restan números, ya sean reales o enteros,
 * recibiendo dos o tres parámetros de entrada y devolviendo su resultado.
 * La salida es la resta de los valores proporcionados.</p>
 * @author Kevin Crespo Romero
 * @link <a href="https://github.com/KevinCrespoUNIR">Mi perfil de GitHub</a>
 * @version 1.0
 * @see Calculadora
 */
public class Resta {

    /**
     * @param valorAcumulado Almacena el resultado de las tres operaciones y
     * el resultado se mostrará en {@link Calculadora}
     */
    public double valorAcumulado;

    public double getValorAcumulado() {
        return valorAcumulado;
    }

    /**
     * <p>Resta dos números reales y devuelve el resultado.</p>
     * @param real1 Primer número a restar.
     * @param real2 Segundo número a restar.
     * @return La resta de real1 y real22.
     * @throws IllegalArgumentException si se introduce un dato que no sea numérico.
     */
    public double restarDosReales(double real1, double real2){
        valorAcumulado += real1 - real2;
        return real1 - real2;
    }

    /**
     * <p>Resta dos números enteros y devuelve el resultado.</p>
     * @param entero1 Primer número a restar.
     * @param entero2 Segundo número a restar.
     * @return La resta de entero1 y entero2.
     * @throws IllegalArgumentException si se introduce un dato que no sea numérico o entero.
     */
    public int restarDosEnteros(int entero1, int entero2){
        valorAcumulado += entero1 - entero2;
        return entero1 - entero2;
    }

    /**
     * <p>Resta tres números enteros y devuelve el resultado.</p>
     * @param real1 Primer número a restar.
     * @param real2 Segundo número a restar.
     * @param real3 Tercer número a restar.
     * @return La resta de real1, real2 y real3.
     * @throws IllegalArgumentException si se introduce un dato que no sea numérico.
     */
    public double restarTresReales(double real1, double real2, double real3){
        valorAcumulado += real1 - real2 - real3;
        return real1 - real2 - real3;
    }
}


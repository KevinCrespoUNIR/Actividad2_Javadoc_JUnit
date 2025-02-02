package javabean;
import java.util.Scanner;

/**
 * <p>La clase contiene las funciones que restan números, ya sean reales o enteros,
 * recibiendo dos o tres parámetros de entrada y devolviendo su resultado.
 * La salida es la suma de los valores proporcionados.</p>
 * @author Kevin Crespo Romero
 * @version 1.0
 * @see testing.CalculadoraTest
 */

public class Resta {

    // Atributos de instancia //
    private int entero1;
    private int entero2;
    private double real1;
    private double real2;
    private double real3;
    private double valorAcumulado;
    private Scanner scanner = new Scanner(System.in);


    // Constructor con todos los parámetros //
    public Resta(int entero1,
                 int entero2,
                 double real1,
                 double real2,
                 double real3,
                 double valorAcumulado,
                 Scanner scanner) {
        super();
        this.entero1 = entero1;
        this.entero2 = entero2;
        this.real1 = real1;
        this.real2 = real2;
        this.real3 = real3;
        this.valorAcumulado = valorAcumulado;
        this.scanner = scanner;
    }

    // Constructor vacío //
    public Resta() {
        super();
    }

    // gets y sets //
    public int getEntero1() {
        return entero1;
    }
    public void setEntero1(int entero1) {
        this.entero1 = entero1;
    }
    public int getEntero2() {
        return entero2;
    }
    public void setEntero2(int entero2) {
        this.entero2 = entero2;
    }
    public double getReal1() {
        return real1;
    }
    public void setReal1(double real1) {
        this.real1 = real1;
    }
    public double getReal2() {
        return real2;
    }
    public void setReal2(double real2) {
        this.real2 = real2;
    }
    public double getReal3() {
        return real3;
    }
    public void setReal3(double real3) {
        this.real3 = real3;
    }
    public double getValorAcumulado() {
        return valorAcumulado;
    }
    public void setValorAcumulado(double valorAcumulado) {
        this.valorAcumulado = valorAcumulado;
    }
    public Scanner getScanner() {
        return scanner;
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }


    // Métodos propios //
    public double restaDosReales(){
        /**
         * <p>Resta dos números reales introducidos por el
         * usuario y devuelve el resultado.</p>
         * @param real1 Primer número a restar.
         * @param real2 Segundo número a restar.
         * @param valorAcumulado Almacena el resultado de las tres operaciones y
         *                      el resultado se mostrará en {@link CalculadoraTest}
         * @return La resta de real1 y real2.
         * @throws IllegalArgumentException en caso de introducirse un valor no numérico.
         */

        System.out.println("Vamos a restar dos números reales. ");
        System.out.println("Introduce el primer número real: ");
        real1 = scanner.nextDouble();

        System.out.println("Introduce el segundo número real: ");
        real2 = scanner.nextDouble();

        valorAcumulado += (real1 - real2);

        return real1 - real2;
    }



    public int restaDosEnteros() {
        /**
         * <p>Resta dos números enteros introducidos por el
         * usuario y devuelve el resultado.</p>
         * @param entero1 Primer número a restar.
         * @param entero2 Segundo número a restar.
         * @param valorAcumulado Almacena el resultado de las tres operaciones y
         *                      el resultado se mostrará en {@link CalculadoraTest}
         * @return La resta de entero1 y entero2.
         * @throws IllegalArgumentException si se introduce un dato que no sea numérico.
         */
        System.out.println("Vamos a restar dos números enteros. ");
        System.out.println("Introduce el primer número entero: ");
        entero1 = scanner.nextInt();

        System.out.println("Introduce el segundo número entero: ");
        entero2 = scanner.nextInt();

        valorAcumulado += (entero1 - entero2);

        return entero1 - entero2;

    }



    public double restaTresReales() {
        /**
         * <p>Resta tres números reales introducidos por el
         * usuario y devuelve el resultado.</p>
         * @param real1 Primer número a restar.
         * @param real2 Segundo número a restar.
         * @param real3 Tercer número a restar.
         * @param valorAcumulado Almacena el resultado de las tres operaciones y
         *                      el resultado se mostrará en {@link CalculadoraTest}
         * @return La resta de real1, real2 y real3.
         * @throws IllegalArgumentException si se introduce un dato que no sea numérico.
         */
        System.out.println("Vamos a restar tres números reales. ");
        System.out.println("Introduce el primer número real: ");
        real1 = scanner.nextDouble();

        System.out.println("Introduce el segundo número real: ");
        real2 = scanner.nextDouble();

        System.out.println("Introduce el tercer número real: ");
        real3 = scanner.nextDouble();

        valorAcumulado += (real1 - real2 - real3);

        return real1 - real2 - real3;
    }
}
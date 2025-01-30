package testing;

import javabean.Cociente;

public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        /**
         *   Ejemplo de uso de los métodos
          */

        try {
            System.out.println("División de reales: " + calc.dividirReales(20.5, 2.5));
            System.out.println("División de enteros: " + calc.dividirEnteros(20, 2));
            System.out.println("Inverso de 8.0: " + calc.inversoReal(8.0));
            System.out.println("Raíz de 16: " + calc.raiz(16));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}


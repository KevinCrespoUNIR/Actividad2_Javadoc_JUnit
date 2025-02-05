package testing;


import javabean.Cociente;


import javabean.Suma;
import javabean.Resta;


public class CalculadoraTest {

    public static void main(String[] args) {

        Cociente calc = new Cociente();

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



        // ---------------------- SUMA ------------------------ //
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
        // ---------------------------------------------------- //

        System.out.println(" ");
        System.out.println(" ");

        // ---------------------- RESTA ----------------------- //
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
        // ---------------------------------------------------- //



    }
}


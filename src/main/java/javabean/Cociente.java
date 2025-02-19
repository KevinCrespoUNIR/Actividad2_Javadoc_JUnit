package javabean;

public class Cociente {

    /**
     * Esta clase implementará todos los métodos que están relacionados con la división de la calculadora.
     * @author Paula Arroyo
     * @link <a href="https://github.com/Polita86">Mi perfil de GitHub</a>
     * @version 1.0
     */

    /**
     * Método para dividir dos números reales
     * @param num1
     * @param num2
     * @return
     */
    public double dividirReales(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Error: División por cero no permitida.");
        }
        return num1 / num2;
    }

    /**
     * Método para dividir dos números enteros
     * @param num1
     * @param num2
     * @return
     */
    public int dividirEnteros(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Error: División por cero no permitida.");
        }
        return num1 / num2;
    }

    /**
     * Método para obtener el inverso de un número real
     *
     */

    public double inversoReal(double num) {
        if (num == 0) {
            throw new ArithmeticException("Error: No se puede calcular el inverso de cero.");
        }
        return 1 / num;
    }

    /**
     * Método para obtener la raíz cuadrada de un número
     * @param num
      */

    public double raiz(double num) {
        if (num < 0) {
            throw new ArithmeticException("Error: No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(num);
    }


}

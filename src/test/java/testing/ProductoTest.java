package testing;

import javabean.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Kevin Crespo Romero
 * @link <a href="https://github.com/KevinCrespoUNIR">Mi perfil de GitHub</a>
 * @version 1.0
 */

class ProductoTest {

    private Producto producto;  // Declarando el atributo de clase Producto

    @BeforeEach
    void setUp() {
        producto = new Producto();  // Iniciando el objeto producto
    }

    @Test
    void multiplicar() {
        double resulado = producto.multiplicar(2,5);
        assertEquals(10,resulado, "(2 * 5) debe ser 10");
    }

    @Test
    void testMultiplicar() {
        double resultado = producto.multiplicar(2,4,8);
        assertEquals(64, resultado, "(2 * 4 * 8)debe ser 64");
    }

    @Test
    void testMultiplicar1() {
        double resultado = producto.multiplicar(5.8, 6.2);
        assertEquals(35.96, resultado, "(5.8 * 6.2) debe ser 35.96");
    }

    @Test
    void potencia() {
        double resultado = producto.potencia(7,3);
        assertEquals(343, resultado, "(7^3) debe ser 343");
    }

}
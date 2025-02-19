package testing;

import javabean.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la clase Cociente.
 * Contiene pruebas unitarias para los métodos de división y raíz cuadrada.
 *
 * @author Adrian Ramses Munoz Rodriguez
 * gitHub: https://github.com/RamsesMR
 */
class CocienteTest {

    /**
     * Instancia de la clase Cociente para realizar las pruebas.
     */
    private Cociente cociente;

    /**
     * Configuración inicial antes de cada prueba.
     * Se ejecuta antes de cada test para inicializar la instancia de Cociente.
     */
    @BeforeEach
    void setUp() {
        cociente = new Cociente();
    }

    /**
     * Prueba unitaria para el método dividirReales.
     * Verifica que la división de dos números reales iguales devuelve 1.
     *
     *
     */
    @Test
    void dividirReales() {
        double resultado = cociente.dividirReales(10.5, 10.5);
        assertEquals(1, resultado, "La división de dos números reales iguales debe ser igual a 1");
    }

    /**
     * Prueba unitaria para el método dividirEnteros.
     * Verifica que la división de dos enteros devuelve el resultado esperado.
     *
     */
    @Test
    void dividirEnteros() {
        int resultado = cociente.dividirEnteros(10, 2);
        assertEquals(5, resultado, "La división debe ser igual a 5");
    }

    /**
     * Prueba unitaria para el método inversoReal.
     * Verifica que el inverso real de un número es correcto.
     *
     */
    @Test
    void inversoReal() {
        double resultado = cociente.inversoReal(20.5);
        assertEquals(0.04878048780487805, resultado, "El inverso real de 20.5 debe ser igual a 0.04878048780487805");
    }

    /**
     * Prueba unitaria para el método raiz.
     * Verifica que la raíz cuadrada de un número es correcta.
     *
     */
    @Test
    void raiz() {
        double resultado = cociente.raiz(81);
        assertEquals(9, resultado, "La raíz cuadrada de 81 deberá ser igual a 9");
    }
}

package testing;
import javabean.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    /**
     * Este test  verificará que la clase suma funciona correctamente.
     * @author Paula Arroyo
     * @link <a href="https://github.com/Polita86">Mi perfil de GitHub</a>
     * @version 1.0
     */

    private Suma suma;

    @BeforeEach
    void setUp() {
        suma = new Suma();
    }


    @Test
    void sumaDosReales() {
        double resultado = suma.sumarDosReales( 5.5, 5.5);
        assertEquals(11, resultado, "la suma de dos numeros reales de este caso de se igual a 11");

    }

    @Test
    void sumaDosEnteros() {
        int resultado = suma.sumarDosEnteros(5, 5);
        assertEquals(10, resultado, "la suma de dos numeros enteros de este caso de se igual a 10");

    }

    @Test
    void sumaTresReales() {
        double resultado = suma.sumarTresReales( 5.5, 5.5, 5.5);
        assertEquals(16.5, resultado, "la suma de dos numeros enteros de este caso de se igual a 16.5");

    }


}
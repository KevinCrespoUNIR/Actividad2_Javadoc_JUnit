package testing;
import javabean.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaTest {

    private Resta resta;
    @BeforeEach
    void setUp() {
        resta = new Resta();
    }

    @Test
    void restaDosReales() {
        double resultado = resta.restarDosReales(10.5, 5.3);
        assertEquals(5.2, resultado, "la resta de dos numeros reales de este caso de se igual a 5.2");

    }


    @Test
    void restaDosEnteros() {
        int resultado = resta.restarDosEnteros(10, 8);
        assertEquals(2, resultado, "la resta de dos numeros enteros de este caso de se igual a 2");

    }

    @Test
    void restaTresReales() {
        double resultado = resta.restarTresReales(10.5, 5.3, 1.2);
        assertEquals(4, resultado, "la resta de tres numeros reales de este caso de se igual a 4");

    }
}
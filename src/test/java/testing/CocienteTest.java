package testing;
import javabean.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CocienteTest {
   private Cociente cociente;

    @BeforeEach
    void setUp() {

    cociente= new Cociente();

    }

    @Test
    void dividirReales() {

        double resultado = cociente.dividirReales(10.5,10.5);
        assertEquals(1, resultado, "la division de dos numeros reales iguales  debe de se igual a 1");

    }

    @Test
    void dividirEnteros() {

  int resultado = cociente.dividirEnteros(10,2);
        assertEquals(5, resultado, "la division debe de se igual a 5");
    }

    @Test
    void inversoReal() {

        double resultado = cociente.inversoReal(20.5);
        assertEquals(0.04878048780487805, resultado, "el inverso real de 20.5 debe de se igual a 0.04878048780487805");

    }

    @Test
    void raiz() {

        double resultado = cociente.raiz(81);
        assertEquals(9, resultado, "la raiz cuadrada de 81 debera ser igual a 9");

    }
}
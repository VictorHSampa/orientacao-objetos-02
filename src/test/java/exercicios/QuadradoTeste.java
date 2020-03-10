package exercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class QuadradoTeste {
    private Quadrado q1;

    @BeforeEach
    public void beforeEach(){
        q1 = new Quadrado();
        q1.setLado(4.0);
    }

    @Test
    public void criarObjetoQuadrado() {
        assertNotNull(q1);
    }

    @Test
    public void presencaAtributoLado() {
        assertNotNull(q1.getLado());
    }

    @Test
    public void metodoSetLadoCorreto() {
        q1.setLado(10.0);
        assertEquals(10.0, q1.getLado());
    }

    @Test
    public void metodoSetLadoIncorreto() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> q1.setLado(-3.0));
        assertEquals("O lado deve ser positivo", exception.getMessage());
    }

    @Test
    public void metodoCalcularArea() {
        Double valorEsperado = 16.0;
        assertEquals(valorEsperado, q1.calcArea());
    }

    @Test
    public void metodoCalcularPerimetro() {
        Double valorEsperado = 16.0;
        assertEquals(valorEsperado, q1.calcPerimetro());
    }

}

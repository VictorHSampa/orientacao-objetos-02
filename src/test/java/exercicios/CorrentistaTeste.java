package exercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class CorrentistaTeste {
    private Correntista c1;

    @BeforeEach
    public void beforeEach(){
        c1 = new Correntista();
        c1.setCodigo(1.0);
        c1.setNome("Victor Sampa");
        c1.setEmail("victorhugosampa@gmail.com");
        c1.setTelefone("12981878634");
    }

    @Test
    public void criarObjetoCorrentista() {
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributoCodigo() {
        assertNotNull(c1.getCodigo());
    }

    @Test
    public void presencaAtributoNome() {
        assertNotNull(c1.getNome());
    }

    @Test
    public void presencaAtributoCodigo() {
        assertNotNull(c1.getEmail());
    }

    @Test
    public void presencaAtributoCodigo() {
        assertNotNull(c1.getTelefone());
    }

    @Test
    public void metodoSetCodigo() {
        assertEquals(1.0, c1.getCodigo());
    }

    @Test
    public void metodoSetCodigoIncorreto() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setCodigo(-2.0));
        assertEquals("codigo deve ser maior que zero", exception.getMessage());
    }

    @Test
    public void metodoSetNome() {
        assertEquals("Victor Sampa", c1.getNome());
    }

    @Test
    public void metodoSetNomeIncorreto() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setNome("a"));
        assertEquals("nome invalido", exception.getMessage());
    }

    @Test
    public void metodoSetEmail() {
        assertEquals("victorhugosampa@gmail.com", c1.getEmail());
    }

    @Test
    public void metodoSetEmailIncorreto() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setEmail("aaiohfi"));
        assertEquals("email invalido", exception.getMessage());
    }

    @Test
    public void metodoSetTelefone() {
        assertEquals("12981878634", c1.getTelefone());
    }

    @Test
    public void metodoSetTelefoneIncorreto() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setTelefone("770"));
        assertEquals("telefone invalido", exception.getMessage());
    }
}

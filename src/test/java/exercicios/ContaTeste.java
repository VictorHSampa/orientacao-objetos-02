package exercicios;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTeste {
    private Conta c1, c2;

    @BeforeEach
    public void beforeEach() {
        c1 = new Conta();
        c1.setNumero(1);
        c1.depositar(3000.0);
        c1.setLimite(1000.0);

        c2 = new Conta();
        c2.setNumero(2);
        c2.depositar(100.0);
        c2.setLimite(200.0);
    }

    @Test
    public void criarObjetoConta() {
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(c1.getNumero());
        assertNotNull(c1.getSaldo());
    }

    @Test
    public void metodoGetSaldo() {
        assertEquals(3000.0, c1.getSaldo());

    }
    @Test
    public void metodoGetNumero() {
        assertEquals(1, c1.getNumero());
    }

    @Test
    public void metodoGetLimite() {
        assertEquals(1000.0, c1.getLimite());
    }

    @Test
    public void metodoSetValorValido(){
        Conta conta = new Conta();
        conta.setNumero(7);
        assertEquals(7, conta.getNumero());
    }

    @Test
    public void metodoSetValorInvalido() {
        Conta conta = new Conta();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta.setNumero(-2));
        assertEquals("num deve ser positivo", exception.getMessage());
    }

    @Test
    public void metodoSetLimiteValido(){
        Conta conta = new Conta();
        conta.setLimite(500.0);
        assertEquals(500.0, conta.getLimite());
    }

    @Test
    public void metodoSetLimiteInvalido() {
        Conta conta = new Conta();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta.setLimite(-50.0));
        assertEquals("limite deve ser maior que zero.", exception.getMessage());
    }

    @Test
    public void metodoDepositarValorValido() {
        c1.depositar(300.0);
        assertEquals(3300.0, c1.getSaldo());

    }

    @Test
    public void metodoSacarValorValido() {
        c1.sacar(500.0);
        assertEquals(2500.0, c1.getSaldo());

    }

    @Test
    public void metodoSacarValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.sacar(5000.0));
        assertEquals("Saque invalido", exception.getMessage());

    }

    @Test
    public void metodoTransferirValorValido() {
        c1.transferir(c2, 500.0);
        assertEquals(2500, c1.getSaldo());
        assertEquals(600, c2.getSaldo());
    }


}

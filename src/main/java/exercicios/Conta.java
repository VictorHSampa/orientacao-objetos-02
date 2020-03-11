package exercicios;

public class Conta {
    private Integer numero;
    private Double saldo = 0.0;
    private Double limite;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero){
        if(numero <= 0){
            throw new IllegalArgumentException("numero deve ser maior que zero.");
        }
        this.numero = numero;
    }
    public void setLimite(Double limite) {
        if (limite < 0){
            throw new IllegalArgumentException("limite deve ser maior que zero.");
        }
        this.limite = limite;
    }

    public Double getLimite(){
        return limite;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valor) {

        saldo += valor;
    }

    public void sacar(Double valor) {
        if(saldo - valor < 0 - limite){
            throw new IllegalArgumentException("Saque invalido");
        }
        saldo -= valor;
    }

    public void transferir(Conta conta, Double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            conta.saldo += valor;
        }
    }
}

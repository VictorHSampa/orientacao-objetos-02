package exercicios;

public class Quadrado {
    private Double lado;

    public void setLado(Double lado) {
        if(lado <= 0){
            throw new IllegalArgumentException("O lado deve ser positivo");
        }
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public Double calcArea(){
        return lado * lado;
    }
    public Double calcPerimetro(){
        return lado * 4;
    }
}

package exercicios;

public class Circulo {
    private Double raio;

    public void setRaio(Double raio) {
        if(raio <= 0){
            throw new IllegalArgumentException("O raio deve ser positivo");
        }
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public Double calcArea(){
        return (raio * raio) * 3.0;
    }
    public Double calcPerimetro(){
        return (2.0*raio)*3.0;
    }
}

package exercicios;

public class Retangulo {
    private Double base;
    private Double altura;

    public void setBase(Double base) {
        if(base <= 0){
            throw new IllegalArgumentException("A base deve ser positiva");
        }
        this.base = base;
    }

    public Double getBase() {
        return base;
    }

    public void setAltura(Double altura){
        if(altura <= 0){
            throw new IllegalArgumentException("A altura deve ser positiva");
        }
        this.altura = altura;
    }

    public Double getAltura(){
        return altura;
    }


    public Double calcArea(){
        return base * altura;
    }
    public Double calcPerimetro(){
        return 2*(base + altura);
    }
}

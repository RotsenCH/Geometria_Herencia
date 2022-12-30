package Geometria_2D;

public class Hexagono extends Figura_2D{
    public Hexagono(double lado, double apotema){
        this.lado = lado;
        this.altura = apotema;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularPerimetro(){
        perimetro = lado * 6;
    }

    @Override
    protected void calcularArea(){
        area = lado* 6 * altura;
    }
}
package Geometria_2D;

public class Triangulo extends Figura_2D{
    public Triangulo(double lado, double apotema){
        this.lado = lado;
        this.altura = apotema;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularPerimetro(){
        perimetro = lado * 3;
    }

    @Override
    protected void calcularArea(){
        area = (lado* 3 * altura)/2;
    }
}

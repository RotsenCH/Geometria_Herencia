package Geometria_2D;

public class Heptagono extends Figura_2D{
    public Heptagono(double lado, double apotema){
        this.lado = lado;
        this.altura = apotema;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularPerimetro(){
        perimetro = lado * 7;
    }

    @Override
    protected void calcularArea(){
        area = (lado* 7 * altura)/2;
    }
}
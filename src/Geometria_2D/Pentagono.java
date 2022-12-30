package Geometria_2D;

public class Pentagono extends Figura_2D{
    public Pentagono(double lado, double apotema){
        this.lado = lado;
        this.altura = apotema;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularPerimetro(){
        perimetro = lado * 5;
    }


    @Override
    protected void calcularArea(){
        area = (lado* 5 * altura)/2;
    }
}
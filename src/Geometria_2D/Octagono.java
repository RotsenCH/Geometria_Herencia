package Geometria_2D;

public class Octagono extends Figura_2D{
    public Octagono(double lado, double apotema){
        this.lado = lado;
        this.altura = apotema;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularPerimetro(){
        perimetro = lado * 8;
    }

    @Override
    protected void calcularArea(){
        area = lado * 4 * altura;
    }
}

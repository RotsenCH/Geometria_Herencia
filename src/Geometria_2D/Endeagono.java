package Geometria_2D;

public class Endeagono extends Figura_2D{

    public Endeagono(double lado, double apotema){
        this.lado = lado;
        this.base = apotema;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        area = (((11 * lado) * base) / 2 );//Base es la variable igual a apotema
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = lado * 11;
    }
}

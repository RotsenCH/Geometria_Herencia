package Geometria_2D;

public class Eneagono extends Figura_2D{
    private double nLado = 9;
    public Eneagono(double lado, double apotema){
        this.lado = lado;
        this.base = apotema;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        area = (((lado * nLado) * base)/2);//Base es la variable igual a apotema
    }
    @Override
    protected void calcularPerimetro(){
        perimetro = (lado * nLado);
    }
}

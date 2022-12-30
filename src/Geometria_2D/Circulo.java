package Geometria_2D;

public class Circulo extends Figura_2D{

    public Circulo(double radio){
        this.lado = radio;
        calcularArea();
        calcularPerimetro();
    }
    @Override
    protected void calcularArea(){
        area = Math.PI * lado / 2;
    }

    @Override
    protected void calcularPerimetro(){
        perimetro = 2 * Math.PI * lado;
    }
}
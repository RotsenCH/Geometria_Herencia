package Geometria_2D;

public class Cuadrado extends Figura_2D {
    public Cuadrado(double lado){
        this.lado = lado;
        calcularPerimetro();
        calcularArea();
    }

    @Override
    protected void calcularPerimetro(){
        perimetro = lado * 4;
    }

    @Override
    protected void calcularArea(){
        area = lado * lado;
    }

}

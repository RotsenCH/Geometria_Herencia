package Geometria_2D;

public class Decagono extends Figura_2D{

    public Decagono (double apotema, double lado){
        this.lado = lado;
        this.base = apotema;
        calcularPerimetro();
        calcularArea();
    }

    @Override
    protected void calcularPerimetro(){
        perimetro = lado * 10;
    }

    @Override
    protected void calcularArea() {
        area = (((lado * 10) * base )/2);
    }
}

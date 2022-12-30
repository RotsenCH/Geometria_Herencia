package Geometria_2D;

public class Decagono extends Figura_2D{
    private int nLado = 10;
    public Decagono (double apotema, double lado){
        this.lado = lado;
        this.base = apotema;
        calcularPerimetro();
        calcularArea();
    }

    @Override
    protected void calcularPerimetro(){
        perimetro = lado * nLado;
    }

    @Override
    protected void calcularArea() {
        area = (((lado * nLado) * base )/2);
    }
}

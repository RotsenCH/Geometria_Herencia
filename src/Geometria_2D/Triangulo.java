package Geometria_2D;

public class Triangulo extends Figura_2D{
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularPerimetro(){
        perimetro = base * 3;
    }

    @Override
    protected void calcularArea(){
        area = (base * altura)/2;
    }
}


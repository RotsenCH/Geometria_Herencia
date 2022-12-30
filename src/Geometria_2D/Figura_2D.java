package Geometria_2D;

public abstract class Figura_2D {
    public double base,
                altura,
                lado;

    protected double area,
                    perimetro;
    Figura_2D(){
        base = altura = lado = 0.0;
    }

    Figura_2D(double b, double h){
        base = b;
        altura = h;
    }

    Figura_2D(double l){
        lado = l;
    }

    Figura_2D(double b, double h, double l){
        base = b;
        altura = h;
        lado = l;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getLado() {
        return lado;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    protected abstract void calcularArea();
    protected abstract void calcularPerimetro();
}

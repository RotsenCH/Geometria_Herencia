package Geometria_3D;

public abstract  class Figura_3D {
    double volumen,area;
    double PI=3.1416;


    public double getArea() {
        return area;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public void setArea(double area) {
        this.area = area;
    }

    protected  abstract  void calcularArea();
    protected  abstract  void calcularVolumen();


}

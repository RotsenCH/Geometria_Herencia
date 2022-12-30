package Geometria_3D;

public class Piramide extends Figura_3D{
    private double altura,base;

    public Piramide(double altura, double base) {
        this.altura = altura;
        this.base = base;
        calcularArea();
        calcularVolumen();
    }
    @Override
    public void calcularArea(){area=(base*altura)/2;}
    @Override
    public void calcularVolumen(){volumen=(base*base)*altura/3;}
}

package Geometria_3D;

public class Cubo  extends  Figura_3D{
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
        calcularArea();
        calcularVolumen();
    }
    @Override
    public void calcularArea(){area=(6*(lado*lado));}
    @Override
    public void calcularVolumen(){volumen=(Math.pow(lado,3));}
}

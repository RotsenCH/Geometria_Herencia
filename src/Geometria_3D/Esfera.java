package Geometria_3D;

public class Esfera extends  Figura_3D{
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
        calcularArea();
        calcularVolumen();
    }
    @Override
    public void calcularArea(){area=(4*PI*(radio*radio));}

    @Override
    public  void calcularVolumen(){volumen=((1.333333333)*PI*Math.pow(radio,3));}
}

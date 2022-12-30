package Geometria_3D;

public class Cilindro extends Figura_3D{
    private double radio,altura;


    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        calcularArea();
        calcularVolumen();
    }
    @Override
    public void calcularArea(){
        area=(2*PI*radio)*(altura+radio);
    }
    @Override
    public  void calcularVolumen(){volumen=(PI*(radio*radio))*altura;}

}




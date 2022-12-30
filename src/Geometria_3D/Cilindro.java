package Geometria_3D;

public class Cilindro extends Figura_3D{

    public Cilindro(double altura, double radio){
        this.altura = altura;
        this.radio = radio;
        calcular_Volumen();
        calcular_areaBase();
        calcular_Extra();
    }

    @Override
    protected void calcular_Volumen() {
        volumen = (Math.PI * Math.pow(radio,2) * altura);
    }

    @Override
    protected void calcular_areaBase() {
        areaBase = (Math.PI * Math.pow(radio,2));
    }

    @Override
    protected void calcular_Extra() {//Calcula la superficie lateral del cilindro
        extra =(2 * radio * altura * Math.PI);
    }
}

package Geometria_3D;

public class Cono extends Figura_3D{

    public Cono(double altura, double radio, double apotema){
        this.altura = altura;
        this.radio = radio;
        this.apotema = apotema;
        calcular_Volumen();
        calcular_Extra();
        calcular_areaBase();
    }

    @Override
    protected void calcular_Volumen() {
        volumen = ((Math.PI * Math.pow(radio,2) * altura)/3);
    }

    @Override
    protected void calcular_Extra() {//Calcula la superficie lateral del cono
        extra = (Math.PI * apotema * radio);
    }

    @Override
    protected void calcular_areaBase() {
        areaBase = (Math.PI * Math.pow(radio,2));
    }
}
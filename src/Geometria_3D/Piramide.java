package Geometria_3D;

public class Piramide extends Figura_3D{

    public Piramide(double ladoBase, double altura){
        this.ladoA = ladoBase;
        this.altura = altura;
        calcular_Extra();
        calcular_Volumen();
        calcular_areaBase();
    }

    @Override
    protected void calcular_Extra() {//Calculara el perimetro de la Piramide
        extra = ((ladoA * 4)/2);
    }

    @Override
    protected void calcular_Volumen() {
        volumen = ((Math.pow(ladoA,2) * altura)/3);
    }

    @Override
    protected void calcular_areaBase() {//Calculara el area de la Piramide
        areaBase = Math.pow(ladoA,2);
    }
}

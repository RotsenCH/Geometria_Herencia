package Geometria_3D;

public class piramideHexagonal extends Figura_3D{

    public piramideHexagonal(double lado, double altura, double apotema){
        this.ladoA = lado;
        this.altura = altura;
        this.apotema = apotema;
        calcular_Volumen();
        calcular_areaBase();
        calcular_Extra();
    }

    @Override
    protected void calcular_Volumen() {
        volumen = ((Math.sqrt(3)/2) * Math.pow(ladoA,2) * altura);
    }

    @Override
    protected void calcular_areaBase() {
        areaBase = (((6 * ladoA) * apotema) / 2);
    }

    @Override
    protected void calcular_Extra() {//Calculara el perimetro de la piramide hexagonal
        extra = 6 * ladoA;
    }
}

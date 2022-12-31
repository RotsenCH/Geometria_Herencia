package Geometria_3D;

public class Cubo extends Figura_3D{

    public Cubo(double diagonal, double lado){
        this.diagonal = diagonal;
        this.ladoA = lado;
        calcular_Volumen();
        calcular_Extra();
        calcular_areaBase();
    }

    @Override
    protected void calcular_Volumen() {
        volumen = (Math.pow(ladoA,3));
    }

    @Override
    protected void calcular_Extra() {//Calcula la diagonal de la base
        extra = (Math.sqrt(3) * ladoA);
    }

    @Override
    protected void calcular_areaBase() {//Calcular el area total de la base
        areaBase = (6*Math.pow(ladoA,2));
    }
}

package Geometria_3D;

public abstract class Figura_3D {
    public double altura,
            radio,
            apotema,
            ladoA,
            ladoB,
            ladoC,
            diagonal,
            arista;

    protected double volumen,
            areaBase,
            areaCara,
            perimBase,
            extra,
            diagonalBase,
            areaTotal,
            circunferencia;
    Figura_3D(){
        altura = apotema = ladoB = ladoC = ladoA = diagonal = radio = arista = 0.0;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public double getExtra() {
        return extra;
    }

    //Creacion de los metodos que seran usados por las clases hijas
    protected  abstract void calcular_Volumen();

    protected  abstract void calcular_areaBase();


    protected  abstract void calcular_Extra();

}
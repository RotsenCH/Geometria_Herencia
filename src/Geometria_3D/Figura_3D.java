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
                    supLateral,
                    diagonalBase,
                    areaTotal,
                    circunferencia;
    Figura_3D(){
        altura = apotema = ladoB = ladoC = ladoA = diagonal = radio = arista = 0.0;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }


    protected  abstract void calcular_Volumen();

    protected  abstract void calcular_areaBase();

    protected  abstract void calcular_areaCara();

    protected  abstract void calcular_perimBase();

    protected  abstract void calcular_supLateral();

    protected  abstract void calcular_diagonalBase();

    protected  abstract void calcular_areaTotal();

    protected  abstract void calcular_circunferencia();
}

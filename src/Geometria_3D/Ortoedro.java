package Geometria_3D;

public class Ortoedro extends Figura_3D{

    public Ortoedro(double ladoA, double ladoB, double ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        calcular_Volumen();
        calcular_areaBase();
        calcular_Extra();
    }

    @Override
    protected void calcular_Volumen() {
        volumen = ladoA * ladoB * ladoC;
    }

    @Override
    protected void calcular_Extra() { //Calculara la diagonal interna
        extra = (Math.sqrt(Math.pow(ladoA,2) + Math.pow(ladoB,2) + Math.pow(ladoC,2)));
    }

    @Override
    protected void calcular_areaBase() {//Calculara el area
        areaBase = (2 * ((ladoA * ladoB)+(ladoB * ladoC)+(ladoC * ladoA)));
    }
}

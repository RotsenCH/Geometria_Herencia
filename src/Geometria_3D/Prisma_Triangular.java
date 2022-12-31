package Geometria_3D;

public class Prisma_Triangular extends Figura_3D {
    public Prisma_Triangular(double lado, double altura){
        this.altura = altura;
        this.ladoA = lado;
        calcular_Volumen();
        calcular_Extra();
        calcular_areaBase();
    }

    @Override
    protected void calcular_Volumen(){
        volumen = Math.sqrt(3)/4 * Math.pow(ladoA,2) * altura;
    }
    @Override
    protected void calcular_Extra(){
        extra = ladoA * Math.sqrt(3)/2 * ladoA + 3 * altura;
    }
    @Override
    protected void calcular_areaBase(){
        areaBase = Math.sqrt(3)/4 * Math.pow(ladoA,2);
    }
}

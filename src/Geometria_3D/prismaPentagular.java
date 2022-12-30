package Geometria_3D;

public class prismaPentagular extends Figura_3D{

    public prismaPentagular(double apotema, double lado, double altura){
        this.apotema = apotema;
        this.ladoA = lado;
        this.altura = altura;
        calcular_Volumen();
        calcular_areaBase();
        calcular_Extra();
    }

    @Override
    protected void calcular_Volumen() {
        volumen = (((5 * ladoA * apotema) / 2) * altura);
    }

    @Override
    protected void calcular_areaBase() {
        areaBase = ((5 * ladoA * apotema) / 2);
    }

    @Override
    protected void calcular_Extra() {//Calculara la area del prisma pentagular
        extra =(5 * ladoA * apotema + altura);
    }
}

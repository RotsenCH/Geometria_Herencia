package Geometria_3D;

public  class Cono extends Figura_3D{
    private double radio,altura,prisma;

    public Cono(double radio, double altura, double prisma) {
        this.radio = radio;
        this.altura = altura;
        this.prisma = prisma;
        calcularArea();
        calcularVolumen();
    }
    @Override
    public void calcularArea(){area=((PI*radio*prisma)+(PI*(radio*radio)));}
    @Override
    public void calcularVolumen(){ volumen=(PI*radio*radio*altura)/3;}
}

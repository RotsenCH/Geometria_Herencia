package Geometria_3D;

public class Esfera extends Figura_3D{

    public Esfera(double radio){
        this.radio = radio;
        calcular_Volumen();
        calcular_areaBase();
        calcular_Extra();
    }

    @Override
    protected void calcular_Volumen(){
        volumen = ((4/3) * Math.PI * Math.pow(radio,3));
    }

    @Override
    protected void calcular_Extra() {//Calculara la circunferencia de la esfera
        extra = (2 * Math.PI * radio);
    }

    @Override
    protected void calcular_areaBase() {//Calculara el area total de la esfera
        areaBase = (4 * Math.PI * Math.pow(radio,2));
    }
}

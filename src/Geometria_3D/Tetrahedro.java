package Geometria_3D;

public class Tetrahedro extends Figura_3D{
    public Tetrahedro(double arista){
        this.arista = arista;
        calcular_Volumen();
        calcular_Extra();
        calcular_areaBase();
    }

    @Override
    protected void calcular_Volumen(){
        volumen = Math.sqrt(2)/12 * Math.pow(arista,3);
    }
    @Override
    protected void calcular_Extra(){
        extra = Math.sqrt(3) * Math.pow(arista, 2);
    }
    @Override
    protected void calcular_areaBase(){
        areaBase = Math.sqrt(3)/4 * Math.pow(arista,2);
    }
}

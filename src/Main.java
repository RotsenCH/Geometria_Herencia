import Geometria_2D.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Circulo miCirculo = new Circulo(4);
        System.out.println(miCirculo.getArea());
        System.out.println(miCirculo.getPerimetro());

        double hola;
        hola = 2;
        System.out.println(hola);
        Cuadrado miCuadrado = new Cuadrado(4);
        System.out.println(miCuadrado.getArea());
        System.out.println(miCuadrado.getPerimetro());
        Heptagono miHep = new Heptagono(4, 2);
        System.out.println(miHep.getPerimetro());
        System.out.println(miHep.getArea());

    }
}
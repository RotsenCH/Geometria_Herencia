import Geometria_2D.*;

import java.text.DecimalFormat;

public class Main {
    static DecimalFormat dc = new DecimalFormat("##.00");
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

        Decagono miDecagono = new Decagono(4.1,6.7);
        System.out.println("El perimetro es:" + dc.format(miDecagono.getPerimetro()));
        System.out.println("El area es: " + dc.format(miDecagono.getArea()));

        Endeagono miEndeagono = new Endeagono(4.4,5.4);
        System.out.println("El perimetro es:" + dc.format(miEndeagono.getPerimetro()));
        System.out.println("El area es: " + dc.format(miEndeagono.getArea()));

        Eneagono miEneagono= new Eneagono(4.4321,5.4);
        System.out.println("El perimetro es:" + dc.format(miEneagono.getPerimetro()));
        System.out.println("El area es: " + dc.format(miEneagono.getArea()));



    }
}
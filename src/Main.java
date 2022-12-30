import Geometria_2D.*;
import Geometria_3D.*;

import java.text.DecimalFormat;
import java.util.Scanner;

//Si se usa el * se importan todas las clases tambien es lo mismo
//Escribir import Geometria2D
public class Main {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat dc = new DecimalFormat("##.00");//Redondeo a los numeros de resultado por 2 decimales
    static final String RESET = "\u001B[0m";//Elimina el color anterior
    static final String AZUL = "\u001B[34m";//Color azul a las letras
    static final String ROJO = "\u001B[31m";//Color rojo a las letras
    static final String VERDE = "\u001B[32m";//Color verde a las letras
    public static void main(String[] args) {



        boolean pausa = false; //Variable para para la repeticion del ciclo while

        try{
            while (!pausa){
                int opcion = menuPrincipal();
                switch(opcion){
                    case 1:{//Figura 2D
                        boolean pausaA = false;//Variable de finalizacion del ciclo while
                        while(!pausaA){
                            int opcionF2D = menuFiguras();
                            switch(opcionF2D){
                                case 1:{
                                    System.out.println("1. Cuadrado");
                                    double lado;
                                    System.out.print("Ingrese el lado: ");
                                    lado = sc.nextDouble();
                                    Cuadrado miCuadrado = new Cuadrado(lado);
                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El area del Cudrado es: " + dc.format(miCuadrado.getArea()));
                                    System.out.println("El perimetro del Cudrado es: " + dc.format(miCuadrado.getPerimetro()));
                                }break;
                                case 2:{
                                    System.out.println("2. Circulo");
                                    double rad;
                                    System.out.print("Ingrese el radio: ");
                                    rad = sc.nextDouble();
                                    Circulo miCirculo = new Circulo(rad);
                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El area del circulo es: " + dc.format(miCirculo.getArea()));
                                    System.out.println("El perimetro del circulo es: " + dc.format(miCirculo.getPerimetro()));
                                }break;
                                case 3:{
                                    System.out.println("3. Decagono");
                                    double apo, lado;
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextDouble();
                                    System.out.print("Ingrese el valor del lado: ");
                                    lado = sc.nextInt();
                                    Decagono miDecagono = new Decagono(apo,lado);
                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El area del Decagono es: " + dc.format(miDecagono.getArea()));
                                    System.out.println("El perimetro del Decagono es: " + dc.format(miDecagono.getPerimetro()));
                                }break;
                                case 4:{
                                    System.out.println("4. Endeagono");
                                    double apo,lado;
                                    System.out.print("Ingrese el valor del lado: ");
                                    lado = sc.nextDouble();
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextInt();
                                    Endeagono miEndeagono = new Endeagono(lado,apo);
                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El area del Endecagono es: " + dc.format(miEndeagono.getArea()));
                                    System.out.println("El perimetro del Endecagono es: " + dc.format(miEndeagono.getPerimetro()));
                                }break;
                                case 5:{
                                    System.out.println("5. Eneagono");
                                    double apo,lado;
                                    System.out.print("Ingrese el valor del lado: ");
                                    lado = sc.nextDouble();
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextInt();
                                    Eneagono miEneagono = new Eneagono(lado,apo);
                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El area del Eneagono es: " + dc.format(miEneagono.getArea()));
                                    System.out.println("El perimetro del Eneagono es: " + dc.format(miEneagono.getPerimetro()));
                                }break;
                                case 6:{
                                    System.out.println("6. Heptagono");
                                    double apo,lados;
                                    System.out.print("Ingrese el valor del lado: ");
                                    lados = sc.nextDouble();
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextInt();
                                    Heptagono heptagono= new Heptagono(lados,apo);
                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El area del Heptagono es: " + dc.format(heptagono.getArea()));
                                    System.out.println("El perimetro del Heptagono es: " + dc.format(heptagono.getPerimetro()));
                                }break;
                                case 7:{
                                    System.out.println("7. Hexagono");
                                    double apo,lado;
                                    System.out.print("Ingrese el valor del lado: ");
                                    lado = sc.nextDouble();
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextInt();
                                    Hexagono hexagono= new Hexagono(lado, apo);
                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El area del Hexagono es: " + dc.format(hexagono.getArea()));
                                    System.out.println("El perimetro del Hexagono es: " + dc.format(hexagono.getPerimetro()));
                                }break;
                                case 8:{
                                    System.out.println("8. Octogono");
                                    double apo,lado;
                                    System.out.print("Ingrese el valor del lado: ");
                                    lado = sc.nextDouble();
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextInt();
                                    Octagono octogono= new Octagono(lado, apo);
                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El area del Octogono es: " + dc.format(octogono.getArea()));
                                    System.out.println("El perimetro del Octogono es: " + dc.format(octogono.getPerimetro()));

                                }break;
                                case 9:{
                                    System.out.println("9. Pentagono");
                                    double apo, lado;
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextDouble();
                                    System.out.print("Ingrese la longitud del lado: ");
                                    lado = sc.nextDouble();
                                    Pentagono pentagonoP = new Pentagono(lado, apo);
                                    System.out.println("El area del pentagono es: " + dc.format(pentagonoP.getArea()));
                                    System.out.println("El perimetro del pentagono es: " + dc.format(pentagonoP.getPerimetro()));
                                }break;
                                case 10:{
                                    System.out.println("10. Triangulo");
                                    double base,altura;
                                    System.out.print("Ingrese la base: ");
                                    base = sc.nextDouble();
                                    System.out.print("Ingrese el apotema: ");
                                    altura = sc.nextInt();
                                    Triangulo triangulo= new Triangulo(base,altura);
                                    System.out.println("----Resultados----");
                                    System.out.println("El area del Triangulo es: " + dc.format(triangulo.getArea()));
                                    System.out.println("El perimetro del Triangulo es: " + dc.format(triangulo.getPerimetro()));
                                }break;
                                case 11:{
                                    System.out.println(VERDE + "Volviendo al menu principal...." + RESET);
                                    pausaA = true;
                                }break;
                            }

                        }
                    }break;
                    case 2:{//Figuras 3D
                        boolean pausaP = false;//Variable de finalizacion del ciclo while
                        while(!pausaP){
                            int opcionF3D = menuFiguras_volumenes();
                            switch(opcionF3D){
                                case 1:{
                                    System.out.println("1. Cilindro");
                                    double alturaCil, radioCil;
                                    System.out.print("Ingrese el valor de la altura: ");
                                    alturaCil = sc.nextDouble();
                                    System.out.print("Ingrese el valor del radio: ");
                                    radioCil = sc.nextDouble();
                                    Cilindro cilindro = new Cilindro(alturaCil,radioCil);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(cilindro.getVolumen()));
                                    System.out.println("Area de la Base: " + dc.format(cilindro.getAreaBase()));
                                    System.out.println("Superficie Lateral: " + dc.format(cilindro.getExtra()));
                                }break;
                                case 2:{
                                    System.out.println("2. Cono");
                                    double radioCono, alturaCono, apotemaCono;
                                    System.out.print("Radio: ");
                                    radioCono = sc.nextDouble();
                                    System.out.print("Altura: ");
                                    alturaCono = sc.nextDouble();
                                    System.out.print("Apotema: ");
                                    apotemaCono = sc.nextDouble();

                                    Cono cono = new Cono(radioCono, alturaCono, apotemaCono);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(cono.getVolumen()));
                                    System.out.println("Superficie Lateral" + dc.format(cono.getExtra()));
                                    System.out.println("Area de la Base" + dc.format(cono.getAreaBase()));
                                }break;
                                case 3:{
                                    System.out.println("3. Cubo");
                                    double diagonalCubo, ladoCubo;

                                    System.out.println("Diagonal: ");
                                    diagonalCubo = sc.nextDouble();
                                    System.out.println("Lado: ");
                                    ladoCubo = sc.nextDouble();

                                    Cubo cubo = new Cubo(diagonalCubo, ladoCubo);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(cubo.getVolumen()));
                                    System.out.println("Area de la Base: " + dc.format(cubo.getAreaBase()));
                                    System.out.println("Diagonal Base" + dc.format(cubo.getExtra()));
                                }break;
                                case 4:{
                                    System.out.println("4. Esfera");
                                    double radioEsfera;

                                    System.out.println("Radio: ");
                                    radioEsfera = sc.nextDouble();

                                    Esfera esfera = new Esfera(radioEsfera);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(esfera.getVolumen()));
                                    System.out.println("Area Total: " + dc.format(esfera.getAreaBase()));
                                    System.out.println("Circunferencia" + dc.format(esfera.getExtra()));
                                }break;
                                case 5:{
                                    System.out.println("5. Ortoedro");
                                    double ortoA, ortoB, ortoC;

                                    System.out.println("Lado A: ");
                                    ortoA = sc.nextDouble();
                                    System.out.println("Lado B: ");
                                    ortoB = sc.nextDouble();
                                    System.out.println("Lado C: ");
                                    ortoC = sc.nextDouble();

                                    Ortoedro ortoedro = new Ortoedro(ortoA,ortoB,ortoC);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(ortoedro.getVolumen()));
                                    System.out.println("Area: " + dc.format(ortoedro.getAreaBase()));
                                    System.out.println("Diagonal Interna: " + dc.format(ortoedro.getExtra()));
                                }break;
                                case 6:{
                                    System.out.println("6. Piramide");
                                    double basePiramide, alturaPiramide;

                                    System.out.println("Lado Base: ");
                                    basePiramide = sc.nextDouble();
                                    System.out.println("Altura: ");
                                    alturaPiramide = sc.nextDouble();

                                    Piramide piramide = new Piramide(basePiramide, alturaPiramide);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Area de la Base: " + dc.format(piramide.getAreaBase()));
                                    System.out.println("Perimetro de la Base: " + dc.format(piramide.getExtra()));
                                    System.out.println("Volumen: " + dc.format(piramide.getVolumen()));
                                }break;
                                case 7:{
                                    System.out.println("7. Piramide Hexagonal");
                                    double ladoPiramHexa, alturaPiramHexa, apotemaPiramHexa;

                                    System.out.println("Lado: ");
                                    ladoPiramHexa = sc.nextDouble();
                                    System.out.println("Altura: ");
                                    alturaPiramHexa = sc.nextDouble();
                                    System.out.println("Apotema: ");
                                    apotemaPiramHexa = sc.nextDouble();

                                    piramideHexagonal piramideHexagonal = new piramideHexagonal(ladoPiramHexa, alturaPiramHexa, apotemaPiramHexa);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(piramideHexagonal.getVolumen()));
                                    System.out.println("Perimetro de la Base: " + dc.format(piramideHexagonal.getExtra()));
                                    System.out.println("Area de la base: " + dc.format(piramideHexagonal.getAreaBase()));
                                }break;
                                case 8:{
                                    System.out.println("8. Prisma Pentagular");
                                    double apotemaPP, ladoPP, alturaPP;

                                    System.out.println("Apotema: ");
                                    apotemaPP = sc.nextDouble();
                                    System.out.println("Lado: ");
                                    ladoPP = sc.nextDouble();
                                    System.out.println("Altura: ");
                                    alturaPP = sc.nextDouble();

                                    prismaPentagular prismaPentagular = new prismaPentagular(apotemaPP, ladoPP, alturaPP);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(prismaPentagular.getVolumen()));
                                    System.out.println("Area: " + dc.format(prismaPentagular.getExtra()));
                                    System.out.println("Area de la base: " + dc.format(prismaPentagular.getAreaBase()));
                                }break;
                                case 9:{
                                    System.out.println("9. Prisma Triangular");
                                    double ladoPT, altuaPT;

                                    System.out.println("Lado: ");
                                    ladoPT = sc.nextDouble();
                                    System.out.println("Altura: ");
                                    altuaPT = sc.nextDouble();

                                    Prisma_Triangular prismaTriangular = new Prisma_Triangular(ladoPT, altuaPT);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(prismaTriangular.getVolumen()));
                                    System.out.println("Area: " + dc.format(prismaTriangular.getExtra()));
                                    System.out.println("Area de la base: " + dc.format(prismaTriangular.getAreaBase()));
                                }break;
                                case 10:{
                                    System.out.println("10. Tetrahedro");
                                    double aristaTetra;

                                    System.out.println("Arista: ");
                                    aristaTetra = sc.nextDouble();

                                    Tetrahedro tetrahedro = new Tetrahedro(aristaTetra);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(tetrahedro.getVolumen()));
                                    System.out.println("Area: " + dc.format(tetrahedro.getExtra()));
                                    System.out.println("Area de la Cara: " + dc.format(tetrahedro.getAreaBase()));
                                }break;
                                case 11:{
                                    System.out.println(VERDE + "Saliendo...." + RESET);
                                    pausaP = true;
                                }break;
                            }
                        }
                    }break;
                    case 3:{
                        System.out.println(VERDE + "Saliendo...." + RESET);
                        pausa = true;
                    }break;

                }
            }
        } catch (Exception ex) {
            System.out.println(ROJO + "\n\tTipo de dato ingresado incorrectamente!!!" + ex.getLocalizedMessage() + RESET);
        } finally {
            System.out.println(VERDE + "Programa Finalizado..." + RESET);
        }

    }
    public static int menuPrincipal(){
        int opPrincipal = 0;//Variable para el menu
        System.out.println("\t\t\t\t\t\t*** MENU ***");
        System.out.println("\t\t1. Areas y Perimetros");
        System.out.println("\t\t2. Volumenes");
        System.out.println("\t\t3. Salir");
        System.out.print("\t\t\tOpcion?: ");
        opPrincipal = sc.nextInt();
        while((opPrincipal < 1) || (opPrincipal > 3)){
            System.out.print("\t\tIngrese una opcion entre 1-3: ");
            opPrincipal = sc.nextInt();
        }
        return opPrincipal;
    }

    public static int menuFiguras(){//Menu de figuras disponible para el calculo de areas y perimetros
        int opFiugras = 0;//Variable para el menu
        System.out.println("\t\t\t\t\t*** FIGURAS 2D ***");
        System.out.println("\t1. Cuadrado");
        System.out.println("\t2. Circulo");
        System.out.println("\t3. Decagono");
        System.out.println("\t4. Endeagono");
        System.out.println("\t5. Eneagono");
        System.out.println("\t6. Heptagono");
        System.out.println("\t7. Hexagono");
        System.out.println("\t8. Octogono");
        System.out.println("\t9. Pentagono");
        System.out.println("\t10. Triangulo");
        System.out.println("\t11. Salir");
        System.out.print("\t\tOpcion?: ");
        opFiugras = sc.nextInt();
        while((opFiugras < 1) || (opFiugras > 11)){
            System.out.print("\tIngrese una opcion entre 1-11: ");
            opFiugras = sc.nextInt();
        }
        return opFiugras;
    }

    public static int menuFiguras_volumenes(){//Menu de figuras disponibles para calcular el volumen
        int opPerimetros = 0;
        System.out.println("\t\t\t\t\t*** FIGURAS 3D ***");
        System.out.println("\t1. Cilindro");
        System.out.println("\t2. Cono");
        System.out.println("\t3. Cubo");
        System.out.println("\t4. Esfera");
        System.out.println("\t5. Ortoedro");
        System.out.println("\t6. Piramide");
        System.out.println("\t7. Piramide Hexagonal");
        System.out.println("\t8. Prisma Pentagular");
        System.out.println("\t9. Prisma Triangular");
        System.out.println("\t10. Tetrahedro");
        System.out.println("\t11. Salir");
        System.out.print("\t\tOpcion?: ");
        opPerimetros = sc.nextInt();
        while((opPerimetros < 1) || (opPerimetros > 11)){
            System.out.print("\tIngrese una opcion entre 1-11: ");
            opPerimetros = sc.nextInt();
        }
        return opPerimetros;
    }
}

/*import Geometria_2D.*;

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
}*/
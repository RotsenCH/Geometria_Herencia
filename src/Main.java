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
                                    lado = sc.nextDouble();
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
                                    apo = sc.nextDouble();
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
                                    apo = sc.nextDouble();
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
                                    apo = sc.nextDouble();
                                    Heptagono miHeptagono = new Heptagono(lados,apo);
                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El area del Heptagono es: " + dc.format(miHeptagono.getArea()));
                                    System.out.println("El perimetro del Heptagono es: " + dc.format(miHeptagono.getPerimetro()));
                                }break;
                                case 7:{
                                    System.out.println("7. Hexagono");
                                    double apo,lado;
                                    System.out.print("Ingrese el valor del lado: ");
                                    lado = sc.nextDouble();
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextDouble();
                                    Hexagono miHexagono= new Hexagono(lado, apo);
                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El area del Hexagono es: " + dc.format(miHexagono.getArea()));
                                    System.out.println("El perimetro del Hexagono es: " + dc.format(miHexagono.getPerimetro()));
                                }break;
                                case 8:{
                                    System.out.println("8. Octogono");
                                    double apo,lado;
                                    System.out.print("Ingrese el valor del lado: ");
                                    lado = sc.nextDouble();
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextDouble();
                                    Octogono miOctogono= new Octogono(lado, apo);
                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El area del Octogono es: " + dc.format(miOctogono.getArea()));
                                    System.out.println("El perimetro del Octogono es: " + dc.format(miOctogono.getPerimetro()));

                                }break;
                                case 9:{
                                    System.out.println("9. Pentagono");
                                    double apo, perimetro, lado;
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextDouble();
                                    System.out.print("Ingrese la longitud del lado: ");
                                    lado = sc.nextDouble();
                                    Pentagono miPentagono= new Pentagono(lado, apo);
                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El area del Pentagono es: " + dc.format(miPentagono.getArea()));
                                    System.out.println("El perimetro del Pentagono es: " + dc.format(miPentagono.getPerimetro()));
                                }break;
                                case 10:{
                                    System.out.println("10. Triangulo");
                                    double lado,apotema;
                                    System.out.print("Ingrese el lado: ");
                                    lado = sc.nextDouble();
                                    System.out.print("Ingrese la altura: ");
                                    apotema = sc.nextDouble();
                                    Triangulo miTriangulo= new Triangulo(lado,apotema);
                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El area del Triangulo es: " + dc.format(miTriangulo.getArea()));
                                    System.out.println("El perimetro del Triangulo es: " + dc.format(miTriangulo.getPerimetro()));
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
                                    Cilindro miCilindro = new Cilindro(alturaCil,radioCil);

                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El Volumen del Cilindro es: " + dc.format(miCilindro.getVolumen()));
                                    System.out.println("EL Area Base del Cilindro: " + dc.format(miCilindro.getAreaBase()));
                                    System.out.println("La Superficie Lateral del Cilindro: " + dc.format(miCilindro.getExtra()));
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

                                    Cono miCono = new Cono(alturaCono, radioCono, apotemaCono);

                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El Volumen del Cono es: " + dc.format(miCono.getVolumen()));
                                    System.out.println("EL Area Base del Cono: " + dc.format(miCono.getAreaBase()));
                                    System.out.println("La Superficie Lateral del Cono: " + dc.format(miCono.getExtra()));
                                }break;
                                case 3:{
                                    System.out.println("3. Cubo");
                                    double diagonalCubo, ladoCubo;

                                    System.out.print("Ingrese la Diagonal de una cara del Cubo: ");
                                    diagonalCubo = sc.nextDouble();
                                    System.out.print("Lado: ");
                                    ladoCubo = sc.nextDouble();

                                    Cubo miCubo = new Cubo(diagonalCubo, ladoCubo);

                                    System.out.println("\n\t\t----Resultados----");
                                    System.out.println("El Volumen del  Cubo es: " + dc.format(miCubo.getVolumen()));
                                    System.out.println("El Area total del Cubo es: " + dc.format(miCubo.getAreaBase()));
                                    System.out.println("La Diagonal de Cubo es: " + dc.format(miCubo.getExtra()));
                                }break;
                                case 4:{
                                    System.out.println("4. Esfera");
                                    double radioEsfera;

                                    System.out.print("Ingrese el Radio: ");
                                    radioEsfera = sc.nextDouble();

                                    Esfera miEsfera = new Esfera(radioEsfera);

                                    System.out.println("\tResultados: ");
                                    System.out.println("El Volumen de la Esfera es: " + dc.format(miEsfera.getVolumen()));
                                    System.out.println("El Area Total de la Esfera es: " + dc.format(miEsfera.getAreaBase()));
                                    System.out.println("La Circunferencia de la Esfera es: " + dc.format(miEsfera.getExtra()));
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

                                   // Ortoedro ortoedro = new Ortoedro(ortoA,ortoB,ortoC);

                                    System.out.println("\tResultados: ");
                                   // System.out.println("Volumen: " + dc.format(ortoedro.volumen(ortoedro)));
                                  //  System.out.println("Area: " + dc.format(ortoedro.area(ortoedro)));
                                   // System.out.println("Diagonal Interna: " + dc.format(ortoedro.diagonalInterna(ortoedro)));
                                }break;
                                case 6:{
                                    System.out.println("6. Piramide");
                                    double basePiramide, alturaPiramide;

                                    System.out.println("Lado Base: ");
                                    basePiramide = sc.nextDouble();
                                    System.out.println("Altura: ");
                                    alturaPiramide = sc.nextDouble();

                                   // Piramide piramide = new Piramide(basePiramide, alturaPiramide);

                                    System.out.println("\tResultados: ");
                                   // System.out.println("Area de la Base: " + dc.format(piramide.areaBase(piramide)));
                                   // System.out.println("Perimetro de la Base: " + dc.format(piramide.perimetroBase(piramide)));
                                   // System.out.println("Volumen: " + dc.format(piramide.volumenPiramide(piramide)));
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

                                    //piramideHexagonal piramideHexagonal = new piramideHexagonal(ladoPiramHexa, alturaPiramHexa, apotemaPiramHexa);

                                    System.out.println("\tResultados: ");
                                   /* System.out.println("Volumen: " + dc.format(piramideHexagonal.volumen(piramideHexagonal)));
                                    System.out.println("Perimetro de la Base: " + dc.format(piramideHexagonal.perimetroBase(piramideHexagonal)));
                                    System.out.println("Area de la base: " + dc.format(piramideHexagonal.areaBase(piramideHexagonal)));*/
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

                                   // prismaPentagular prismaPentagular = new prismaPentagular(apotemaPP, ladoPP, alturaPP);

                                    System.out.println("\tResultados: ");
                                    /*System.out.println("Volumen: " + dc.format(prismaPentagular.volumen(prismaPentagular)));
                                    System.out.println("Area: " + dc.format(prismaPentagular.area(prismaPentagular)));
                                    System.out.println("Area de la base: " + dc.format(prismaPentagular.areaBase(prismaPentagular)));*/
                                }break;
                                case 9:{
                                    System.out.println("9. Prisma Triangular");
                                    double ladoPT, altuaPT;

                                    System.out.println("Lado: ");
                                    ladoPT = sc.nextDouble();
                                    System.out.println("Altura: ");
                                    altuaPT = sc.nextDouble();

                                   // prismaTriangular prismaTriangular = new prismaTriangular(ladoPT, altuaPT);

                                    System.out.println("\tResultados: ");
                                    /*System.out.println("Volumen: " + dc.format(prismaTriangular.volumen(prismaTriangular)));
                                    System.out.println("Area: " + dc.format(prismaTriangular.area(prismaTriangular)));
                                    System.out.println("Area de la base: " + dc.format(prismaTriangular.areaBase(prismaTriangular)));*/
                                }break;
                                case 10:{
                                    System.out.println("10. Tetrahedro");
                                    double aristaTetra;

                                    System.out.println("Arista: ");
                                    aristaTetra = sc.nextDouble();

                                    /*Tetrahedro tetrahedro = new Tetrahedro(aristaTetra);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(tetrahedro.volumen(tetrahedro)));
                                    System.out.println("Area: " + dc.format(tetrahedro.area(tetrahedro)));
                                    System.out.println("Area de la Cara: " + dc.format(tetrahedro.areaCara(tetrahedro)));*/
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
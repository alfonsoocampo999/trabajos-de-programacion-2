package Clases;

import Interfaz.IfiguraGeometrica;

//Clase principal main
public class App {
    public static void main(String[] args) throws Exception {

        /* Se emplea un for i, donde i actua como la cantidad de lados
         * de las figuras geometricas y usamos i para inicializar el atributo
         * cantidad de lados al momento de instanciar cada objeto, los objetos
         * son instanciados e inicializados en un switch case, en donde 
         * cada caso pertenece a una figura geometrica dependiendo de 
         * la cantidad de sus lados. 
         */
        for(int i=2;i<9;i++){
            switch(i){
                case 2:
                    System.out.println("\n******* Circulo **********\n");
                    Circulo figurasCirculo = new Circulo(3, i);
                    System.out.println("Area del circulo "+figurasCirculo.areaFigura());
                    System.out.println("Diametro del circulo "+figurasCirculo.perimetroFigura());
                    figurasCirculo.perimetroCirculo();
                    break;

                case 3:
                    System.out.println("\n******* Triangulo **********\n");
                    Triangulo figurasTriangulo = new Triangulo(3, i);
                    System.out.println("Area del triangulo "+figurasTriangulo.areaFigura());
                    System.out.println("Altura del triangulo "+figurasTriangulo.alturaTriangulo());
                    System.out.println("Perimetro del triangulo "+figurasTriangulo.perimetroFigura());
                    System.out.println("Suma angulo del triangulo "+figurasTriangulo.sumaAngulosInternos());
                    System.out.println("Apotema del triangulo "+figurasTriangulo.apotema());
                    break;
    
                case 4:
                    System.out.println("\n******* Cuadrado**********\n");
                    Cuadrado figurasCuadro = new Cuadrado(3, i);
                    System.out.println("Area del Cuadrado "+figurasCuadro.areaFigura());
                    figurasCuadro.diagonalCuadrado();
                    System.out.println("Perimetro del Cuadrado "+figurasCuadro.perimetroFigura());
                    System.out.println("Suma angulo del cuadrado "+figurasCuadro.sumaAngulosInternos());
                    System.out.println("Apotema del cuadrado "+figurasCuadro.apotema());
                    break;
                    
                case 5:
                    System.out.println("\n******* pentagono **********\n");
                    IfiguraGeometrica figurasPenta = new General(3, i);
                    System.out.println("Area del pentagono "+figurasPenta.areaFigura());
                    System.out.println("Perimetro del pentagono "+figurasPenta.perimetroFigura());
                    System.out.println("Suma angulo del pentagono "+figurasPenta.sumaAngulosInternos());
                    System.out.println("Apotema del pentagono "+figurasPenta.apotema());
                    break;

                case 6:
                    System.out.println("\n******* Hexagono **********\n");
                    IfiguraGeometrica figurasHexa = new General(3, i);
                    System.out.println("Area del Hexagono "+figurasHexa.areaFigura());
                    System.out.println("Perimetro del Hexagono "+figurasHexa.perimetroFigura());
                    System.out.println("Suma angulo del Hexagono "+figurasHexa.sumaAngulosInternos());
                    System.out.println("Apotema del Hexagono "+figurasHexa.apotema());
                    break;

                case 8:
                    System.out.println("\n******* Octagono **********\n");
                    IfiguraGeometrica figurasOcta = new General(3, i);
                    System.out.println("Area del Octagono "+figurasOcta.areaFigura());
                    System.out.println("Perimetro del Octagono "+figurasOcta.perimetroFigura());
                    System.out.println("Suma angulo del Octagono "+figurasOcta.sumaAngulosInternos());
                    System.out.println("Apotema del Octagono "+figurasOcta.apotema());
                    break;     
            }
        }
    }
}

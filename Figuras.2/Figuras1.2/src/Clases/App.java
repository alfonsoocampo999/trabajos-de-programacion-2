package Clases;


public class App {
    public static void main(String[] args) throws Exception {
  
        for(int i=2;i<9;i++){
            switch(i){
                case 2:
                    System.out.println("\n******* Circulo **********\n");
                    Figuras figurasCirculo = new Figuras(3, i);
                    figurasCirculo.areaCirculo();
                    figurasCirculo.perimetroCirculo();
                    System.out.println("Diametro del circulo "+figurasCirculo.perimetroFigura());
                    break;
                case 3:
                    System.out.println("\n******* Triangulo **********\n");
                    Figuras figurasTriangulo = new Figuras(3, i);
                    figurasTriangulo.areaTriangulo();
                    System.out.println("Altura del triangulo "+figurasTriangulo.alturaTriangulo());
                    System.out.println("Perimetro del triangulo "+figurasTriangulo.perimetroFigura());
                    System.out.println("Suma angulo del triangulo "+figurasTriangulo.sumaAngulosInternos());
                    System.out.println("Apotema del triangulo "+figurasTriangulo.apotema());
                    break;
    
                case 4:
                    System.out.println("\n******* Cuadrado**********\n");
                    Figuras figurasCuadro = new Figuras(3, i);
                    figurasCuadro.areaCuadrado();
                    figurasCuadro.diagonalCuadrado();
                    System.out.println("Perimetro del Cuadrado "+figurasCuadro.perimetroFigura());
                    System.out.println("Suma angulo del cuadrado "+figurasCuadro.sumaAngulosInternos());
                    System.out.println("Apotema del cuadrado "+figurasCuadro.apotema());
                    break;
                    
                case 5:
                    System.out.println("\n******* pentagono **********\n");
                    Figuras figurasPenta = new Figuras(3, i);
                    System.out.println("Area del pentagono "+figurasPenta.areaFigura());
                    System.out.println("Perimetro del pentagono "+figurasPenta.perimetroFigura());
                    System.out.println("Suma angulo del pentagono "+figurasPenta.sumaAngulosInternos());
                    System.out.println("Apotema del pentagono "+figurasPenta.apotema());
                    break;

                case 6:
                    System.out.println("\n******* Hexagono **********\n");
                    Figuras figurasHexa = new Figuras(3, i);
                    System.out.println("Area del Hexagono "+figurasHexa.areaFigura());
                    System.out.println("Perimetro del Hexagono "+figurasHexa.perimetroFigura());
                    System.out.println("Suma angulo del Hexagono "+figurasHexa.sumaAngulosInternos());
                    System.out.println("Apotema del Hexagono "+figurasHexa.apotema());
                    break;

                case 8:
                    System.out.println("\n******* Octagono **********\n");
                    Figuras figurasOcta = new Figuras(3, i);
                    System.out.println("Area del Octagono "+figurasOcta.areaFigura());
                    System.out.println("Perimetro del Octagono "+figurasOcta.perimetroFigura());
                    System.out.println("Suma angulo del Octagono "+figurasOcta.sumaAngulosInternos());
                    System.out.println("Apotema del Octagono "+figurasOcta.apotema());
                    break;     
            }
        }

    }
}

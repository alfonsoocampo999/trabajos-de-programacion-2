package Clases;
import Interfaz.IfiguraGeometrica;

// clase general para calcular figuras que comparten los mismos procesos matematicos
public class General extends FiguraRegular implements IfiguraGeometrica {

 //Constructor con parametros que inicializa los atributos del padre
public General(double lado, double cantidadLados) {
        super(lado, cantidadLados);
       
    }

    //Metodo sobre escrito de la interfaz IfiguraGeometrica
    //que calcula el area de una figura geometrica
    @Override
    public double areaFigura() {
        double area=(perimetroFigura()*apotema())/2;
        return area;
    }

    //Metodo sobre escrito de la interfaz IfiguraGeometrica
    //que calcula el perimetro de una figura geometrica
    @Override
    public double perimetroFigura() {
        double perimetro= super.getCantidadLados()*super.getLado();
        return perimetro; 
    }

    //Metodo sobre escrito de la interfaz IfiguraGeometrica
    //que calcula el apotema de una figura geometrica
    @Override
    public double apotema() {
        double angulo=360/(2*super.getCantidadLados());
        double apotema=super.getLado()/(2*Math.tan(Math.toRadians(angulo)));
       return apotema;
    }

    //Metodo sobre escrito de la interfaz IfiguraGeometrica
    //que calcula la suma de los angulos internos de una figura geometrica
    @Override
    public double sumaAngulosInternos() {
        double sumaAngulos=180*(super.getCantidadLados()-2);
        return sumaAngulos; 
    }

 
}

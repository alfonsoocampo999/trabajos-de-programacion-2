package Clases;

//clase que calcula cosas unicas de un cuadrado y hereda propiedades generales
// para realizar otros tipos de calculos
public class Cuadrado extends General {

    //Constructor con parametros que inicializa los atributos del padre
    public Cuadrado(double lado, double cantidadLados) {
        super(lado, cantidadLados);
    }

    //Metodo sobre escrito del padre llamado General 
    //que calcula el area del cuadrado
    @Override
    public double areaFigura() {
        double area = super.getLado()*super.getLado();
        return area;
    }

    //Metodo unico de la clase cuadrado que calcula la diagonal de un cuadrado
    public void diagonalCuadrado(){
        double diagonal= Math.sqrt(Math.pow(super.getLado(),2)+Math.pow(getLado(), 2));
         System.out.println("La diagonal del cuadrado es: "+diagonal);
         
    }
    
}

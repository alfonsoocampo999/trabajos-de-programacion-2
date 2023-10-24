package Clases;

//clase que calcula cosas unicas de un triangulo y hereda propiedades generales
// para realizar otros tipos de calculos
public class Triangulo extends General {

    //Constructor con parametros que inicializa los atributos del padre
    public Triangulo(double lado, double cantidadLados) {
        super(lado, cantidadLados);
    }

    //Metodo sobre escrito del padre llamado General 
    //que calcula el area del triangulo
    @Override
    public double areaFigura() {
        double area=(super.getLado()*alturaTriangulo())/2;
        return area;
    }

    //Metodo unico del triangulo que calcula su altura
    public double alturaTriangulo(){
        double altura = Math.sin(Math.toRadians(60)) * super.getLado();
        return altura;
    }
    
}

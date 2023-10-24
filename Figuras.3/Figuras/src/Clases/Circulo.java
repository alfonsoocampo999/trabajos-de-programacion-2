package Clases;

//clase que calcula cosas unicas de un circulo y hereda propiedades generales
// para realizar otros tipos de calculos
public class Circulo extends General {

    //Constructor con parametros que inicializa los atributos del padre
    public Circulo(double lado, double cantidadLados) {
        super(lado, cantidadLados);
    }

    //Metodo sobre escrito del padre llamado General 
    //que calcula el area del Circulo
    @Override
    public double areaFigura() {
        double calcular = (2*Math.PI)*(Math.pow(super.getLado(), 2));
        return calcular;
    }

    //Metodo unico de la clase Circulo que calcula el perimetro del circulo
     public void perimetroCirculo(){
        double calcular= 2*Math.PI*super.getLado();
        System.out.println("El perimetro del circulo es: "+calcular);
    }
    
}

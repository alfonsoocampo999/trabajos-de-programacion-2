package Clases;
import Interfaz.IfiguraGeometrica;

public class Figuras extends FiguraRegular implements IfiguraGeometrica  {

   

    public Figuras(double lado,double cantidadLados) {
        super(lado,cantidadLados);      
    }


    @Override
    public double areaFigura() {
        double area=(super.perimetroFigura()*apotema())/2;
        return area;
    }

    @Override
    public double perimetroFigura() {
        return super.perimetroFigura();
    }


    @Override
    public double apotema() {
        double angulo=360/(2*super.getCantidadLados());
        double apotema=super.getLado()/(2*Math.tan(Math.toRadians(angulo)));
       return apotema;
    }


    @Override
    public double sumaAngulosInternos() {
        double sumaAngulos=180*(super.getCantidadLados()-2);
        return sumaAngulos; 
    }

    // adicionales del caudrado****************************

    public void areaCuadrado (){
        double area = super.getLado()*super.getLado();
        System.out.println("La area del cuadrado es: "+area);
    }

    public void diagonalCuadrado(){
        double diagonal= Math.sqrt(Math.pow(super.getLado(),2)+Math.pow(getLado(), 2));
         System.out.println("La diagonal del cuadrado es: "+diagonal);
    }


    //adicionales del triangulo***************************

    public void areaTriangulo(){
       
        double areaT=(super.getLado()*alturaTriangulo())/2;
        System.out.println("El area de la figura es: "+areaT);
    }

    public double alturaTriangulo(){
        double altura = Math.sin(Math.toRadians(60)) * super.getLado();
        return altura;
    }

    //adicionales del circulo*******************************
    public void areaCirculo(){
       
        double calcular = (2*Math.PI)*(Math.pow(super.getLado(), 2));
        System.out.println("El area del circulo es: "+calcular);
    }

     public void perimetroCirculo(){
       
        double calcular= 2*Math.PI*super.getLado();
        System.out.println("El perimetro del circulo es: "+calcular);
    }
    
}

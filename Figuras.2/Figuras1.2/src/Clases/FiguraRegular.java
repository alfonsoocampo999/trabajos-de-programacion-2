package Clases;

public class FiguraRegular {
    private double lado;
    private double cantidadLados;

   
    

    public FiguraRegular(double lado, double cantidadLados) {
        this.lado = lado;
        this.cantidadLados = cantidadLados;
    }

    public double perimetroFigura(){ 
        double perimetro= this.cantidadLados*this.lado;
        return perimetro; 
    }

 
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    public double getCantidadLados() {
        return cantidadLados;
    }


    public void setCantidadLados(double cantidadLados) {
        this.cantidadLados = cantidadLados;
    }
}

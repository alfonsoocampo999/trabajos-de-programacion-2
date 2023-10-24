package Clases;

// Clase padre la cual inicializa los atributos
public class FiguraRegular {
    private double lado;
    private double cantidadLados;

    //Constructor con parametros que inicializa los atributos
    public FiguraRegular(double lado, double cantidadLados) {
        this.lado = lado;
        this.cantidadLados = cantidadLados;
    }


    //Metodos de acceso get y set
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

package Logica;

import java.time.LocalDateTime;
import java.util.ArrayList;


// constructor con parametros para inicializar atributos de la clase
public class Inscripcion {
    private static int codigoInscripcion, valor;
    private static LocalDateTime fechaInicio,fechaFin;

    public Inscripcion(int codigoInscripcion,int valor,
                        LocalDateTime fechaInicio,LocalDateTime fechaFin){

        this.codigoInscripcion=codigoInscripcion;
        this.valor=valor;
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
    }


    //********************************************************************************* */
    //metodos logicos

    // metodo que me ayuda a buscar toda las inscripciones
    public void buscarTodo(){
        //logica
        //logica
    }   

    //metodo que me buca la inscripcion por un codigo
    public int bucarCodigo(int codigo){
        //logica
        return 0;
    }

    //metodo que modifica las inscripciones
    public ArrayList nodificarInscripcion(ArrayList inscripcion){
        //logica
        return null;
    }

    //metodo que elimina inscripcion en particular
    public ArrayList eliminarInscripcion(ArrayList inscripcion){
        //logica
        return null;
    }



    //******************************************************************************** */
    // metodo get y set para obtener y manipular los atributos provados de la clase
    public static int getCodigoInscripcion() {
        return codigoInscripcion;
    }
    public static void setCodigoInscripcion(int codigoInscripcion) {
        Inscripcion.codigoInscripcion = codigoInscripcion;
    }
    public static int getValor() {
        return valor;
    }
    public static void setValor(int valor) {
        Inscripcion.valor = valor;
    }
    public static LocalDateTime getFechaInicio() {
        return fechaInicio;
    }
    public static void setFechaInicio(LocalDateTime fechaInicio) {
        Inscripcion.fechaInicio = fechaInicio;
    }
    public static LocalDateTime getFechaFin() {
        return fechaFin;
    }
    public static void setFechaFin(LocalDateTime fechaFin) {
        Inscripcion.fechaFin = fechaFin;
    }

    
}

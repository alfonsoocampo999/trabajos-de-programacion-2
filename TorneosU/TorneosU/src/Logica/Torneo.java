package Logica;

import java.sql.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Torneo {

    //atributos privados.
    private static int numMaxEquipos;
    private static String nombreTorneo;
    private static boolean aplicaLimiteEdad;
    private static int limiteEdad;
    private static LocalDateTime fechaInicio;
    private static int codigoTorneo;


    // constructor  recive datos e incializa los atributos de la clase
    public Torneo(int numMaxEquipos,String nombreTorneo,boolean aplicaLimiteEdad,
                   int limiteEdad,LocalDateTime fechaInicio,int codigoTorneo ){

        this.numMaxEquipos=numMaxEquipos;
        this.nombreTorneo=nombreTorneo;
        this.aplicaLimiteEdad=aplicaLimiteEdad;
        this.limiteEdad=limiteEdad;
        this.fechaInicio=fechaInicio;
        this.codigoTorneo=codigoTorneo;

    }


    /*/************************************************************* */ 
    // metodos logicos

    // metodo que busca un torneo en especificao
    public ArrayList buscarTorneo(String nombreTorneo){
        // logica 
        return null;
    }

    //metodo que retorna ujna lista de torneos buscados
    public List buscarTodo(){
        // logica 
        return null;
    }

    //metodo que modifica los datos de un torneo
    public ArrayList modificarTorneo(){
        // logica 
        return null;
    }

    //metodo que elimin un torneo especifico
    public boolean eliminarTorneo(){
        //logica
        return true;
    }

    //metodo que busca un torneo a partor de un codigo
    public Array buscarPorCodigo(int codigo){
        // logica
        return null;
    }



    //*********************************************************** */
    // metodos get y set para obtener y manipular los datos privados de la classe
    public static int getNumMaxEquipos() {
        return numMaxEquipos;
    }
    public static void setNumMaxEquipos(int numMaxEquipos) {
        Torneo.numMaxEquipos = numMaxEquipos;
    }
    public static String getNombreTorneo() {
        return nombreTorneo;
    }
    public static void setNombreTorneo(String nombreTorneo) {
        Torneo.nombreTorneo = nombreTorneo;
    }
    public static boolean isAplicaLimiteEdad() {
        return aplicaLimiteEdad;
    }
    public static void setAplicaLimiteEdad(boolean aplicaLimiteEdad) {
        Torneo.aplicaLimiteEdad = aplicaLimiteEdad;
    }
    public static int getLimiteEdad() {
        return limiteEdad;
    }
    public static void setLimiteEdad(int limiteEdad) {
        Torneo.limiteEdad = limiteEdad;
    }
    public static LocalDateTime getFechaInicio() {
        return fechaInicio;
    }
    public static void setFechaInicio(LocalDateTime fechaInicio) {
        Torneo.fechaInicio = fechaInicio;
    }
    public static int getCodigoTorneo() {
        return codigoTorneo;
    }
    public static void setCodigoTorneo(int codigoTorneo) {
        Torneo.codigoTorneo = codigoTorneo;
    }
    
}

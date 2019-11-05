package Modelos;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
    private String nombre;
    private int puntos;
    private List<String> direcciones;
    
    Usuario(String nombre){
        this.nombre = nombre;
        direcciones = new LinkedList<>();
        this.puntos = 0;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public List<String> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<String> direcciones) {
        this.direcciones = direcciones;
    }
}

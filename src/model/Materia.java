package model;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;

    private List<Alumno> alumnos;

    public Materia(String nombre) {
        this.alumnos = new ArrayList<>();
        this.nombre = nombre;
    }

    public Materia(){
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Alumno buscarAlumnoPorDNI(String dni){
        Alumno alumnoEncontrado = new Alumno();

        for (Alumno ar : getAlumnos()) {
            if (ar.getDni().equals(dni)){
                alumnoEncontrado = ar;
            }
        }

        return alumnoEncontrado;
    }

    public float calcularPromedio(){
        float totalAlumnos = getAlumnos().size();
        float edadAcumulada = 0;
        float resultado = 0;

        for (Alumno ar : getAlumnos()) {
            edadAcumulada = edadAcumulada + ar.getEdad();
        }
        resultado = edadAcumulada/totalAlumnos;
        return resultado;
    }
}

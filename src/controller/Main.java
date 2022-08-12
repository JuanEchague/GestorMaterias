package controller;

import model.Alumno;
import model.Materia;

public class Main {
    public static void main (String arg[]){
        Materia matematica = new Materia("Matematica");

        Alumno a1 = new Alumno("Victor", "Doom", "10000000", 124);
        Alumno a2 = new Alumno("Rick", "Richards", "10000001", 45);
        Alumno a3 = new Alumno("Peter", "Parker", "30000000", 25);
        Alumno a4 = new Alumno("Charles", "Xavier", "5000000", 70);
        Alumno a5 = new Alumno("Bruce", "Banner", "50000000", 33);
        Alumno a6 = new Alumno("Tony", "Stark", "20000000", 47);
        Alumno a7 = new Alumno("Matt", "Moordok", "30000000", 30);
        Alumno a8 = new Alumno("Foby", "Nelson", "50000000", 30);

        matematica.getAlumnos().add(a1);
        matematica.getAlumnos().add(a2);
        matematica.getAlumnos().add(a3);
        matematica.getAlumnos().add(a4);
        matematica.getAlumnos().add(a5);
        matematica.getAlumnos().add(a6);
        matematica.getAlumnos().add(a7);
        matematica.getAlumnos().add(a8);

        System.out.println("nombre: "+matematica.buscarAlumnoPorDNI("30000000").getNombre());
        System.out.println("apellido: "+matematica.buscarAlumnoPorDNI("30000000").getApellido());

        System.out.println("Promedio de edad: "+matematica.calcularPromedio());
    }
}

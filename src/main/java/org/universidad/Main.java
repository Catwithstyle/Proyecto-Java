package org.universidad;


import model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Carrera carrera = createCarrera(1L,NombreCarrera.ING_CIVIL,"ii");
        Profesor profesor = createProfesor(1L,"norman","cash","787787","0","norman@w","q");
        Materia materia = createMateria(1L,nombreMateria.ESPANOL,"Materia espanol",carrera,profesor);
        Alumno alumno = createAlumno(1L,"123","Ruben","Valle",materia,"78937953","8","ruben@2","asd");
        Asistencia asistencia = createAsistencia(1L,LocalDate.now(),materia);
        Detalle detalle = createDetalle(1L,alumno,true,asistencia);

        System.out.println(detalle);


    }
    public static Alumno createAlumno(Long id, String cif,
                                String nombre, String apellido,
                                Materia materia, String telefono1,
                                String telefono2, String email,
                                String email2){
        return new Alumno(id,cif,nombre,apellido,materia,telefono1,telefono2,email,email2);
    }

    public static Materia createMateria(Long id,
                                        model.nombreMateria nombreMateria,
                                        String descripcion,
                                        Carrera carrera,
                                        Profesor profesor){
        return new Materia(id,nombreMateria,descripcion,carrera,profesor);
    }

    public static Carrera createCarrera(Long id, NombreCarrera nombreCarrera, String descripcion){
        return new Carrera(id,nombreCarrera,descripcion);
    }

    public static Profesor createProfesor(Long id, String firstname,
                           String lastName, String telefono,
                           String telefono2, String correo,
                           String dirrecion){
        return new Profesor(id,firstname,lastName,telefono,telefono2,correo,dirrecion);
    }
    public static Asistencia createAsistencia(Long id, LocalDate fecha, Materia materia){
        return new Asistencia(id,fecha,materia);
    }
    public static Detalle createDetalle(Long id, Alumno alumno, boolean asistenciaAlumno, Asistencia asistencia){
        return new Detalle(id,alumno,asistenciaAlumno,asistencia);
    }
}
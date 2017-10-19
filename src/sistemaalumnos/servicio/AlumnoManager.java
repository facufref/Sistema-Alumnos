/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaalumnos.servicio;

import java.util.ArrayList;
import java.util.List;
import sistemaalumnos.datos.AlumnoDao;
import sistemaalumnos.dominio.Alumno;
import sistemaalumnos.dominio.Nota;

/**
 *
 * @author Facu
 */
public class AlumnoManager {
    
    private static AlumnoDao alumnoDao = new AlumnoDao();
    
    public static void AgregarAlumno(Alumno alumno){
        alumnoDao.AgregarAlumno(alumno);
    }
    
    public static void EliminarAlumno(int indice){
        alumnoDao.EliminarAlumno(indice);
    }
    
    public static void EditarAlumno(Alumno alumno){
        alumnoDao.EditarAlumno(alumno);
    }
    
    public static Alumno ObtenerAlumnoPorLegajo(int legajo){
        return alumnoDao.ObtenerAlumnoPorLegajo(legajo);
    }
    
    public static Alumno ObtenerAlumnoPorIndice(int indice){
        return alumnoDao.ObtenerAlumnoPorIndice(indice);
    }
    
    public static ArrayList<Alumno> ObtenerAlumnos(){
        return alumnoDao.ObtenerAlumnos();
    }
    
    public double obtenerPromedio(Alumno alumno){
    double sumaNotas = 0.0;
    
    List<Nota> notas = alumno.getNotas();
        for (Nota nota : notas) {
            sumaNotas += nota.getValor();
        }
    int cantidadNotas = notas.size();
    return sumaNotas/cantidadNotas;
    }
}

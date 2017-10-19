/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaalumnos.servicio;

import java.util.ArrayList;
import java.util.List;
import sistemaalumnos.datos.NotaDao;
import sistemaalumnos.dominio.Alumno;
import sistemaalumnos.dominio.Materia;
import sistemaalumnos.dominio.Nota;

/**
 *
 * @author Facu
 */
public class NotaManager {
    
    private static NotaDao notaDao = new NotaDao();
  
    //Materia hardcodeada que deberemos eliminar cuando implementemos materias
    static Materia materiaGenerica = new Materia("Materia Generica", 1);
    
    public static void AgregarNota(double valor, String observacion, int legajo){
        Nota nota = new Nota();
        
        Alumno alumno = AlumnoManager.ObtenerAlumnoPorLegajo(legajo);
        nota.setValor(valor);
        nota.setObservacion(observacion);
        nota.setAlumno(alumno);
        nota.setMateria(materiaGenerica);
        
        notaDao.AgregarNota(nota);
        
        //Tambien debo actualizar las notas del alumno
        alumno.agregarNota(nota);
        AlumnoManager.EditarAlumno(alumno);
    }
    
    public static void EliminarNota(int id){
        notaDao.EliminarNota(id);
    }
    
    public static void EditarNota(int id, double valor, String observacion, int legajo){
        Nota nota = NotaManager.ObtenerNotaPorId(id);
        
        Alumno alumno = AlumnoManager.ObtenerAlumnoPorLegajo(legajo);
        nota.setValor(valor);
        nota.setObservacion(observacion);
        nota.setAlumno(alumno);
        nota.setMateria(materiaGenerica);
        
        notaDao.EditarNota(nota);
        
        //Tambien debo actualizar las notas del alumno
        alumno.agregarNota(nota);
        AlumnoManager.EditarAlumno(alumno);
    }
    
    public static Nota ObtenerNotaPorId(int id){
        return notaDao.ObtenerNotaPorId(id);
    }
    
    public static ArrayList<Nota> ObtenerNotas(){
        return notaDao.ObtenerNotas();
    }
    
    public static ArrayList<Nota> ObtenerNotasPorAlumno(int legajo){
        return notaDao.ObtenerNotasPorAlumno(legajo);
    }
    
    public static double ObtenerPromedio(int legajo){
    
    ArrayList<Nota> notas = notaDao.ObtenerNotasPorAlumno(legajo);
    
    double sumaNotas = 0.0;
    for (Nota nota : notas) {
        sumaNotas += nota.getValor();
    }
    int cantidadNotas = notas.size();
    
    if(cantidadNotas == 0) return 0.0;
    
    return sumaNotas/cantidadNotas;
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaalumnos.datos;

import java.util.ArrayList;
import java.util.List;
import sistemaalumnos.dominio.Alumno;

/**
 *
 * @author Facu
 */
public class AlumnoDao {
    
    private ArrayList<Alumno> repositorioAlumnos = new ArrayList<Alumno>();
    
    public void AgregarAlumno(Alumno alumno){
        for (Alumno a : repositorioAlumnos) {
            if(a.getLegajo() == alumno.getLegajo()){
                System.out.println("Alumno Legajo "+alumno.getLegajo()+" ya existe.");
                return;
            }
        }
        repositorioAlumnos.add(alumno);
        System.out.println("Alumno Legajo "+alumno.getLegajo()+" agregado.");
    }
    
    public void EliminarAlumno(int legajo) {
        try {
            for (int i = 0; i < repositorioAlumnos.size(); i++) {
            if(repositorioAlumnos.get(i).getLegajo() == legajo){
                repositorioAlumnos.remove(i);
                System.out.println("Alumno Legajo "+legajo+" eliminado.");
                return;
                }           
            }   
        } catch (Exception e) {
            System.out.println("Error al eliminar alumno. Excepcion: " + e.getMessage());
        }
    }
    
    public void EditarAlumno(Alumno alumno){
        for (int i = 0; i < repositorioAlumnos.size(); i++) {
            if(repositorioAlumnos.get(i).getLegajo() == alumno.getLegajo()){
                repositorioAlumnos.set(i, alumno);
                System.out.println("Alumno Legajo "+alumno.getLegajo()+" editado.");
                return;
            }           
        }
        
        System.out.println("No se encontro el alumno con legajo "+alumno.getLegajo()+"."); 
    }
    
    public Alumno ObtenerAlumnoPorLegajo(int legajo){
        for (Alumno a : repositorioAlumnos) {
            if(a.getLegajo() == legajo){
                return a;
            }
        }
        System.out.println("Alumno Legajo "+legajo+" no encontrado.");
        return null;
    }
    
    public ArrayList<Alumno> ObtenerAlumnos(){
        return repositorioAlumnos;
    }
}

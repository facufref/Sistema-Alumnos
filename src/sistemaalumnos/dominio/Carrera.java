/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaalumnos.dominio;

import java.util.ArrayList;

/**
 *
 * @author Facu
 */
public class Carrera {
    
    private String nombre;
    private int id;
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private ArrayList<Materia> materias = new ArrayList<>();

    public Carrera() {
    }

    public Carrera(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void RegistrarMateria(String nombre, int codigo){
     Materia nuevaMateria = new Materia(nombre, codigo);
     this.materias.add(nuevaMateria);
    }
    
    public int ObtenerCantidadMaterias(){
    return materias.size();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    
    
}

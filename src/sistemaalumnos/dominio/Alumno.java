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
public class Alumno {
    
    private String nombre;
    private int legajo;
    private int dni;
    private long telefono;
    private String direccion;
    private double promedio;
    private ArrayList<Nota> notas = new ArrayList<>();
    private ArrayList<Materia> materiasAprobadas = new ArrayList<>();
    private ArrayList<Materia> materiasCursadas = new ArrayList<>();

    public Alumno() {
    }
    
    public Alumno(String nombre, int legajo, String nombreMateria, int codigoMateria) {
        this.nombre = nombre;
        this.legajo = legajo;
        Materia materia = new Materia(nombreMateria, codigoMateria);
        materiasCursadas.add(materia);
    }

    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }
    
    public Alumno(String nombre, int legajo, int dni, long telefono, String direccion) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public ArrayList<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(ArrayList<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public ArrayList<Materia> getMateriasCursadas() {
        return materiasCursadas;
    }

    public void setMateriasCursadas(ArrayList<Materia> materiasCursadas) {
        this.materiasCursadas = materiasCursadas;
    }
    
    public void agregarMateriaCursada(Materia materia){
        this.materiasCursadas.add(materia);
    }
    
    public void agregarNota(Nota nota){
        this.notas.add(nota);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre 
                + ", legajo=" + legajo 
                + ", dni=" + dni 
                + ", telefono=" + telefono 
                + ", direccion=" + direccion + '}';
    }
}

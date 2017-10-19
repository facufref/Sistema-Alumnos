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
public class Materia {
    
    private String nombre;
    private int codigo;
    private ArrayList<Alumno> alumnos;

    public Materia() {
    }
    
    public Materia(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}

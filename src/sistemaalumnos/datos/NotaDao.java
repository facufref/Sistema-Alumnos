/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaalumnos.datos;

import java.util.ArrayList;
import sistemaalumnos.dominio.Nota;

/**
 *
 * @author Facu
 */
public class NotaDao {
    
    private ArrayList<Nota> repositorioNotas = new ArrayList<Nota>();
    
    public void AgregarNota(Nota nota){
        
        int ultimoIndice = repositorioNotas.size() - 1;
        int nuevoId = 1;
        
        //Buscamos el id del ultimo elemento agregado
        if(repositorioNotas.size() > 0){
            nuevoId = repositorioNotas.get(ultimoIndice).getId() + 1;
        }
        
        nota.setId(nuevoId);
        repositorioNotas.add(nota);
        System.out.println("Nota Id "+nuevoId+" agregado.");
    }
    
    public void EliminarNota(int id) {
        try {
            for (int i = 0; i < repositorioNotas.size(); i++) {
            if(repositorioNotas.get(i).getId() == id){
                repositorioNotas.remove(i);
                System.out.println("Nota Id "+id+" eliminado.");
                return;
                }           
            }   
        } catch (Exception e) {
            System.out.println("Error al eliminar la nota. Excepcion: " + e.getMessage());
        }
    }
    
    public void EditarNota(Nota nota){
        for (int i = 0; i < repositorioNotas.size(); i++) {
            if(repositorioNotas.get(i).getId() == nota.getId()){
                repositorioNotas.set(i, nota);
                System.out.println("Nota Id "+nota.getId()+" editado.");
                return;
            }           
        }
        
        System.out.println("No se encontro la nota con id "+nota.getId()+"."); 
    }
    
    public Nota ObtenerNotaPorId(int id){
        for (Nota a : repositorioNotas) {
            if(a.getId() == id){
                return a;
            }
        }
        System.out.println("Nota Id "+id+" no encontrado.");
        return null;
    }
    
    public ArrayList<Nota> ObtenerNotas(){
        return repositorioNotas;
    }
    
    public ArrayList<Nota> ObtenerNotasPorAlumno(int legajo){
        ArrayList<Nota> listaNotas = new ArrayList<>();
        for (Nota nota : repositorioNotas) {
            if(nota.getAlumno().getLegajo() == legajo){
                listaNotas.add(nota);
            }
        }
        return listaNotas;
    }
}

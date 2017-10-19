/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaalumnos;

import sistemaalumnos.vistas.VentanaAlumnos;
import sistemaalumnos.dominio.Carrera;
import sistemaalumnos.dominio.Alumno;
import sistemaalumnos.dominio.Materia;
import java.util.ArrayList;
import sistemaalumnos.datos.AlumnoDao;
import sistemaalumnos.servicio.AlumnoManager;
import sistemaalumnos.vistas.VentanaPrincipal;

/**
 *
 * @author Facu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno facu = new Alumno("Facundo Esquivel Fagiani", 37923, 36123123, 442212, "Calle falsa 123");
        Alumno ari = new Alumno("Ariana Garcia", 38155, 1111414, 44444, "Calle falsa 456");
        AlumnoManager.AgregarAlumno(facu);        
        AlumnoManager.AgregarAlumno(ari);
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
    
}

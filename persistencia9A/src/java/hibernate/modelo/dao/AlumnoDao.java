/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.modelo.dao;

import hibernate.modelo.Alumno;
import hibernate.modelo.Grupo;
import java.util.ArrayList;


/**
 *
 * @author Pavka
 */
public interface AlumnoDao {
    
    //desde... <metodos para el crud
    public boolean crearAlumno(String nombre, String matricula, Grupo grupo);
    public boolean crearAlumno(Alumno instancia);
  
    public ArrayList<Alumno> listarAlumno();
    
    public boolean modificarAlumno(Integer idAlumno, String nombre, String matricula, Grupo grupo);
    public boolean modificarAlumno(Alumno instancia);
    
    public boolean eliminarAlumno(Integer idAlumno);
    public boolean eliminarAlumno(Alumno instancia);
    
    
    public Alumno buscarPorId(Integer idAlumno);
    public  ArrayList<Alumno> buscarPorcriterio(String nombre, String matricula, Grupo grupo);
    public  ArrayList<Alumno> buscarPorcriterio(Alumno instancia);
}

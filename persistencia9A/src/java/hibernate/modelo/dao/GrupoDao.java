/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.modelo.dao;

import hibernate.modelo.Grupo;
import java.util.ArrayList;

/**
 *
 * @author Pavka
 */
public interface GrupoDao {
    
    //desde... <metodos para el crud
    public boolean crearGrupo(String descripcion);
    public boolean crearGrupo(Grupo instancia);
    
    public ArrayList<Grupo> listarGrupo();
    
    public boolean modificarGrupo(Integer idGrupo, String descripcion);
    public boolean modificarGrupo(Grupo instancia);
    
    public boolean eliminarGrupo(Integer idGrupo);
    public boolean eliminarGrupo(Grupo instancia);
    
    public Grupo buscarPorId(Integer idGroup);
    
    public  ArrayList<Grupo> buscarPorcriterio(String descripcion);
    public  ArrayList<Grupo> buscarPorcriterio(Grupo instancia);
          
            
}

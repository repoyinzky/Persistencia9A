/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.modelo.dao.imp;

import hibernate.HibernateUtil;
import hibernate.modelo.Grupo;
import hibernate.modelo.dao.GrupoDao;
import java.util.ArrayList;
import javax.persistence.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

/**
 *
 * @author Pavka
 */
public class GrupoDaolmp implements GrupoDao{
    
    Query consulta;
    Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
    Transaction transaccion;

    @Override
    public boolean crearGrupo(Grupo instancia) {
        try {
            transaccion = sesion.beginTransaction();
            sesion.save(instancia);
            transaccion.commit();
            return true;
        } catch (Exception e) {
            transaccion.rollback();
            return false;
        }
    
    }

    @Override
    public boolean crearGrupo(Grupo instancia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Grupo> listarGrupo() {
        try {
            transaccion = sesion.beginTransaction();
            consulta = (Query) sesion.createQuery("FROM Grupo");
            return(ArrayList<Grupo>) consulta.list();           
        } catch (HibernateException e) {
            return null;
        }
    }

    @Override
    public boolean modificarGrupo(Integer idGrupo, String descripcion) {
        try {
            transaccion = sesion.beginTransaction();
            sesion.update(instancia);
            transaccion.commit();
            return true;
        } catch (HibernateException e) {
            transaccion.rollback();
            return false;
        }
    }

    @Override
    public boolean modificarGrupo(Grupo instancia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarGrupo(Integer idGrupo) {
        return false;
    
    }

    @Override
    public boolean eliminarGrupo(Grupo instancia) {
    try {
            transaccion = sesion.beginTransaction();
            sesion.delete(instancia);
            transaccion.commit();
            return true;
        } catch (HibernateException e) {
            transaccion.rollback();
            return false;
        }
    }

    @Override
    public Grupo buscarPorId(Integer idGroup) {
        try {
            transaccion = sesion.beginTransaction();
            
            Grupo objeto = (Grupo) sesion.get("hibernate.modelo.Grupo",idGroup);
            transaccion.commit();
            return objeto;
        } catch (HibernateException e) {
            transaccion.rollback();
            return null;
        }
    }

    @Override
    public ArrayList<Grupo> buscarPorcriterio(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Grupo> buscarPorcriterio(Grupo instancia) {
        try {
            transaccion = sesion.beginTransaction();
            ArrayList<Grupo> resultado = (ArrayList<Grupo>) sesion.createCriteria("hivernate.model.Grupo").add(Example.create(instancia)).list();
            transaccion.commit();
            return resultado;
        } catch (Exception e) {
            transaccion.rollback();
            return null;
        }
    
    }

    @Override
    public boolean crearGrupo(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

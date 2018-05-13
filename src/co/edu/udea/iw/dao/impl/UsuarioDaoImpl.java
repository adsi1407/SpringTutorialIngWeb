package co.edu.udea.iw.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.UsuarioDao;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.ClassException;

public class UsuarioDaoImpl extends HibernateDaoSupport implements UsuarioDao {

	@Override
	public Usuario insertar(Usuario usuario) throws ClassException {
		
		Transaction tx = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            tx = session.beginTransaction();
            session.save(usuario);
            tx.commit();
            
            
        }catch(HibernateException e){
            throw new ClassException(e);
        }finally{
            session.close();
        }
        
        return usuario;
	}

	@Override
	public Usuario actualizar(Usuario usuario) throws ClassException {
		
		Transaction tx = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            tx = session.beginTransaction();
            session.update(usuario);
            tx.commit();
            
            
        }catch(HibernateException e){
            throw new ClassException(e);
        }finally{
            session.close();
        }
        
        return usuario;
	}

	@Override
	public void eliminar(Usuario usuario) throws ClassException {
		
		Transaction tx = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
            
            tx = session.beginTransaction();
            session.delete(usuario);
            tx.commit();
            
		}catch(HibernateException e){
            throw new ClassException(e);
        }finally{
            session.close();
        }
	}

	@Override
	public List<Usuario> obtener() throws ClassException {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            Criteria criteria = session.createCriteria(Usuario.class);
            
            usuarios = criteria.list();
            
        }catch(HibernateException e){
            throw new ClassException(e);
        }finally{
        	session.close();
        }
        
        return usuarios;
	}

	@Override
	public Usuario obtenerUsuario(String login) throws ClassException {

		Usuario usuario = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            usuario = (Usuario)session.load(Usuario.class, login);
            
        }catch(HibernateException e){
            throw new ClassException(e);
        }finally{
            session.close();
        }
        
        return usuario;
	}

}

package co.edu.udea.iw.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.RolDao;
import co.edu.udea.iw.dto.Rol;
import co.edu.udea.iw.exception.ClassException;

public class RolDaoImpl extends HibernateDaoSupport implements RolDao {

	@Override
	public Rol insertar(Rol rol) throws ClassException {
		
		Transaction tx = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            tx = session.beginTransaction();
            session.save(rol);
            tx.commit();
            
            
        }catch(HibernateException e){
            throw new ClassException(e);
        }finally{
            session.close();
        }
        
        return rol;
	}

	@Override
	public Rol actualizar(Rol rol) throws ClassException {
		
		Transaction tx = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            tx = session.beginTransaction();
            session.update(rol);
            tx.commit();
            
            
        }catch(HibernateException e){
            throw new ClassException(e);
        }finally{
            session.close();
        }
        
        return rol;
	}

	@Override
	public void eliminar(Rol rol) throws ClassException {
		
		Transaction tx = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
            
            tx = session.beginTransaction();
            session.delete(rol);
            tx.commit();
            
		}catch(HibernateException e){
            throw new ClassException(e);
        }finally{
            session.close();
        }
	}

	@Override
	public List<Rol> obtener() throws ClassException {
		
		List<Rol> roles = new ArrayList<Rol>();
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            Criteria criteria = session.createCriteria(Rol.class);
            
            roles = criteria.list();
            
        }catch(HibernateException e){
            throw new ClassException(e);
        }finally{
        	session.close();
        }
        
        return roles;
	}

}

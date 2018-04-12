package co.edu.udea.iw.DAO.IMPL;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.DAO.CiudadDAO;
import co.edu.udea.iw.DTO.Ciudad;
import co.edu.udea.iw.EXCEPTION.ClassException;

public class CiudadDAOImpl extends HibernateDaoSupport implements CiudadDAO {

	@Override
	public void insertar(Ciudad ciudad) throws ClassException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Ciudad ciudad) throws ClassException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Ciudad ciudad) throws ClassException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ciudad> obtener() throws ClassException {
		
		List<Ciudad> ciudades = new ArrayList<Ciudad>();
		
		try {
			
			Session session = this.getSessionFactory().getCurrentSession();
			
			Criteria crit=session.createCriteria(Ciudad.class)
					.addOrder(Order.asc("nombre"));
			ciudades=crit.list();
		} catch (HibernateException e) {
			throw new ClassException();
		}

		return ciudades;
	}

}

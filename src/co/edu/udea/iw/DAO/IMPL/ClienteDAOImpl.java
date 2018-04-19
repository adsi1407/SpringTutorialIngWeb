package co.edu.udea.iw.DAO.IMPL;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.iw.DAO.ClienteDAO;
import co.edu.udea.iw.DTO.Cliente;
import co.edu.udea.iw.EXCEPTION.ClassException;

public class ClienteDAOImpl extends HibernateDaoSupport implements ClienteDAO {

	@Override
    public Cliente insertar(Cliente cliente) throws ClassException {
        
        Transaction tx = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            tx = session.beginTransaction();
            session.save(cliente);
            tx.commit();
            
            
        }catch(HibernateException e){
            throw new ClassException(e);
        }finally{
            session.close();
        }
        
        return cliente;
    }

    @Override
    public Cliente actualizar(Cliente cliente) throws ClassException {
        Transaction tx = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            tx = session.beginTransaction();
            session.update(cliente);
            tx.commit();
            
            
        }catch(HibernateException e){
            throw new ClassException(e);
        }finally{
            session.close();
        }
        
        return cliente;
    }

    @Override
    public void eliminar(Cliente cliente) throws ClassException {
        Transaction tx = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            tx = session.beginTransaction();
            cliente.setEliminado(true);
            cliente.setFechaEliminacion(new Date());
            session.update(cliente);
            tx.commit();
            
            
        }catch(HibernateException e){
            throw new ClassException(e);
        }finally{
            session.close();
        }
    }

    @Override
    public List<Cliente> obtener() throws ClassException {
        List<Cliente> clientes = new ArrayList<Cliente>();
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            Criteria criteria = session.createCriteria(Cliente.class);
            
            clientes = criteria.list();
            
        }catch(HibernateException e){
            throw new ClassException(e);
        }finally{
//          session.close();
        }
        
        return clientes;
    }

    @Override
    public Cliente obtener(String cedula) throws ClassException {
        Cliente cliente = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            cliente = (Cliente)session.load(Cliente.class, cedula);
            
        }catch(HibernateException e){
            throw new ClassException(e);
        }finally{
            session.close();
        }
        
        return cliente;
    }
}

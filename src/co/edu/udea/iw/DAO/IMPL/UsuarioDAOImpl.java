package co.edu.udea.iw.DAO.IMPL;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.DAO.UsuarioDAO;
import co.edu.udea.iw.DTO.Usuario;
import co.edu.udea.iw.EXCEPTION.ClassException;

public class UsuarioDAOImpl extends HibernateDaoSupport implements UsuarioDAO {

	@Override
	public void insertar(Usuario usuario) throws ClassException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Usuario usuario) throws ClassException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Usuario usuario) throws ClassException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> obtener() throws ClassException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario obtenerUsuario(String login) throws ClassException {
		// TODO Auto-generated method stub
		return null;
	}

}

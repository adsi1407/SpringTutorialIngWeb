package co.edu.udea.iw.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.UsuarioDao;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.ClassException;

public class UsuarioDaoImpl extends HibernateDaoSupport implements UsuarioDao {

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

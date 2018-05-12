package co.edu.udea.iw.bl.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.udea.iw.bl.UsuarioBl;
import co.edu.udea.iw.dao.UsuarioDao;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.encode.Cifrar;
import co.edu.udea.iw.exception.ClassException;
import co.edu.udea.iw.validations.Validaciones;

public class UsuarioBlImpl implements UsuarioBl {

	@Autowired
	UsuarioDao usuarioDao;
	
	@Override
	public Usuario autenticar(String login, String pws) throws ClassException {
		
		Usuario usuario = null;
		Cifrar cifrar = new Cifrar();
		Validaciones validaciones = new Validaciones();
		ArrayList<String> errors = validaciones.validarUsuario(usuario);
		
		if (errors.size() == 0) {
			usuario = usuarioDao.obtenerUsuario(login);
			if (usuario != null && usuario.getContrasena() == pws) {
				
			}
			return usuario;
		}
		else {
			throw new ClassException("Error de usuario o contraseña");
		}
		
	}

}

package co.edu.udea.iw.BL.IMPL;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.udea.iw.BL.UsuarioBL;
import co.edu.udea.iw.DAO.UsuarioDAO;
import co.edu.udea.iw.DTO.Usuario;
import co.edu.udea.iw.EXCEPTION.ClassException;
import co.edu.udea.iw.Encode.Cifrar;
import co.edu.udea.iw.Validations.Validaciones;

public class UsuarioBLImpl implements UsuarioBL {

	@Autowired
	UsuarioDAO usuarioDao;
	
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

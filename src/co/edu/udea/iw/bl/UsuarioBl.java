package co.edu.udea.iw.bl;

import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.ClassException;

public interface UsuarioBl {
	
	public Usuario autenticar(String login, String pws) throws ClassException;
}

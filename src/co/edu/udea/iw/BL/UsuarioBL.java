package co.edu.udea.iw.BL;

import co.edu.udea.iw.DTO.Usuario;
import co.edu.udea.iw.EXCEPTION.ClassException;

public interface UsuarioBL {
	
	public Usuario autenticar(String login, String pws) throws ClassException;
}

package co.edu.udea.iw.dao;

import java.util.List;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.ClassException;

public interface UsuarioDao {
	public Usuario insertar(Usuario usuario) throws ClassException;
	public Usuario actualizar(Usuario usuario) throws ClassException;
	public void eliminar(Usuario usuario) throws ClassException;
	public List<Usuario> obtener() throws ClassException;
	public Usuario obtenerUsuario(String login) throws ClassException;
}

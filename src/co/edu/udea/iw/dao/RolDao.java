package co.edu.udea.iw.dao;

import java.util.List;
import co.edu.udea.iw.dto.Rol;
import co.edu.udea.iw.exception.ClassException;

public interface RolDao {
	public void insertar(Rol rol) throws ClassException;
	public void actualizar(Rol rol) throws ClassException;
	public void eliminar(Rol rol) throws ClassException;
	public List<Rol> obtener() throws ClassException;

}

package co.edu.udea.iw.dao;

import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.ClassException;

import java.util.List;

public interface CiudadDao {

	public void insertar(Ciudad ciudad) throws ClassException;
	public void actualizar(Ciudad ciudad) throws ClassException;
	public void eliminar(Ciudad ciudad) throws ClassException;
	public List<Ciudad> obtener() throws ClassException;
	
}

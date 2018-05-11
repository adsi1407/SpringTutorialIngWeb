package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.ClassException;

public interface ClienteDao {

	public Cliente insertar(Cliente cliente) throws ClassException;
	public Cliente actualizar(Cliente cliente) throws ClassException;
	public void eliminar(Cliente cliente) throws ClassException;
	public Cliente obtener(String cedula) throws ClassException;
	public List<Cliente> obtener() throws ClassException;
}

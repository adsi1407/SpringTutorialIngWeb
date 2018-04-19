package co.edu.udea.iw.DAO;

import java.util.List;

import co.edu.udea.iw.DTO.Cliente;
import co.edu.udea.iw.EXCEPTION.ClassException;

public interface ClienteDAO {

	public Cliente insertar(Cliente cliente) throws ClassException;
	public Cliente actualizar(Cliente cliente) throws ClassException;
	public void eliminar(Cliente cliente) throws ClassException;
	public Cliente obtener(String cedula) throws ClassException;
	public List<Cliente> obtener() throws ClassException;
}

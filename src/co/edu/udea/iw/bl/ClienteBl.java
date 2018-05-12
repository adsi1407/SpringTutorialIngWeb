package co.edu.udea.iw.bl;

import java.util.List;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.ClassException;

public interface ClienteBl {
	
	public List<Cliente> obtener() throws ClassException;
	
	public Cliente insertar(Cliente cliente) throws ClassException;

}

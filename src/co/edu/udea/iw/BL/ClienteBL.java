package co.edu.udea.iw.BL;

import java.util.List;

import co.edu.udea.iw.DTO.Cliente;
import co.edu.udea.iw.EXCEPTION.ClassException;

public interface ClienteBL {
	
	public List<Cliente> obtener() throws ClassException;
	
	public Cliente insertar(Cliente cliente) throws ClassException;

}

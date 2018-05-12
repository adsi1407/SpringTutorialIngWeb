package co.edu.udea.iw.bl.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.udea.iw.bl.ClienteBl;
import co.edu.udea.iw.dao.ClienteDao;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.ClassException;
import co.edu.udea.iw.validations.Validaciones;

public class ClienteBlImpl implements ClienteBl {

	@Autowired
	ClienteDao clienteDao;
	
	@Override
	public List<Cliente> obtener() throws ClassException {
		
		return clienteDao.obtener();
	}

	@Override
	public Cliente insertar(Cliente cliente) throws ClassException {
		Validaciones validaciones = new Validaciones();
		
		ArrayList<String> errors = validaciones.validarCliente(cliente);
		
		if (errors.size() == 0) {
			return clienteDao.insertar(cliente);
		}
		else {
			throw new ClassException(errors.toString());
		}
	}

}

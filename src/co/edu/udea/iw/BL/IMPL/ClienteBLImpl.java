package co.edu.udea.iw.BL.IMPL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.udea.iw.BL.ClienteBL;
import co.edu.udea.iw.DAO.ClienteDAO;
import co.edu.udea.iw.DTO.Cliente;
import co.edu.udea.iw.EXCEPTION.ClassException;
import co.edu.udea.iw.Validations.Validaciones;

public class ClienteBLImpl implements ClienteBL {

	@Autowired
	ClienteDAO clienteDao;
	
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

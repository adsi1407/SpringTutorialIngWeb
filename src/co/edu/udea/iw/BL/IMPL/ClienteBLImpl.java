package co.edu.udea.iw.BL.IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.udea.iw.BL.ClienteBL;
import co.edu.udea.iw.DAO.ClienteDAO;
import co.edu.udea.iw.DTO.Cliente;
import co.edu.udea.iw.EXCEPTION.ClassException;

public class ClienteBLImpl implements ClienteBL {

	@Autowired
	ClienteDAO clienteDao;
	
	@Override
	public List<Cliente> obtener() throws ClassException {
		
		return clienteDao.obtener();
	}

}

package co.edu.udea.iw.dao.hibernate;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import co.edu.udea.iw.dao.ClienteDao;
import co.edu.udea.iw.dao.impl.ClienteDaoImpl;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.ClassException;

public class ClienteDaoHibernateTest {

	@Test
	public void insertar() {
		
		Usuario usuario = new Usuario();
		usuario.setLogin("elver");
		
		ClienteDao dao = null;
		Cliente cliente = new Cliente();
		cliente.setCedula("1234567890");
		cliente.setNombres("Cliente1");
		cliente.setApellidos("Apellido1");
		//cliente.setCorreoElectronico("andres.santacoloma@udea.edu.co");
		//cliente.setUsuarioCrea(usuario);
		cliente.setFechaCreacion(new Date());
		
		try {
			dao = new ClienteDaoImpl();
			dao.insertar(cliente);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	@Test
	public void testObtener() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		ClienteDao dao = null;
		
		try{
			dao = new ClienteDaoImpl();
			
			clientes = dao.obtener();
			
			for(Cliente cliente: clientes){
				System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
				System.out.println("Login: " + cliente.getCedula());
				System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
			}
			
			assertTrue(clientes.size()>0);
		}catch(ClassException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
}

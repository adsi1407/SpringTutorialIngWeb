package co.edu.udea.iw.dao.hibernate;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.iw.dao.ClienteDao;
import co.edu.udea.iw.dao.impl.ClienteDaoImpl;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.ClassException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:springConfig.xml")
@Transactional
public class ClienteDaoHibernateTest {

	@Autowired
	ClienteDao dao;
	
	@Test
	public void insertar() {
		
		Usuario usuario = new Usuario();
		usuario.setLogin("elver");
		
		Cliente cliente = new Cliente();
		cliente.setCedula("1234567890");
		cliente.setNombres("Cliente1");
		cliente.setApellidos("Apellido1");
		//cliente.setCorreoElectronico("andres.santacoloma@udea.edu.co");
		//cliente.setUsuarioCrea(usuario);
		cliente.setFechaCreacion(new Date());
		
		try {
			dao.insertar(cliente);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	@Test
	public void testObtener() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			
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

package co.edu.udea.iw.dao.hibernate;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.iw.dao.UsuarioDao;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.ClassException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:springConfig.xml")
@Transactional
public class UsuarioDaoHibernateTest {

	@Autowired
	UsuarioDao dao;
	
	@Test
	public void testObtener() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		try{			
			usuarios = dao.obtener();
			
			for(Usuario usuario: usuarios){
				System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
				System.out.println("Login: " + usuario.getLogin());
				System.out.println("Nombre: " + usuario.getNombres());
				System.out.println("Apellidos: " + usuario.getApellidos());
				System.out.println("Rol: " + usuario.getRol().getNombre());
				System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
			}
			
			assertTrue(usuarios.size()>0);
		}catch(ClassException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testObtenerString() {
		Usuario usuario = null;
		
		try{
			
			usuario = dao.obtenerUsuario("elver");
			
				System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
				System.out.println("Login: " + usuario.getLogin());
				System.out.println("Nombre: " + usuario.getNombres());
				System.out.println("Apellidos: " + usuario.getApellidos());
				System.out.println("Rol: " + usuario.getRol().getNombre());
				System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
			
			assertNotNull(usuario);
		}catch(ClassException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}

package test;

import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;
import modelo.UsuarioDAO;

public class UsuarioDAOTest {

	public static void main(String[] args) {
		UsuarioDAO allDataDao= new UsuarioDAO();
		List<Usuario> lista =new ArrayList<>();
		lista=allDataDao.listarUsuario();
		
		
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.getNombre());
		}

	}

}

package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.Conexion;



public class UsuarioDAO { 
	
	Connection conexion;
	
	public UsuarioDAO() {
			conexion = Conexion.getConnection();
	}
	
	public List<Usuario> listarUsuario(){
		
		
		PreparedStatement ps;
		ResultSet rs;
		
		List<Usuario> lista = new ArrayList<>();
		
		try {
			
			ps = conexion.prepareStatement("SELECT user_id, nombre, apellido, email"
					+ "	FROM public.usuario ");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int user_id = rs.getInt("user_id");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String email = rs.getString("email");
				
				Usuario  usuario = new Usuario(user_id, nombre, apellido, email);
				
				lista.add(usuario);
			}
			
			return lista;
			
		} catch (SQLException e ) {
			e.fillInStackTrace();
			return null;
		}
		
	}
	
	public int user_id(){
		
		
		PreparedStatement ps;
		ResultSet rs;
		int user_id=-1; 
		
		try {
			
			ps = conexion.prepareStatement("SELECT user_id FROM public.usuario");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				 user_id = rs.getInt("user_id");
			}
			
			return user_id;
			
		} catch (SQLException e ) {
			e.fillInStackTrace();
			return -1;
		}
		
	}
	

	public boolean insert(Usuario usuario){
		
		
		PreparedStatement ps;
		
		try {
			
			ps = conexion.prepareStatement("INSERT INTO public.usuario("
					+ "	 nombre, apellido, email)"
					+ "	VALUES ( ?,?,?);");
			
			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getApellido());
			ps.setString(3, usuario.getEmail());
			
			ps.execute();
			
			
			return true;
			
		} catch (SQLException e ) {
			e.fillInStackTrace();
			return false;
		}
		
	}
}

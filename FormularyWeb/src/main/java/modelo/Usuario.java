package modelo;

public class Usuario {
	
	
	private int user_id;
	private String nombre;
	private String apellido;
	private String email;
	
	
	
	
	
	
	
	
	
	
	public Usuario(int user_id, String nombre, String apellido, String email) {
	
		this.user_id = user_id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}




	public Usuario(String nombre, String apellido, String email) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	
	
	
	public int getUser_id() {
		return user_id;
	}




	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}




	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}

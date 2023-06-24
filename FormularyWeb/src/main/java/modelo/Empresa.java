package modelo;

public class Empresa {

	private int empresa_id;
	private int user_id;
	private String puesto;
	private int numero_trabajadores;
	private String tipo_empresa;
	
	
	
	
	
	public Empresa(int empresa_id, int user_id, String puesto, int numero_trabajadores, String tipo_empresa) {
		super();
		this.empresa_id = empresa_id;
		this.user_id = user_id;
		this.puesto = puesto;
		this.numero_trabajadores = numero_trabajadores;
		this.tipo_empresa = tipo_empresa;
	}
	
	
	

	public Empresa(int user_id, String puesto, int numero_trabajadores, String tipo_empresa) {
		super();
		this.user_id = user_id;
		this.puesto = puesto;
		this.numero_trabajadores = numero_trabajadores;
		this.tipo_empresa = tipo_empresa;
	}


	public Empresa(String puesto, int numero_trabajadores, String tipo_empresa) {
		super();
		this.puesto = puesto;
		this.numero_trabajadores = numero_trabajadores;
		this.tipo_empresa = tipo_empresa;
	}




	public int getEmpresa_id() {
		return empresa_id;
	}

	public void setEmpresa_id(int empresa_id) {
		this.empresa_id = empresa_id;
	}





	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getNumero_trabajadores() {
		return numero_trabajadores;
	}
	public void setNumero_trabajadores(int numero_trabajadores) {
		this.numero_trabajadores = numero_trabajadores;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getTipo_empresa() {
		return tipo_empresa;
	}
	public void setTipo_empresa(String tipo_empresa) {
		this.tipo_empresa = tipo_empresa;
	}
	
}

package modelo;

public class AllData {
	
	private Usuario usuario;
	private Empresa empresa;
	
	
	public AllData(Usuario usuario, Empresa empresa) {
		
		this.usuario = usuario;
		this.empresa = empresa;
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}

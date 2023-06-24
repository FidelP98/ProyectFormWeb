package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.Conexion;

public class EmpresaDAO {

	Connection conexion;
	
	public EmpresaDAO() {
		conexion =Conexion.getConnection();
	}
	
	public List<Empresa> listarEmpresa(){
		
		
		PreparedStatement ps;
		ResultSet rs;
		
		List<Empresa> lista =new ArrayList<>();
		
		try {
			
			ps = conexion.prepareStatement("SELECT empresa_id, user_id, puesto, numero_trabajadores, tipo_empresa"
					+ "	FROM public.empresa");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int empresa_id = rs.getInt("empresa_id");
				int user_id = rs.getInt("user_id ");
				String puesto = rs.getString("puesto");
				int numero_trabajadores = rs.getInt("numero_trabajadores");
				String tipo_empresa = rs.getString("tipo_empresa");
				
				Empresa empresa = new Empresa (empresa_id, user_id,puesto, numero_trabajadores,tipo_empresa);
			
			lista.add(empresa);
			
			
			}
			rs.close();
			ps.close();
			return lista;
		}catch (SQLException e ) {
			e.fillInStackTrace();
			return null;
		
		
	}

		}
	
	public boolean insert(Empresa empresa){
		
		PreparedStatement ps;
try {
			
			ps = conexion.prepareStatement("INSERT INTO public.empresa("
					+ "	 user_id, puesto, numero_trabajadores, tipo_empresa)"
					+ "	VALUES (?,?,?,?);");
			
			ps.setInt(1, empresa.getUser_id());
			ps.setString(2, empresa.getPuesto());
			ps.setInt(3, empresa.getNumero_trabajadores());
			ps.setString(4, empresa.getTipo_empresa());
			
			ps.execute();
			
			
			return true;
			
		} catch (SQLException e ) {
			e.fillInStackTrace();
			return false;
		}
		
	}
}



package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.Conexion;

public class AllDataDAO {
	
		
	
	Connection conexion;
	
	public AllDataDAO() {
		conexion =Conexion.getConnection();
	}
	
	public List<AllData> listarDatos(){
		 
		
		PreparedStatement ps;
		ResultSet rs;
		
		List<AllData> lista =new ArrayList<>();
		try {
			
			
			 ps=conexion.prepareStatement("SELECT * FROM public.alldata");
			
			
			 rs = ps.executeQuery();
			
			
			while(rs.next()) {
				
				
				
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String email = rs.getString("email");
				String puesto = rs.getString("puesto");
				int numero_trabajadores = rs.getInt("numero_trabajadores");
				String tipo_empresa = rs.getString("tipo_empresa");
				
				System.out.println("nombre: "+nombre+" apellido: "+apellido+" email: "+email);
				System.out.println("puesto: "+puesto+" numero_trabajadores: "+numero_trabajadores+" tipo_empresa: "+tipo_empresa);
				
				Usuario usuario= new Usuario(nombre, apellido, email);
				Empresa empresa= new Empresa( puesto, numero_trabajadores, tipo_empresa);

				AllData allData = new AllData(usuario,empresa);
	
				lista.add(allData);
			
			
			}
			
			rs.close();
			ps.close();
			return lista;
		}catch (SQLException e ) {
			e.fillInStackTrace();
			return null;
		
		
	}

		}
	

}

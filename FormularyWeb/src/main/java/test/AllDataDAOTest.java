package test;

import java.util.ArrayList;
import java.util.List;

import modelo.AllData;
import modelo.AllDataDAO;

public class AllDataDAOTest {

	public static void main(String[] args) {
		AllDataDAO allDataDao= new AllDataDAO();
		List<AllData> lista =new ArrayList<>();
		lista=allDataDao.listarDatos();
		
		if(lista!=null)
		
		for (AllData allData : lista) {
			
			System.out.println(allData.getUsuario().getNombre());
			System.out.println(allData.getUsuario().getApellido());
			System.out.println(allData.getUsuario().getEmail());
			System.out.println(allData.getEmpresa().getPuesto());
			System.out.println(allData.getEmpresa().getNumero_trabajadores());
			System.out.println(allData.getEmpresa().getTipo_empresa());
		} 
	}

}

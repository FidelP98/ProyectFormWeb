package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.AllData;
import modelo.AllDataDAO;
import modelo.Usuario;

/**
 * Servlet implementation class AllDataController
 */
@WebServlet("/AllDataController")
public class AllDataController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllDataController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		AllDataDAO allDataDao= new AllDataDAO();
		String accion;
		RequestDispatcher dispacher=null;
		accion = request.getParameter("accion");
		if(accion==null || accion.isEmpty()) {
			
			dispacher = request.getRequestDispatcher("tabla.jsp");
			
			List<AllData> listaAllData = allDataDao.listarDatos();
			
			//ArrayList<String> data = new  ArrayList<String>();

			
			/*for (AllData allData : listaAllData) {
				
				allData.getEmpresa().getPuesto();
				allData.getEmpresa().getNumero_trabajadores();
				allData.getEmpresa().getTipo_empresa();
				
			}*/
			System.out.println("xxxx"+listaAllData.get(0).getUsuario().getNombre());
			
			
			
			ArrayList<Usuario> data = new  ArrayList<Usuario>();
			 data.add(new Usuario("Ramesh", "Fadatare", "steakler@gamil.com"));
			 data.add(new Usuario("John", "Cena", "steakler@gamil.com"));
			 data.add(new Usuario("Tom", "Cruise", "steakler@gamil.com"));
			 data.add(new Usuario("Tony", "Stark", "steakler@gamil.com"));
			 data.add(new Usuario("Prakash", "Jadhav", "steakler@gamil.com"));
			 request.setAttribute("usuarios", data);
			
			//request.setAttribute("data", listaAllData);
		
		}
		//dispacher= request.getRequestDispatcher("tabla.jsp");
		 
		dispacher.forward(request, response);
		//dispacher.forward(request, response);
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

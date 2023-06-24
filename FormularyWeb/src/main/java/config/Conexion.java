package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	
	//  private static Conexion instance;
	    private static Connection connection;

	    private Conexion() {
	    	
	        // Configurar la conexión a la base de datos
	        String url = "jdbc:postgresql://192.168.100.167:5432/Formweb";
	        String username = "postgres";
	        String password = "admin2023";

	        try {
	        	  Class.forName("org.postgresql.Driver");
	            connection = DriverManager.getConnection(url, username, password);
	            
	            System.out.println("Conexion garantizada");
	        } catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }

	 /*   public static synchronized Conexion getInstance() {
	        if (instance == null) {
	            instance = new Conexion();
	        }
	        return instance;
	    }*/

	    public static Connection getConnection() {
	    	if (connection == null) {
				new Conexion();
			}

	        return connection;
	    }
}

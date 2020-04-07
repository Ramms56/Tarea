package utils;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BdConexion {
	
	public static Connection getConexion(){
		Connection con = null;
		
		try {
			
	    Class.forName("com.mysql.jdbc.Driver");
	    String url = "jdbc:mysql://localhost:3309/eva";
	    String usr = "root";
	    String pwd = "root";
	    
	    con = DriverManager.getConnection(url,usr,pwd);
		} catch (ClassNotFoundException e) {
			System.out.println("errorr >> driver no instalado");
			
		} catch (SQLException e) {
			System.out.println("error >> en la conexion de la BD");
		}
		return con;
	}

}

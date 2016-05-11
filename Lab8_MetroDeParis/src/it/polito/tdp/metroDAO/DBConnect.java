package it.polito.tdp.metroDAO;
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

public class DBConnect {
	
		private static String jdbcURL= "jdbc:mysql://localhost/metroparis?user=root&password=";
		private static Connection connection = null;
		public static Connection getConnection (){
			try {
			if (connection==null){
				
					connection=DriverManager.getConnection(jdbcURL);
				} 
				
			
			return connection;
		
		}catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Cannot get connection"+jdbcURL,e);
	}
	}
	}
package it.polito.tdp.metroDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class fermata {
  
	public List<String> getFermate(){
		final String sql= "SELECT nome FROM `linea`";
		List <Fermata> fermate = new LinkedList <Fermata>();
		try {
		Connection conn = DBConnect.getConnection();
		PreparedStatement st= conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			String p = new String ( );
            fermate.add( p);
		}
		return fermate;
	} catch (SQLException e){
		throw new RuntimeException("Errore DB");
	}
	
}}

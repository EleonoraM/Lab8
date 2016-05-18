package it.polito.tdp.metroDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import it.polito.metroModel.ConnessioneM;
import it.polito.metroModel.FermataM;
import it.polito.metroModel.LineaM;


public class MetroParisDAO {
  
	public List<FermataM> getFermate(){
		final String sql= "SELECT * FROM `linea`";
		List <FermataM> fermate = new LinkedList <FermataM>();
		try {
		Connection conn = DBConnect.getConnection();
		PreparedStatement st= conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			FermataM p = new FermataM ( );
            fermate.add( p);
		}
		return fermate;
	} catch (SQLException e){
		throw new RuntimeException("Errore DB");
	}
	
}
	public List<LineaM> getLinee(){
		final String sql= "SELECT nome FROM `linea`";
		List <LineaM> linee = new LinkedList <LineaM>();
		try {
		Connection conn = DBConnect.getConnection();
		PreparedStatement st= conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			LineaM p = new LineaM ( );
            linee.add( p);
		}
		return linee;
	} catch (SQLException e){
		throw new RuntimeException("Errore DB");
	}
	
}public List<ConnessioneM> getConnessione(){
	final String sql= "SELECT nome FROM `linea`";
	List <ConnessioneM> connessione = new LinkedList <ConnessioneM>();
	try {
	Connection conn = DBConnect.getConnection();
	PreparedStatement st= conn.prepareStatement(sql);
	ResultSet rs = st.executeQuery();
	while(rs.next()){
		ConnessioneM p = new ConnessioneM ( );
        connessione.add( p);
	}
	return connessione;
} catch (SQLException e){
	throw new RuntimeException("Errore DB");
}

}	










}

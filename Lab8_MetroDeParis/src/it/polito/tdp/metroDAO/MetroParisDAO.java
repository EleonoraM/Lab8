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
		final String sql= "SELECT id_Fermata, nome, coordX, coodY FROM linea ORDER BY nome ASC";
		List <FermataM> fermate = new LinkedList <FermataM>();
		try {
		Connection conn = DBConnect.getConnection();
		PreparedStatement st= conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			FermataM p = new FermataM (rs.getInt("id_fermata"),rs.getString("nome"),rs.getDouble("coordX"),rs.getDouble("coordY") );
            fermate.add( p);
		}
		return fermate;
	} catch (SQLException e){
		throw new RuntimeException("Errore DB");
	}
	
}
	public List<LineaM> getLinee(){
		final String sql= "SELECT id_linea, nome, velocita, intervallo,colore FROM linea ORDER BY nome ASC ";
		List <LineaM> linee = new LinkedList <LineaM>();
		try {
		Connection conn = DBConnect.getConnection();
		PreparedStatement st= conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			LineaM p = new LineaM (rs.getInt("id_linea"), rs.getString("nome"),rs.getDouble("velocita"),rs.getDouble("intervallo"),rs.getString("colore") );
            linee.add( p);
		}
		return linee;
	} catch (SQLException e){
		throw new RuntimeException("Errore DB");
	}
	
}public List<ConnessioneM> getConnessione(List<FermataM> fermate, List<LineaM> linee){
	final String sql= "SELECT id_connessione, id_linea, id_stazP, id_stazA FROM connessione";
	List <ConnessioneM> connessioni = new LinkedList <ConnessioneM>();
	try {
	Connection conn = DBConnect.getConnection();
	PreparedStatement st= conn.prepareStatement(sql);
	ResultSet rs = st.executeQuery();
	while(rs.next()){

		int idLinea = rs.getInt("id_linea");
		int idStazP = rs.getInt("id_stazP");
		int idStazA = rs.getInt("id_stazA");

		LineaM myLinea = linee.get(linee.indexOf(new LineaM(idLinea)));
		FermataM myStazP = fermate.get(fermate.indexOf(new FermataM(idStazP)));
		FermataM myStazA = fermate.get(fermate.indexOf(new FermataM(idStazA)));

		ConnessioneM cnx = new ConnessioneM(rs.getInt("id_connessione"), myLinea, myStazP, myStazA);

		connessioni.add(cnx);

	}
	return connessioni;
} catch (SQLException e){
	throw new RuntimeException("Errore DB");
}

}	










}

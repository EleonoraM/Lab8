package it.polito.metroModel;

public class ConnessioneM {

	
	private int id_connessione;
	private int id_linea;
	private int id_StazP;
	private int id_StazA;
	public int getId_connessione() {
		return id_connessione;
	}
	public void setId_connessione(int id_connessione) {
		this.id_connessione = id_connessione;
	}
	public int getId_linea() {
		return id_linea;
	}
	public void setId_linea(int id_linea) {
		this.id_linea = id_linea;
	}
	public int getId_StazP() {
		return id_StazP;
	}
	public void setId_StazP(int id_StazP) {
		this.id_StazP = id_StazP;
	}
	public int getId_StazA() {
		return id_StazA;
	}
	public void setId_StazA(int id_StazA) {
		this.id_StazA = id_StazA;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_StazA;
		result = prime * result + id_StazP;
		result = prime * result + id_connessione;
		result = prime * result + id_linea;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConnessioneM other = (ConnessioneM) obj;
		if (id_StazA != other.id_StazA)
			return false;
		if (id_StazP != other.id_StazP)
			return false;
		if (id_connessione != other.id_connessione)
			return false;
		if (id_linea != other.id_linea)
			return false;
		return true;
	}
	public ConnessioneM(int id_connessione, int id_linea, int id_StazP, int id_StazA) {
		this.id_connessione = id_connessione;
		this.id_linea = id_linea;
		this.id_StazP = id_StazP;
		this.id_StazA = id_StazA;
	}

	
	
	
}

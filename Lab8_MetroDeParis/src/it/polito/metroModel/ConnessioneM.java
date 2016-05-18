package it.polito.metroModel;

public class ConnessioneM {

	
	private int id_connessione;
	private LineaM id_linea;
	private FermataM id_StazP;
	private FermataM id_StazA;
	
	
	public int getId_connessione() {
		return id_connessione;
	}
	public void setId_connessione(int id_connessione) {
		this.id_connessione = id_connessione;
	}
	public LineaM getId_linea() {
		return id_linea;
	}
	public void setId_linea(LineaM id_linea) {
		this.id_linea = id_linea;
	}
	public FermataM getId_StazP() {
		return id_StazP;
	}
	public void setId_StazP(FermataM id_StazP) {
		this.id_StazP = id_StazP;
	}
	public FermataM getId_StazA() {
		return id_StazA;
	}
	public void setId_StazA(FermataM id_StazA) {
		this.id_StazA = id_StazA;
	}
	public ConnessioneM(int id_connessione, LineaM id_linea, FermataM id_StazP, FermataM id_StazA) {
		super();
		this.id_connessione = id_connessione;
		this.id_linea = id_linea;
		this.id_StazP = id_StazP;
		this.id_StazA = id_StazA;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_StazA == null) ? 0 : id_StazA.hashCode());
		result = prime * result + ((id_StazP == null) ? 0 : id_StazP.hashCode());
		result = prime * result + id_connessione;
		result = prime * result + ((id_linea == null) ? 0 : id_linea.hashCode());
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
		if (id_StazA == null) {
			if (other.id_StazA != null)
				return false;
		} else if (!id_StazA.equals(other.id_StazA))
			return false;
		if (id_StazP == null) {
			if (other.id_StazP != null)
				return false;
		} else if (!id_StazP.equals(other.id_StazP))
			return false;
		if (id_connessione != other.id_connessione)
			return false;
		if (id_linea == null) {
			if (other.id_linea != null)
				return false;
		} else if (!id_linea.equals(other.id_linea))
			return false;
		return true;
	}

	
}

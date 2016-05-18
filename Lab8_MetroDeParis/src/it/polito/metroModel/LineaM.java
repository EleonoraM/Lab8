package it.polito.metroModel;

public class LineaM {

	private int id_linea;
	private String nomeL;
	private double velocita;
	private double intervallo;
	private String colore;
	public int getId_linea() {
		return id_linea;
	}
	public void setId_linea(int id_linea) {
		this.id_linea = id_linea;
	}
	public String getNomeL() {
		return nomeL;
	}
	public void setNomeL(String nomeL) {
		this.nomeL = nomeL;
	}
	public double getVelocita() {
		return velocita;
	}
	public void setVelocita(double velocita) {
		this.velocita = velocita;
	}
	public double getIntervallo() {
		return intervallo;
	}
	public void setIntervallo(double intervallo) {
		this.intervallo = intervallo;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colore == null) ? 0 : colore.hashCode());
		result = prime * result + id_linea;
		long temp;
		temp = Double.doubleToLongBits(intervallo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nomeL == null) ? 0 : nomeL.hashCode());
		temp = Double.doubleToLongBits(velocita);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		LineaM other = (LineaM) obj;
		if (colore == null) {
			if (other.colore != null)
				return false;
		} else if (!colore.equals(other.colore))
			return false;
		if (id_linea != other.id_linea)
			return false;
		if (Double.doubleToLongBits(intervallo) != Double.doubleToLongBits(other.intervallo))
			return false;
		if (nomeL == null) {
			if (other.nomeL != null)
				return false;
		} else if (!nomeL.equals(other.nomeL))
			return false;
		if (Double.doubleToLongBits(velocita) != Double.doubleToLongBits(other.velocita))
			return false;
		return true;
	}
	public LineaM(int id_linea, String nomeL, double velocita, double intervallo, String colore) {
		this.id_linea = id_linea;
		this.nomeL = nomeL;
		this.velocita = velocita;
		this.intervallo = intervallo;
		this.colore = colore;
	}
	
	
	
	
	
	
	
}

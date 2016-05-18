package it.polito.metroModel;


public class FermataM {

	private int id_fermata;
	private String nome;
	private double cordX;
	private double cordY;
	
	
	
	
	
	
	
	public FermataM(int id_fermata, String nome, double cordX, double cordY) {
		this.id_fermata = id_fermata;
		this.nome = nome;
		this.cordX = cordX;
		this.cordY = cordY;
	}
	public int getId_fermata() {
		return id_fermata;
	}
	public void setId_fermata(int id_fermata) {
		this.id_fermata = id_fermata;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCordX() {
		return cordX;
	}
	public void setCordX(double cordX) {
		this.cordX = cordX;
	}
	public double getCordY() {
		return cordY;
	}
	public void setCordY(double cordY) {
		this.cordY = cordY;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cordX);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cordY);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id_fermata;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		FermataM other = (FermataM) obj;
		if (Double.doubleToLongBits(cordX) != Double.doubleToLongBits(other.cordX))
			return false;
		if (Double.doubleToLongBits(cordY) != Double.doubleToLongBits(other.cordY))
			return false;
		if (id_fermata != other.id_fermata)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	

	
}

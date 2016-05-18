package it.polito.metroModel;

import java.util.List;

import org.jgrapht.Graphs;
import org.jgrapht.WeightedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.metroDAO.MetroParisDAO;

public class MetroModel {
	
	private List <FermataM> fermate;
	private List <ConnessioneM> connessioni;
	private List <LineaM> linee;
	private SimpleWeightedGraph<FermataM, DefaultWeightedEdge> grafo = null;

	private MetroParisDAO metroDAO;
	
	public void Model (){
		metroDAO = new MetroParisDAO();
	}
	
	public List<FermataM> getStazioni (){
		if ( fermate ==null)
			throw new RuntimeException("Lista delle stazioni non disponibile!");

		return fermate;
	}
	
	public void generaGrafo (){
		connessioni = metroDAO.getConnessione();
		fermate = metroDAO.getFermate();
		grafo = new SimpleWeightedGraph<FermataM, DefaultWeightedEdge>( DefaultWeightedEdge.class);
		
		Graphs.addAllVertices(grafo, fermate);


		for ( FermataM f : fermate){
		double velocita= f
		double distanza 
		double tempo
		}
	}
}

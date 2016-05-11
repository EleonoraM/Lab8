package it.polito.metroModel;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.metroDAO.fermata;

public class fermateModel {

	private List <String> fermate = new LinkedList<String>();
	
	public List <String> getFermate() {
		fermate.addAll(fermata.getFermate());
	}
}

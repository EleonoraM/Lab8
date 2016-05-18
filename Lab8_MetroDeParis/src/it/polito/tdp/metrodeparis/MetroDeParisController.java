package it.polito.tdp.metrodeparis;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.metroModel.MetroModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class MetroDeParisController {

	private MetroModel model;

	public void setModel (MetroModel model){
		this.model= model;
	}
	
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> comboPartenza;

    @FXML
    private ComboBox<String> comboArrivo;

    @FXML
    private TextArea txtPercorosoTempo;

    @FXML
    void doCalcolaPercorso(ActionEvent event) {

    	String partenza = comboPartenza.getValue();
		String arrivo=comboArrivo.getValue();
    	
		
		//MetroModel.calcolaPercorso ( partenza,arrivo);
		
    }

    @FXML
    void initialize() {
    	
    	comboPartenza.getItems().addAll(model.getStazioni().toString());
    	comboArrivo.getItems().addAll(model.getStazioni().toString());

        assert comboPartenza != null : "fx:id=\"comboPartenza\" was not injected: check your FXML file 'MetroDeParis.fxml'.";
        assert comboArrivo != null : "fx:id=\"comboArrivo\" was not injected: check your FXML file 'MetroDeParis.fxml'.";
        assert txtPercorosoTempo != null : "fx:id=\"txtPercorosoTempo\" was not injected: check your FXML file 'MetroDeParis.fxml'.";

    }
}

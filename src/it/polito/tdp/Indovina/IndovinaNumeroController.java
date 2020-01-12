package it.polito.tdp.Indovina;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class IndovinaNumeroController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<Integer> comboBox;

    @FXML
    private Button btnGioca;

    @FXML
    private Label txtResult;

    @FXML
    private TextField txtInserito;

    @FXML
    private Button btnProva;

    @FXML
    private Label txtTentativi;
 public String text;
 int numero;
 int tentativi =0;
 int NumeroSegreto =0;
    @FXML
    private ProgressBar progressBar;

    @FXML
    void doGioca(ActionEvent event) {
    	if(comboBox.getValue()== null)
                  return;
    	else
    	{int value = comboBox.getValue();
    		if (value==10)
    		{
    			NumeroSegreto = 5;
    		}
    	}
    }

 

	@FXML
    void doProva(ActionEvent event) {
try{
numero = Integer.parseInt(txtInserito.getText());
tentativi++;

    
}
catch(NumberFormatException e)
{
	txtResult.setText("Inserisci numero");
	
}
if(tentativi>10)
	txtTentativi.setText("Hai Perso");
else
{txtTentativi.setText(String.valueOf(tentativi));

if (NumeroSegreto == numero)
	txtTentativi.setText("Hai Vinto");
}	}
    @FXML
    void initialize() {
        assert comboBox != null : "fx:id=\"comboBox\" was not injected: check your FXML file 'IndovinaNumero.fxml'.";
        assert btnGioca != null : "fx:id=\"btnGioca\" was not injected: check your FXML file 'IndovinaNumero.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'IndovinaNumero.fxml'.";
        assert txtInserito != null : "fx:id=\"txtInserito\" was not injected: check your FXML file 'IndovinaNumero.fxml'.";
        assert btnProva != null : "fx:id=\"btnProva\" was not injected: check your FXML file 'IndovinaNumero.fxml'.";
        assert txtTentativi != null : "fx:id=\"txtTentativi\" was not injected: check your FXML file 'IndovinaNumero.fxml'.";
        assert progressBar != null : "fx:id=\"progressBar\" was not injected: check your FXML file 'IndovinaNumero.fxml'.";
        comboBox.getItems().addAll(10,100,1000);
        if(comboBox.getItems().size()>0)
        comboBox.setValue(comboBox.getItems().get(0));
    
    }
}

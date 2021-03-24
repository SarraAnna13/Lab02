/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	 AlienDictionary a= new AlienDictionary();
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtparola"
    private TextField txtparola; // Value injected by FXMLLoader

    @FXML // fx:id="txtresult"
    private TextArea txtresult; // Value injected by FXMLLoader

    @FXML
    void doReset(ActionEvent event) {
    a.getParole().clear();
    txtresult.setText("");
    }

    @FXML
    void doTraslate(ActionEvent event) {
    String ParolaAlienaCase= txtparola.getText();
    
    if(Pattern.matches("[a-zA-Z]", ParolaAlienaCase)) {	txtresult.setText("Inserire parola di sole lettere\n");
    											 return;}
    String ParolaAliena= ParolaAlienaCase.toLowerCase();
    if(ParolaAliena.contains(" ")) {String[] parole= ParolaAliena.split(" ");
    							   String aliena= parole[0];
    							   String ita= parole[1];
    							   a.addWord(aliena, ita);
    							   txtresult.setText(a.toString());
    							   }
    else {String traduzione= a.translateWord(ParolaAliena);
    	  if(traduzione==null) txtresult.setText("Parola non presente in vocabolario\n");
    	  else txtresult.setText(traduzione+"\n");
         }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtparola != null : "fx:id=\"txtparola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtresult != null : "fx:id=\"txtresult\" was not injected: check your FXML file 'Scene.fxml'.";
        
    }
    
}

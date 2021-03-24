/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

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

    }

    @FXML
    void doTraslate(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtparola != null : "fx:id=\"txtparola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtresult != null : "fx:id=\"txtresult\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}

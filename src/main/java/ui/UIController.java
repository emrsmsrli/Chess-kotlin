/**
 * Sample Skeleton for 'Main.fxml' Controller Class
 */

package ui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class UIController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="resignButton"
    private Button resignButton; // Value injected by FXMLLoader

    @FXML // fx:id="clearButton"
    private Button clearButton; // Value injected by FXMLLoader

    @FXML // fx:id="parseButton"
    private Button parseButton; // Value injected by FXMLLoader

    @FXML // fx:id="saveButton"
    private Button saveButton; // Value injected by FXMLLoader

    @FXML // fx:id="castCheckBox"
    private Tooltip castCheckBox; // Value injected by FXMLLoader

    @FXML // fx:id="boardPane"
    private GridPane boardPane; // Value injected by FXMLLoader

  /*  @FXML
    void (ActionEvent event) {

    }*/

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert resignButton != null : "fx:id=\"resignButton\" was not injected: check your FXML file 'Main.fxml'.";
        assert clearButton != null : "fx:id=\"clearButton\" was not injected: check your FXML file 'Main.fxml'.";
        assert parseButton != null : "fx:id=\"parseButton\" was not injected: check your FXML file 'Main.fxml'.";
        assert saveButton != null : "fx:id=\"saveButton\" was not injected: check your FXML file 'Main.fxml'.";
        assert castCheckBox != null : "fx:id=\"castCheckBox\" was not injected: check your FXML file 'Main.fxml'.";
        assert boardPane != null : "fx:id=\"boardPane\" was not injected: check your FXML file 'Main.fxml'.";
        List<Node> chessBoard = boardPane.getChildren();
        for(Node c: chessBoard){
        	ImageView cell = (ImageView)c;
        	cell.setImage(null);
        }

    }
}

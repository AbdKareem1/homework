/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sword
 */
public class CurrencyConversionController implements Initializable {

    @FXML
    private TextField usdTxt;
    @FXML
    private TextField NISBtn;
    @FXML
    private ViewManager viewManager;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
        private void logOutBtn(ActionEvent event) {
            viewManager.showLoginPage();
        }

    @FXML
    private void convertBtn(ActionEvent event) {
            if (!usdTxt.getText().isEmpty() && NISBtn.getText().isEmpty()) {
        double usdValue = Double.parseDouble(usdTxt.getText());
        double nisValue = usdValue * 3.29; // conversion rate from USD to NIS
        NISBtn.setText(Double.toString(nisValue));
    } else if (usdTxt.getText().isEmpty() && !NISBtn.getText().isEmpty()) {
        double nisValue = Double.parseDouble(NISBtn.getText());
        double usdValue = nisValue / 3.29; // conversion rate from NIS to USD
        usdTxt.setText(Double.toString(usdValue));
    } else {
        // show an error message if both text fields are empty or if both text fields have data
        Alert alert = new Alert(AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setContentText("Please fill only one of the fields.");
        alert.showAndWait();
    }
    }
        public void setViewManager(ViewManager viewManager) {
        this.viewManager = viewManager;
    }
    
}

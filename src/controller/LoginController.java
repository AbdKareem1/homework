/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sword
 */
public class LoginController implements Initializable {

    @FXML
    private TextField userNameTxt;
    @FXML
    private TextField passwordTxt;
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
    private void loginBtn(ActionEvent event) throws IOException {
            String username = userNameTxt.getText();
            String password = passwordTxt.getText();

    // check if username and password are valid
    if (isValidLogin(username, password)) {
        viewManager.showCurrencyConversionPage();
    } else {
        Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid username or password");
        alert.showAndWait();
    }

    }
    public void setViewManager(ViewManager viewManager) {
        this.viewManager = viewManager;
    }
    private boolean isValidLogin(String username, String password) {
        String user ="abd";
        String userpass = "123456";
    // check if username and password are valid
    return username.equals(user) && password.equals(userpass);
}
    
}

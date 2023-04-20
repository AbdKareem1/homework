/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package javafxapplication15;

import controller.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Sword
 */
public class JavaFXApplication15 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        ViewManager viewManager = new ViewManager(stage);
        viewManager.showLoginPage();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

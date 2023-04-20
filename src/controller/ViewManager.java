/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author hp
 */
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewManager {
    
    private static final String LOGIN_PAGE_FXML = "LoginPage.fxml";
    private static final String CURRENCY_CONVERSION_PAGE_FXML = "CurrencyConversionPage.fxml";

    private Stage primaryStage;

    public ViewManager(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void showLoginPage() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(LOGIN_PAGE_FXML));
            Parent root = loader.load();
            LoginController controller = loader.getController();
            controller.setViewManager(this);

            Scene scene = new Scene(root, 600, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showCurrencyConversionPage() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(CURRENCY_CONVERSION_PAGE_FXML));
            Parent root = loader.load();
            CurrencyConversionController controller = loader.getController();
            controller.setViewManager(this);

            Scene scene = new Scene(root,600 ,800 );
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

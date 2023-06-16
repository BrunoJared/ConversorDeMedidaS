package com.convermedi.sistema.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    
    public void start(Stage primaryStage) {
        try {
        	FXMLLoader loader = new FXMLLoader();
        	loader.setLocation(getClass().getClassLoader().getResource("menuPrincipal.fxml"));
            VBox root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Conversor de Medidas");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
    	System.out.println("Running");
        launch(args);
    }
}

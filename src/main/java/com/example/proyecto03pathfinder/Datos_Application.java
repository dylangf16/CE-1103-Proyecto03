package com.example.proyecto03pathfinder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Datos_Application extends Application {

    /**
     * Inicia la ventana de ayuda al usuario
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Mapa_Application.class.getResource("Datos.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1100, 730);
        stage.setTitle("Porahí-Datos");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
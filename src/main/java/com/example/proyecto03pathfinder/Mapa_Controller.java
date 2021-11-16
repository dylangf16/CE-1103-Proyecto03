/**
 * Sample Skeleton for 'Mapa.fxml' Controller Class
 */

package com.example.proyecto03pathfinder;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class Mapa_Controller {

    @FXML // fx:id="D"
    private Circle D; // Value injected by FXMLLoader

    @FXML // fx:id="C"
    private Circle C; // Value injected by FXMLLoader

    @FXML // fx:id="B"
    private Circle B; // Value injected by FXMLLoader

    @FXML // fx:id="A"
    private Circle A; // Value injected by FXMLLoader

    @FXML // fx:id="F"
    private Circle F; // Value injected by FXMLLoader

    @FXML // fx:id="E"
    private Circle E; // Value injected by FXMLLoader

    @FXML // fx:id="J"
    private Circle J; // Value injected by FXMLLoader

    @FXML // fx:id="I"
    private Circle I; // Value injected by FXMLLoader

    @FXML // fx:id="H"
    private Circle H; // Value injected by FXMLLoader

    @FXML // fx:id="G"
    private Circle G; // Value injected by FXMLLoader

    @FXML // fx:id="K"
    private Circle K; // Value injected by FXMLLoader

    @FXML // fx:id="L"
    private Circle L; // Value injected by FXMLLoader

    @FXML // fx:id="M"
    private Circle M; // Value injected by FXMLLoader

    @FXML // fx:id="N"
    private Circle N; // Value injected by FXMLLoader

    @FXML // fx:id="Ñ"
    private Circle Ñ; // Value injected by FXMLLoader

    @FXML // fx:id="O"
    private Circle O; // Value injected by FXMLLoader

    @FXML // fx:id="P"
    private Circle P; // Value injected by FXMLLoader

    @FXML // fx:id="Q"
    private Circle Q; // Value injected by FXMLLoader

    @FXML // fx:id="AB"
    private Text AB; // Value injected by FXMLLoader

    @FXML // fx:id="Error"
    private Text Error; // Value injected by FXMLLoader

    @FXML
    void Enviar(MouseEvent event) {
        Error.setText("Hola!");
    }

}

module com.example.proyecto03pathfinder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyecto03pathfinder to javafx.fxml;
    exports com.example.proyecto03pathfinder;
}
module com.example.proyecto03pathfinder {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;


    opens com.example.proyecto03pathfinder to javafx.fxml;
    exports com.example.proyecto03pathfinder;
}
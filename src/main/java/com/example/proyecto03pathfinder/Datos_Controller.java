/**
 * Sample Skeleton for 'Datos.fxml' Controller Class
 */

package com.example.proyecto03pathfinder;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Predicate;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;

public class Datos_Controller implements Initializable {

    @FXML
    private TextField search;
    @FXML
    private TableView<Std> tbl;
    @FXML
    private TableColumn<Std,String> col_name;
    @FXML
    private TableColumn<Std,String> col_people;
    @FXML
    private TableColumn<Std,String> col_intPlace;
    @FXML
    private TableColumn<Std,String> col_foodPlace;
    @FXML
    private TableColumn<Std,String> col_gasPlace;

    ObservableList list = FXCollections.observableArrayList(
            new Std("Lugar1", "12", "jardin", "pizza", "bomba"),
            new Std("Lugar2", "120", "mall", "tacos", "estacion"),
            new Std("Lugar3", "34", "plaza", "burger", "gasolina")

    );

    FilteredList filter = new FilteredList(list, e->true);


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        col_name.setCellValueFactory(new PropertyValueFactory<>("Lugar"));
        col_people.setCellValueFactory(new PropertyValueFactory<>("Habitantes"));
        col_intPlace.setCellValueFactory(new PropertyValueFactory<>("Lugares de interes"));
        col_foodPlace.setCellValueFactory(new PropertyValueFactory<>("Lugares de comida"));
        col_gasPlace.setCellValueFactory(new PropertyValueFactory<>("Gasolineras"));

        tbl.setItems(list);
    }

    @FXML
    private void search(KeyEvent event){

        search.textProperty().addListener((observableValue, oldValue, newValue) -> {

            filter.setPredicate((Predicate<? super Std>) (Std std)-> {
                if (newValue.isEmpty() || newValue == null){
                    return true;
                }else if (std.getName().contains(newValue)){
                    return true;
                }

                return false;
            });
        });

        SortedList sort = new SortedList(filter);
        sort.comparatorProperty().bind(tbl.comparatorProperty());
        tbl.setItems(sort);

    }

    }

    class Std{

        SimpleStringProperty name;
        SimpleStringProperty people;
        SimpleStringProperty intPlace;
        SimpleStringProperty foodPlace;
        SimpleStringProperty gasPlace;

        public String getName() {
            return name.get();
        }


        public String getPeople() {
            return people.get();
        }


        public String getIntPlace() {
            return intPlace.get();
        }

        public String getFoodPlace() {
            return foodPlace.get();
        }

        public String getGasPlace() {
            return gasPlace.get();
        }


        public Std(String name, String people, String intPlace, String foodPlace, String gasPlace){
            this.name = new SimpleStringProperty(name);
            this.people = new SimpleStringProperty(people);
            this.intPlace = new SimpleStringProperty(intPlace);
            this.foodPlace = new SimpleStringProperty(foodPlace);
            this.gasPlace = new SimpleStringProperty(gasPlace);
        }

}

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
    private TableView<Plc> tbl;
    @FXML
    private TableColumn<Plc,String> col_name;
    @FXML
    private TableColumn<Plc,String> col_people;
    @FXML
    private TableColumn<Plc,String> col_intPlace;
    @FXML
    private TableColumn<Plc,String> col_foodPlace;
    @FXML
    private TableColumn<Plc,String> col_gasPlace;

    LinkedList places = SortPlaces.sortNodes();


    ObservableList list = FXCollections.observableArrayList(
            new Plc(places.findPlace(0).Lugar, places.findPlace(0).Habitantes, places.findPlace(0).L_interes, places.findPlace(0).L_comida, places.findPlace(0).Gasolineras),
            new Plc(places.findPlace(1).Lugar, places.findPlace(1).Habitantes, places.findPlace(1).L_interes, places.findPlace(1).L_comida, places.findPlace(1).Gasolineras),
            new Plc(places.findPlace(2).Lugar, places.findPlace(2).Habitantes, places.findPlace(2).L_interes, places.findPlace(2).L_comida, places.findPlace(2).Gasolineras),
            new Plc(places.findPlace(3).Lugar, places.findPlace(3).Habitantes, places.findPlace(3).L_interes, places.findPlace(3).L_comida, places.findPlace(3).Gasolineras),
            new Plc(places.findPlace(4).Lugar, places.findPlace(4).Habitantes, places.findPlace(4).L_interes, places.findPlace(4).L_comida, places.findPlace(4).Gasolineras),
            new Plc(places.findPlace(5).Lugar, places.findPlace(5).Habitantes, places.findPlace(5).L_interes, places.findPlace(5).L_comida, places.findPlace(5).Gasolineras),
            new Plc(places.findPlace(6).Lugar, places.findPlace(6).Habitantes, places.findPlace(6).L_interes, places.findPlace(6).L_comida, places.findPlace(6).Gasolineras),
            new Plc(places.findPlace(7).Lugar, places.findPlace(7).Habitantes, places.findPlace(7).L_interes, places.findPlace(7).L_comida, places.findPlace(7).Gasolineras),
            new Plc(places.findPlace(8).Lugar, places.findPlace(8).Habitantes, places.findPlace(8).L_interes, places.findPlace(8).L_comida, places.findPlace(8).Gasolineras),
            new Plc(places.findPlace(9).Lugar, places.findPlace(9).Habitantes, places.findPlace(9).L_interes, places.findPlace(9).L_comida, places.findPlace(9).Gasolineras),
            new Plc(places.findPlace(10).Lugar, places.findPlace(10).Habitantes, places.findPlace(10).L_interes, places.findPlace(10).L_comida, places.findPlace(10).Gasolineras),
            new Plc(places.findPlace(11).Lugar, places.findPlace(11).Habitantes, places.findPlace(11).L_interes, places.findPlace(11).L_comida, places.findPlace(11).Gasolineras),
            new Plc(places.findPlace(12).Lugar, places.findPlace(12).Habitantes, places.findPlace(12).L_interes, places.findPlace(12).L_comida, places.findPlace(12).Gasolineras),
            new Plc(places.findPlace(13).Lugar, places.findPlace(13).Habitantes, places.findPlace(13).L_interes, places.findPlace(13).L_comida, places.findPlace(13).Gasolineras),
            new Plc(places.findPlace(14).Lugar, places.findPlace(14).Habitantes, places.findPlace(14).L_interes, places.findPlace(14).L_comida, places.findPlace(14).Gasolineras),
            new Plc(places.findPlace(15).Lugar, places.findPlace(15).Habitantes, places.findPlace(15).L_interes, places.findPlace(15).L_comida, places.findPlace(15).Gasolineras),
            new Plc(places.findPlace(16).Lugar, places.findPlace(16).Habitantes, places.findPlace(16).L_interes, places.findPlace(16).L_comida, places.findPlace(16).Gasolineras),
            new Plc(places.findPlace(17).Lugar, places.findPlace(17).Habitantes, places.findPlace(17).L_interes, places.findPlace(17).L_comida, places.findPlace(17).Gasolineras)

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

        search.textProperty().addListener((observable, oldValue, newValue) -> {

            filter.setPredicate((Predicate<? super Plc>) (Plc plc)-> {
                if (newValue.isEmpty() || newValue == null){
                    return true;
                }else if (plc.getName().contains(newValue)){
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

    class Plc {

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


        public Plc(String name, String people, String intPlace, String foodPlace, String gasPlace){
            this.name = new SimpleStringProperty(name);
            this.people = new SimpleStringProperty(people);
            this.intPlace = new SimpleStringProperty(intPlace);
            this.foodPlace = new SimpleStringProperty(foodPlace);
            this.gasPlace = new SimpleStringProperty(gasPlace);
        }

}

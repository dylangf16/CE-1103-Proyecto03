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
import java.util.regex.Pattern;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;

public class Datos_Controller implements Initializable {

    /**
     * Barra de busqueda
     */
    @FXML
    private TextField search;
    /**
     * Tabla de contenidos
     */
    @FXML
    private TableView<Plc> tbl;
    /**
     * Columna del nombre de los lugares
     */
    @FXML
    private TableColumn<Plc,String> col_name;
    /**
     * Columna de la cantidad de habitantes
     */
    @FXML
    private TableColumn<Plc,String> col_people;
    /**
     * Columna de lugares interesantes
     */
    @FXML
    private TableColumn<Plc,String> col_intPlace;
    /**
     * Columna de luagres de comida
     */
    @FXML
    private TableColumn<Plc,String> col_foodPlace;
    /**
     * Columna de gasolineras
     */
    @FXML
    private TableColumn<Plc,String> col_gasPlace;

    LinkedList places = SortPlaces.createNodeList();
    String[] sortedPlaces = SortPlaces.SortedPlaces();

    /**
     * Contenido de la tabla
     */
    ObservableList list = FXCollections.observableArrayList(
            new Plc(places.find(sortedPlaces[0]).Lugar, places.find(sortedPlaces[0]).Habitantes, places.find(sortedPlaces[0]).L_interes, places.find(sortedPlaces[0]).L_comida, places.find(sortedPlaces[0]).Gasolineras),
            new Plc(places.find(sortedPlaces[1]).Lugar, places.find(sortedPlaces[1]).Habitantes, places.find(sortedPlaces[1]).L_interes, places.find(sortedPlaces[1]).L_comida, places.find(sortedPlaces[1]).Gasolineras),
            new Plc(places.find(sortedPlaces[2]).Lugar, places.find(sortedPlaces[2]).Habitantes, places.find(sortedPlaces[2]).L_interes, places.find(sortedPlaces[2]).L_comida, places.find(sortedPlaces[2]).Gasolineras),
            new Plc(places.find(sortedPlaces[3]).Lugar, places.find(sortedPlaces[3]).Habitantes, places.find(sortedPlaces[3]).L_interes, places.find(sortedPlaces[3]).L_comida, places.find(sortedPlaces[3]).Gasolineras),
            new Plc(places.find(sortedPlaces[4]).Lugar, places.find(sortedPlaces[4]).Habitantes, places.find(sortedPlaces[4]).L_interes, places.find(sortedPlaces[4]).L_comida, places.find(sortedPlaces[4]).Gasolineras),
            new Plc(places.find(sortedPlaces[5]).Lugar, places.find(sortedPlaces[5]).Habitantes, places.find(sortedPlaces[5]).L_interes, places.find(sortedPlaces[5]).L_comida, places.find(sortedPlaces[5]).Gasolineras),
            new Plc(places.find(sortedPlaces[6]).Lugar, places.find(sortedPlaces[6]).Habitantes, places.find(sortedPlaces[6]).L_interes, places.find(sortedPlaces[6]).L_comida, places.find(sortedPlaces[6]).Gasolineras),
            new Plc(places.find(sortedPlaces[7]).Lugar, places.find(sortedPlaces[7]).Habitantes, places.find(sortedPlaces[7]).L_interes, places.find(sortedPlaces[7]).L_comida, places.find(sortedPlaces[7]).Gasolineras),
            new Plc(places.find(sortedPlaces[8]).Lugar, places.find(sortedPlaces[8]).Habitantes, places.find(sortedPlaces[8]).L_interes, places.find(sortedPlaces[8]).L_comida, places.find(sortedPlaces[8]).Gasolineras),
            new Plc(places.find(sortedPlaces[9]).Lugar, places.find(sortedPlaces[9]).Habitantes, places.find(sortedPlaces[9]).L_interes, places.find(sortedPlaces[9]).L_comida, places.find(sortedPlaces[9]).Gasolineras),
            new Plc(places.find(sortedPlaces[10]).Lugar, places.find(sortedPlaces[10]).Habitantes, places.find(sortedPlaces[10]).L_interes, places.find(sortedPlaces[10]).L_comida, places.find(sortedPlaces[10]).Gasolineras),
            new Plc(places.find(sortedPlaces[11]).Lugar, places.find(sortedPlaces[11]).Habitantes, places.find(sortedPlaces[11]).L_interes, places.find(sortedPlaces[11]).L_comida, places.find(sortedPlaces[11]).Gasolineras),
            new Plc(places.find(sortedPlaces[12]).Lugar, places.find(sortedPlaces[12]).Habitantes, places.find(sortedPlaces[12]).L_interes, places.find(sortedPlaces[12]).L_comida, places.find(sortedPlaces[12]).Gasolineras),
            new Plc(places.find(sortedPlaces[13]).Lugar, places.find(sortedPlaces[13]).Habitantes, places.find(sortedPlaces[13]).L_interes, places.find(sortedPlaces[13]).L_comida, places.find(sortedPlaces[13]).Gasolineras),
            new Plc(places.find(sortedPlaces[14]).Lugar, places.find(sortedPlaces[14]).Habitantes, places.find(sortedPlaces[14]).L_interes, places.find(sortedPlaces[14]).L_comida, places.find(sortedPlaces[14]).Gasolineras),
            new Plc(places.find(sortedPlaces[15]).Lugar, places.find(sortedPlaces[15]).Habitantes, places.find(sortedPlaces[15]).L_interes, places.find(sortedPlaces[15]).L_comida, places.find(sortedPlaces[15]).Gasolineras),
            new Plc(places.find(sortedPlaces[16]).Lugar, places.find(sortedPlaces[16]).Habitantes, places.find(sortedPlaces[16]).L_interes, places.find(sortedPlaces[16]).L_comida, places.find(sortedPlaces[16]).Gasolineras),
            new Plc(places.find(sortedPlaces[17]).Lugar, places.find(sortedPlaces[17]).Habitantes, places.find(sortedPlaces[17]).L_interes, places.find(sortedPlaces[17]).L_comida, places.find(sortedPlaces[16]).Gasolineras)


    );

    FilteredList filter = new FilteredList(list, e->true);


    /**
     * Configuracion inicial de la tabla
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        col_name.setCellValueFactory(cellData -> cellData.getValue().name);
        col_people.setCellValueFactory(cellData -> cellData.getValue().people);
        col_intPlace.setCellValueFactory(cellData -> cellData.getValue().intPlace);
        col_foodPlace.setCellValueFactory(cellData -> cellData.getValue().foodPlace);
        col_gasPlace.setCellValueFactory(cellData -> cellData.getValue().gasPlace);

        tbl.setItems(list);
    }

    /**
     * Metodo de filtracion
     * @param event KeyRealease
     */
    @FXML
    private void search(KeyEvent event){

        search.textProperty().addListener((observable, oldValue, newValue) -> {

            filter.setPredicate((Predicate<? super Plc>) (Plc plc)-> {
                if (newValue.isEmpty() || newValue == null){
                    return true;
                }else if (Pattern.compile(Pattern.quote(newValue), Pattern.CASE_INSENSITIVE).matcher(plc.getName()).find()){
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

/**
 * Clase de las celdas
 */
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


    /**
     * Metodo contructor de una fila
     * @param name Nombre del lugar
     * @param people Cantidad de habitantes
     * @param intPlace Lugares interesantes
     * @param foodPlace Lugares de comida
     * @param gasPlace Gasolineras
     */
    public Plc(String name, String people, String intPlace, String foodPlace, String gasPlace){
        this.name = new SimpleStringProperty(name);
        this.people = new SimpleStringProperty(people);
        this.intPlace = new SimpleStringProperty(intPlace);
        this.foodPlace = new SimpleStringProperty(foodPlace);
        this.gasPlace = new SimpleStringProperty(gasPlace);
    }

}

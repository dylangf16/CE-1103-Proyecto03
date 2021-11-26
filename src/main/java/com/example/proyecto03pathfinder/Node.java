package com.example.proyecto03pathfinder;

public class Node {

    String Lugar, Habitantes, L_interes, L_comida, Gasolineras;
    Node next;
    int place;

    /**
     * Metodo contructor
     * @param place Nombre del lugar
     * @param people Cantidad de habitantes
     * @param Place_interest Lugares interesantes
     * @param Place_food Lugares de comida
     * @param GasPlace Gasolineras
     */
    public Node(String place, String people, String Place_interest, String Place_food, String GasPlace) {
        this.Lugar = place;
        this.Habitantes = people;
        this.L_interes = Place_interest;
        this.L_comida = Place_food;
        this.Gasolineras = GasPlace;
        this.next = null;
        this.place = 0;
    }

    /**
     * Metodo para obtener el siguiente nodo
     * @return el nodo que sigue despues del actual
     */
    public Node getNext(){
        return this.next;
    }


}

package com.example.proyecto03pathfinder;

public class Node {

        String Lugar, Habitantes, L_interes, L_comida, Gasolineras;
        Node next;

        public Node(String place, String people, String Place_interest, String Place_food, String GasPlace) {
            this.Lugar = place;
            this.Habitantes = people;
            this.L_interes = Place_interest;
            this.L_comida = Place_food;
            this.Gasolineras = GasPlace;
            this.next = null;
        }

        public void setNext(Node next){
            this.next = next;
        }

        public Node getNext(){
            return this.next;
        }

}
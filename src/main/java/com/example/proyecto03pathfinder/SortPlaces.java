package com.example.proyecto03pathfinder;

import java.util.ArrayList;
import java.util.List;

public class SortPlaces {


    public static LinkedList createNodeList() {
        LinkedList NodeList = new LinkedList();
        Node Lugar1 = new Node("Estrella", "47 743", "Pesca de Trucha Las Piedras, Finca la catarata", "Soda La Amistad, Pesca La Estrella, Cafeteria mi Sueno", "Gasoline Station, Gasoline Station El Empalme");
        Node Lugar2 = new Node("San Isidro", "11 528", "Finca de Piedra", "Mirador de Juancho, Donde Paco", "Servicentro El Guarco, Cielo verde");
        Node Lugar3 = new Node("Quebradilla", "6 025", "Cancha de Basquetbol, IDT Paintball", "Cocina 73, Ceviche Batata, Restaurante La Rueda", "Servicentro El Guarco, Cielo verde");
        Node Lugar4 = new Node("El Tejar de El Guarco", "26 916", "AC Videojuegos, ", "El Novillo Alegre, Lumbers Wild Grill, El Tejano", "Servicentro El Guarco, Cielo verde");
        Node Lugar5 = new Node("Taras", "29 662", "BirdWatching Costa Rica, ", "Bar Lukas, Vaca Brava Grill", "Servicentro del Oeste, Gasolinera La Lima, UNO");
        Node Lugar6 = new Node("Cartago", "315 000", "Estatua de Jesus Jimenez, Torre de Agua El Bosque", "La Ventanita Criolla, Area 27 Street Food", "Raul Molina Gas Station, Service Station Los Angeles");
        Node Lugar7 = new Node("Tres Rios", "9 316", "Pronatura Park, El Rancho de Juan", "ULa, Restaurante Feliz, Leos Caribbean", "Delta Tres Rios, Servilndoor");
        Node Lugar8 = new Node("Llano Grande", "5 068", "Vivero Llano Verde, Villa 40033 La Laguna", "Soda y Pulperia Mary, Bar La Cueva, Cachos Bar", "Del Surco Gas Station");
        Node Lugar9 = new Node("Tierra Blanca", "120", "Plaza", "Pizza", "Bomba");
        Node Lugar10 = new Node("Cot", "11 231", "Sunset Garden, Finca el Descansadero", "Restaurante 1910, Soda Antojitos Cot, La Casita del Sabor Cot", "Del Surco Gas Station");
        Node Lugar11 = new Node("Cipreses", "4 199", "Calvario de la comunidad de Cipreses de Oreamuno, Campanario e la Iglesia Catolica", "Mi Fogon, Granja Crujim, Soda San Miguel", "Servicentro Pacayas, Estacion de Servicentro Cervantes");
        Node Lugar12 = new Node("Pacayas", "5 963", "Parador fotográfico Pacayas", "Sabros Pizza, DON PEPE EL POLLO DEL PUEBLO", "Servicentro Pacayas");
        Node Lugar13 = new Node("Turrialba", "27 108", "Ceiba Gigante Monumento Natural, Parador Fotográfico Turrialba", "Soda las Brisas, Wok & Roll, El ajonjoli", "Estación de Servicio TRANCARTAGI, Brothers gas station. Orozco, ");
        Node Lugar14 = new Node("San Martin", "900", "Letras Juan Viñas de Jiménez", "La Cuchara De Tita Umaña, Soda la cocina de kathya", "Estación de Servicio TRANCARTAGI");
        Node Lugar15 = new Node("Cervantes", "6 865", "Plaza de El Bajo de Cervantes", "Restaurante coyotes, Soda el Quijote, Restaurante La Posada de la Luna", "Estacion de Servicio Cervantes, Servicentro Pacayas");
        Node Lugar16 = new Node("Paraiso", "20 601", "Catarata El Salto de La Novia, El Salto Ecolodge", "Ke Moncha!! Gastro Urban, Brasas Parrillero Paraiso, Restaurante y Cafetería Chanas", "GRUPO SERPASA S A, Delta Paraíso");
        Node Lugar17 = new Node("Cachi", "5 911", "Represa Cachí, charrara Park", "Bar. Rest Robin Murray, Soda Kachi", "Gasolinera SERPASA");
        Node Lugar18 = new Node("Orosi", "9 084", "Orosi Valley tour, Purisil de Orosi, Parqueo Monte Sky Mirador Ecológico", "La Terraza De Doña Meche, Cascada Vista Palomo, El Buen Taco del Valle", "Gasolinera SERPASA, Service Station Los Angeles");
        NodeList.insert(Lugar1);
        NodeList.insert(Lugar2);
        NodeList.insert(Lugar3);
        NodeList.insert(Lugar4);
        NodeList.insert(Lugar5);
        NodeList.insert(Lugar6);
        NodeList.insert(Lugar7);
        NodeList.insert(Lugar8);
        NodeList.insert(Lugar9);
        NodeList.insert(Lugar10);
        NodeList.insert(Lugar11);
        NodeList.insert(Lugar12);
        NodeList.insert(Lugar13);
        NodeList.insert(Lugar14);
        NodeList.insert(Lugar15);
        NodeList.insert(Lugar16);
        NodeList.insert(Lugar17);
        NodeList.insert(Lugar18);
        return NodeList;
    }

    public static List<String> createNames(){
        List<String> Lugares = new ArrayList<>();
        String Lugar1 = "Estrella";
        String Lugar2 = "San Isidro";
        String Lugar3 = "Quebradilla";
        String Lugar4 = "El Tejar de El Guarco";
        String Lugar5 = "Taras";
        String Lugar6 = "Cartago";
        String Lugar7 = "Tres Rios";
        String Lugar8 = "Llano Grande";
        String Lugar9 = "Tierra Blanca";
        String Lugar10 = "Cot";
        String Lugar11 = "Cipreses";
        String Lugar12 = "Pacayas";
        String Lugar13 = "Turrialba";
        String Lugar14 = "San Martin";
        String Lugar15 = "Cervantes";
        String Lugar16 = "Paraiso";
        String Lugar17 = "Cachi";
        String Lugar18 = "Orosi";
        Lugares.add(Lugar1);
        Lugares.add(Lugar2);
        Lugares.add(Lugar3);
        Lugares.add(Lugar4);
        Lugares.add(Lugar5);
        Lugares.add(Lugar6);
        Lugares.add(Lugar7);
        Lugares.add(Lugar8);
        Lugares.add(Lugar9);
        Lugares.add(Lugar10);
        Lugares.add(Lugar11);
        Lugares.add(Lugar12);
        Lugares.add(Lugar13);
        Lugares.add(Lugar14);
        Lugares.add(Lugar15);
        Lugares.add(Lugar16);
        Lugares.add(Lugar17);
        Lugares.add(Lugar18);
        return Lugares;
    }

    public static List<String> bubble_srt() {
        List<String> array = createNames();
        int n = array.size();
        int k;
        int a = 0;
        for (int m = 0; m < n; m++) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (Character.getNumericValue(array.get(i).charAt(a)) > Character.getNumericValue(array.get(k).charAt(a))) {
                    String temp;
                    temp = array.get(i);
                    array.set(i, array.get(k));
                    array.set(k, temp);
                }else if (Character.getNumericValue(array.get(i).charAt(a)) == Character.getNumericValue(array.get(k).charAt(a))){
                    while (Character.getNumericValue(array.get(i).charAt(a)) == Character.getNumericValue(array.get(k).charAt(a))) {
                        a++;
                    }
                    if (Character.getNumericValue(array.get(i).charAt(a)) > Character.getNumericValue(array.get(k).charAt(a))) {
                        String temp;
                        temp = array.get(i);
                        array.set(i, array.get(k));
                        array.set(k, temp);
                        a=0;
                    }else{
                        a=0;
                    }
                }
            }
        }
        return array;
    }

    public static LinkedList sortNodes(){
        LinkedList Nodes = createNodeList();
        LinkedList sortedNodes = new LinkedList();
        List<String> placesList = bubble_srt();
        for (int i = 0; i < placesList.size(); i++){
            Node temp = Nodes.find(placesList.get(i));
            temp.setPlace(i);
            sortedNodes.insert(temp);
        }
        return sortedNodes;
    }

}

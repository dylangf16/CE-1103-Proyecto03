package com.example.proyecto03pathfinder;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static String[] createNames(){
        String[] Lugares = new String[]{"Estrella", "San Isidro", "Quebradilla", "El Tejar de El Guarco",
                "Taras", "Cartago", "Tres Rios", "Llano Grande", "Tierra Blanca", "Cot", "Cipreses", "Pacayas", "Turrialba",
                "San Martin", "Cervantes", "Paraiso", "Cachi", "Orosi"};
        return Lugares;
    }

    public static String[] SortedPlaces(){
        String[] input = createNames();
        sort(input);
        return input;
    }

    public static void sort(String[] a) {

        int left = 0;
        int right = a.length - 1;
        quickSort(left, right, a);

    }

    private static void quickSort(int left, int right, String[] a) {

        if (left >= right) {
            return;
        }
        String pivot;
        pivot = getMedian(left, right, a);

        int partition = partition(left, right, pivot, a);

        quickSort(0, partition - 1, a);

        quickSort(partition + 1, right, a);
    }

    private static int partition(int left, int right, String pivot, String[] a) {

        int leftCursor = left - 1;
        int rightCursor = right;

        while (leftCursor < rightCursor) {

            while (((Comparable<String>) a[++leftCursor]).compareTo(pivot) < 0);

            while (rightCursor > 0 && ((Comparable<String>) a[--rightCursor]).compareTo(pivot) > 0);

            if (leftCursor >= rightCursor) {

                break;

            } else {

                swap(leftCursor, rightCursor, a);
            }
        }

        swap(leftCursor, right, a);

        return leftCursor;

    }

    public static String getMedian(int left, int right, String[] a) {

        int center = (left + right) / 2;

        if (((Comparable<String>) a[left]).compareTo(a[center]) > 0) {

        }
        swap(left, center, a);

        if (((Comparable<String>) a[left]).compareTo(a[right]) > 0) {

        }
        swap(left, right, a);

        if (((Comparable<String>) a[center]).compareTo(a[right]) > 0) {

        }
        swap(center, right, a);

        swap(center, right, a);
        return a[right];
    }

    public static void swap(int left, int right, String[] a) {
        String temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    public static void printArray(String[] a) {
        for (String i : a) {
            System.out.print(i + " ");
        }
    }

    public static LinkedList sortNodes(){
        LinkedList Nodes = createNodeList();
        LinkedList sortedNodes = new LinkedList();
        String[] placesList = SortedPlaces();
        System.out.println(Arrays.toString(placesList));
        for (int i = 0; i < placesList.length; i++){
            System.out.println("Va " + i);
            Node temp = Nodes.find(placesList[i]);
            temp.setPlace(i);
            sortedNodes.insert(temp);
        }
        return sortedNodes;
    }

}

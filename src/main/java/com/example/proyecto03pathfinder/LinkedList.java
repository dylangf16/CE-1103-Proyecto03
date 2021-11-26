package com.example.proyecto03pathfinder;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    /**
     * Metodo constructor
     */
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Metodo para insertar un nodo a la lista
     * @param newBNode el nodo que se va a insertar
     */
    public void insert(Node newBNode) {
        if(this.head == null){
            this.head = this.tail = newBNode;
        }else {
            this.tail.next = newBNode;
            this.tail = newBNode;
        }
        this.size++;
    }

    /**
     * Metodo para encontrar el nodo que almacene un string en especifico
     * @param searchValue string que se va a buscar en los nodos de la lista
     * @return
     */
    public Node find(String searchValue) {
        Node current = this.head;
        while (current != null) {
            if (current.Lugar == searchValue) {
                return current;
            } else {
                current = current.getNext();
            }
        }
        return null;
    }

}

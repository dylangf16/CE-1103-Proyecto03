package com.example.proyecto03pathfinder;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        return this.size;
    }

    public void insert(Node newBNode) {
        if(this.head == null){
            this.head = this.tail = newBNode;
        }else {
            this.tail.next = newBNode;
            this.tail = newBNode;
        }
        this.size++;
    }

    public Node find(String searchValue) {
        Node current = this.head;
        while (current != null) {
            if (current.Lugar.equals(searchValue)) {
                return current;
            } else {
                current = current.getNext();
            }
        }
        return null;
    }

    public Node findPlace(int searchValue) {
        Node current = this.head;
        while (current != null) {
            if (current.place == searchValue) {
                return current;
            } else {
                current = current.getNext();
            }
        }
        return null;
    }

    public Node delete(String searchValue) {
        Node current = this.head;
        Node previous = this.head;

        while (current != null) {
            if (current.Lugar.equals(searchValue)) {
                if (current == this.head) {
                    this.head = this.head.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                return current;
            } else {
                previous = current;
                current = current.getNext();
            }
        }
        return null;
    }

}

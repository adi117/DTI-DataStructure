package org.example.entity;

public class Node<T> {
    T data;
    Node<T> next;


    public Node(T data){
        this.data = data;
        Node next;
    }
}

package org.example.entity;

public class Queue<T> {

    private Node<T> front, back;

    public Queue(){
        this.front = null;
        this.back = null;
    }

    public void enqueue(T data){
        Node<T> newNode = new Node<>(data);
        if (back == null){
            front = newNode;
            back = newNode;
            return;
        }

        back.next = newNode;
        back = newNode;
    }

    public void dequeue(){
        if (front == null){
            throw new IllegalStateException("Queue is empty");
        }

        front = front.next;
        if(front == null){
            back = null;
        }

    }

    public T peek(){
        if(front == null){
            throw new IllegalStateException("Queue is empty");
        }

        return front.data;
    }
}


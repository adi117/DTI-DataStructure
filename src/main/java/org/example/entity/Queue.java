package org.example.entity;

import java.security.PrivilegedExceptionAction;

public class Queue<T> {

    private Node<T> front, back;

    public Queue(){
        this.front = null;
        this.back = null;
    }

    public void enqueue(T data){
        Node<T> newNode = new Node<>(data);
        if (back == null){
            front = back;
            back = newNode;
            return;
        }

        back.next = newNode;
        back = newNode;
    }

    public T dequeue(){
        if (front == null){
            throw new IllegalStateException("Queue is empty");
        }

        T dataDequeue = back.data;
        front = front.next;
        if(front == null){
            back = null;
        }

        return dataDequeue;
    }

    public T peek(){
        if(front == null){
            throw new IllegalStateException("Queue is empty");
        }

        return front.data;
    }
}


package org.example.entity;

public class Stack<T> {
    private Node<T> top;

    public Stack(){
        this.top = null;
    }

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop(){
        if (top == null){
            throw new IllegalStateException("Stack is empty!");
        }

        T popData = top.data;
        top = top.next;
        return popData;
    }

    public T peek(){
        if(top == null){
            throw new IllegalStateException("Stack is empty!");
        }

        return top.data;
    }
}

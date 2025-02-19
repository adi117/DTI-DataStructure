package org.example;

import org.example.entity.Queue;
import org.example.entity.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("-- Stack ---");
        Stack<String> stack = new Stack<>();
        stack.push("Muhammad");
        stack.push("Adi");
        stack.push("Wicaksono");


        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

        System.out.println("-- Queue ---");
        Queue<String> queue = new Queue<>();
        queue.enqueue("enqueue1");
        queue.enqueue("enqueue2");
        queue.enqueue("enqueue3");

        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
    }
}
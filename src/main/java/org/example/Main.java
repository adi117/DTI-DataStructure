package org.example;

import org.example.entity.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Muhammad");
        stack.push("Adi");
        stack.push("Wicaksono");


        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
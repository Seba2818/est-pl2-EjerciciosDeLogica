package utils;

import java.util.Stack;

public class StackSorter {

    public void sortStack(Stack<Integer> stack) {

        Stack<Integer> aux = new Stack <Integer>();

        while (!stack.isEmpty()) {

            int num = stack.pop();

            while (!aux.isEmpty() && aux.peek() > num) {
                stack.push(aux.pop());
            }

            aux.push(num);
        }

        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }
    }
}
    


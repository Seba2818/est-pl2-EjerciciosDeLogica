package utils;

import java.util.Stack;

public class SignValidator {
    public boolean isValid(String s) {

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // Aperturas
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            }

            // Cierres
            else if (c == ')' || c == '}' ||  c == ']') {

                if (pila.isEmpty()) {
                    return false;
                }

                char tope = pila.pop();

                if ((c == ')' && tope != '(') ||
                    (c == '}' && tope != '{') ||
                    (c == ']' && tope != '[')) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
}
    


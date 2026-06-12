package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePalindrome {


    public boolean isPalindrome(String text) {


        Queue<Character> queue = new LinkedList<>();


        for(char c : text.toLowerCase().toCharArray()){
            queue.add(c);
        }

        int size = queue.size();

        for(int i = 0; i < size / 2; i++){

            char first = queue.remove();
            Queue<Character> temp = new LinkedList<>();

            while(queue.size() > 1){
                temp.add(queue.remove());
            }

            char last = queue.remove();

            while(!temp.isEmpty()){
                queue.add(temp.remove());
            }

            if(first != last){
                return false;
            }
        }
        return true;
    }
}

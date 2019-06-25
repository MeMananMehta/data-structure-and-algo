package academy.learnprogramming.stackschallenge;


import javax.swing.plaf.basic.BasicMenuUI;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        // should return true
        System.out.println(checkForPalindrome("radar"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        string = string.toLowerCase();

        LinkedList<Character> stack = new LinkedList<Character>();

        StringBuilder stringNoPunc = new StringBuilder(string.length());
        StringBuilder reversed = new StringBuilder(string.length());


        for(int i =0; i<string.length(); i++){
            char c = string.charAt(i);
            if(c >= 'a' && c <= 'z'){
                stringNoPunc.append(c);
                stack.push(c);
            }
        }

        for(int i =0; i<stringNoPunc.length(); i++){
            reversed.append(stack.pop());
        }

        if (reversed.toString().equals(stringNoPunc.toString())) {
            return true;
        }else{
            return false;
        }

    }

}

package com.practise.data.structures.stacks;

import java.util.LinkedList;

/**
 * This checks if a given String is Palindrome or not ignoring the punctuation marks, case and spaces.
 * A Palindrome is a String or number which is same in both forward and reverse directions.
 * Ex: did, racecar
 */
public class Palindrome {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
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
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringOnlyLetters = new StringBuilder(string.length());
        String lowerString = string.toLowerCase();

        for (int i = 0; i < lowerString.length(); i++) {
            char c = lowerString.charAt(i);
            if(c >= 'a' && c <= 'z'){
                stringOnlyLetters.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(lowerString.length());
        while (!stack.isEmpty()){
            reversedString.append(stack.pop());
        }

        return stringOnlyLetters.toString().equals(reversedString.toString());

    }
}

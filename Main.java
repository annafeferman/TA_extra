package com.company;
import java.util.Scanner;

import static com.company.PalindromeCheck.IsPalindrome;

class PalindromeCheck {
    public static boolean IsPalindrome(String word)
   {
        if (word.length() == 0 || word.length() == 1)
            return true;
        if (word.charAt(0) == word.charAt(word.length()-1))
            return IsPalindrome(word.substring(1, word.length()-1));
            return false;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string for a check: ");
        String string = scanner.nextLine();

        if (IsPalindrome(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
}

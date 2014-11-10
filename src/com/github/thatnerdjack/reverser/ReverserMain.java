package com.github.thatnerdjack.reverser;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverserMain {

	// our standard readLine method
	public static String readLine(String prompt) {
        String line = null;
        Console c = System.console();
        if (c != null) {
             line = c.readLine(prompt);
        } else {
            System.out.print(prompt);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                 line = bufferedReader.readLine();
            } catch (IOException e) { 
                //Ignore    
            }
        }
        return line;
	}


    public static void isPalindrome(String input) {
        input = removeNonLetters(input);
        input = input.toLowerCase();
        ReversedString rs = new ReversedString(input);
        String s = rs.toString();
        if (s.equals(input)) {
            System.out.println("The string " + input + " IS a palindrome!");
        } else {
            System.out.println("The string " + input + " is NOT a palindrome!");
        }
    }

    public static String removeNonLetters(String string) {
        String newString= "";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isLetter(c) == true) {
                newString += c;
            }
        }
        return newString;
    }

	
	// simple main to get input and print its reverse
	public static void main(String[] args) {
		String s = readLine("Enter a string to reverse: ");
		ReversedString rs = new ReversedString(s);
		System.out.println(rs.revString);
        System.out.println("Phase 1:");
        isPalindrome("hannah");
        isPalindrome("radar");
        isPalindrome("apple");
        System.out.println("Phase 2 and 3:");
        isPalindrome("A man, a plan, a canal: Panama!");
        isPalindrome("Madam, in Eden, I'm Adam");
        isPalindrome("The quick brown fox...");
    }
}

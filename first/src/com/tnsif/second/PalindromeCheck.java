package com.tnsif.second;

public class PalindromeCheck {

	public static void main(String[] args) {
        int num = 121;  // change number here
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num = num / 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}
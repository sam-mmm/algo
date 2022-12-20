package org.sam.algo;

public class ValidPalindromeSolution {
    public boolean isPalindrome(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString().toLowerCase().contentEquals(stringBuilder.reverse().toString().toLowerCase());
    }
}

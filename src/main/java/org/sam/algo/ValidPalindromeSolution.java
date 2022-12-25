package org.sam.algo;

public class ValidPalindromeSolution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString().toLowerCase().contentEquals(sb.reverse().toString().toLowerCase());
    }
}

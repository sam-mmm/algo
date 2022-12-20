package org.sam.algo;

import java.util.HashMap;

public class MaximumNumberOfBalloonsSolution {
    public int maxNumberOfBalloons(String text) {
        int result = text.length();
        String balloonText = "balloon";
        HashMap<Character, Integer> countText = new HashMap<Character, Integer>();
        HashMap<Character, Integer> balloon = new HashMap<Character, Integer>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            countText.put(ch, countText.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < balloonText.length(); i++) {
            char ch = balloonText.charAt(i);
            balloon.put(ch, balloon.getOrDefault(ch, 0) + 1);
        }
        for (char c : balloon.keySet()) {
            result = Math.min(result, countText.getOrDefault(c, 0) / balloon.get(c));
        }
        return result;
    }

}
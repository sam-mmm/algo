package org.sam.algo;

import java.util.HashMap;

public class WordPatternSolution {
    public boolean wordPattern(String pattern, String s) {
        String[] sp = pattern.split("");
        String[] ss = s.split(" ");
        if (sp.length != ss.length) {
            return false;
        }
        HashMap<String, String> charToWord = new HashMap<>();
        HashMap<String, String> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            String v1 = sp[i];
            String v2 = ss[i];
            if (charToWord.containsKey(v1) && !charToWord.get(v1).contentEquals(v2)) {
                return false;
            }
            if (wordToChar.containsKey(v2) && !wordToChar.get(v2).contentEquals(v1)) {
                return false;
            }
            charToWord.put(v1, v2);
            wordToChar.put(v2, v1);
        }
        return true;
    }
}

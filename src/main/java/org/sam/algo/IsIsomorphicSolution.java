package org.sam.algo;

import java.util.TreeMap;

public class IsIsomorphicSolution {
    public boolean isIsomorphic(String s, String t) {
        TreeMap<Character, Character> mapST = new TreeMap<>();
        TreeMap<Character, Character> mapTS = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mapST.containsKey(s.charAt(i)) && mapST.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            } else if (mapTS.containsKey(t.charAt(i)) && mapTS.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            } else {
                mapST.put(s.charAt(i), t.charAt(i));
                mapTS.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}

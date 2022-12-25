package org.sam.algo;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagramSolution {
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char _s = s.charAt(i);
            if (mapS.containsKey(_s)) {
                mapS.put(_s, mapS.get(_s) + 1);
            } else {
                mapS.put(_s, 1);
            }

            char _t = t.charAt(i);
            if (mapT.containsKey(_t)) {
                mapT.put(_t, mapT.get(_t) + 1);
            } else {
                mapT.put(_t, 1);
            }
        }

        for (char c : mapS.keySet()) {
            if (mapS.get(c) != mapT.get(c)) return false;
        }

        return true;
    }

    public boolean isAnagram2(String s, String t) {
        char[] sc = s.toCharArray();
        Arrays.sort(sc);
        s = String.valueOf(sc);
        char[] st = t.toCharArray();
        Arrays.sort(st);
        t = String.valueOf(st);

        return s.contentEquals(t);
    }
}

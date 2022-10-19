package org.sam.algo;

public class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String temp = "";
            for (int j = 0; j < strs[i].length(); j++) {
                if ((prefix.length() > j && strs[i].length() > j) && (prefix.charAt(j) == strs[i].charAt(j))) {
                    temp = temp.concat(Character.toString(strs[i].charAt(j)));
                } else {
                    break;
                }
            }
            prefix = temp;
        }
        return prefix;
    }
}

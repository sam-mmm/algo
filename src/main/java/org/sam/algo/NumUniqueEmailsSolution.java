package org.sam.algo;

import java.util.TreeSet;

public class NumUniqueEmailsSolution {
    public int numUniqueEmails(String[] emails) {
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < emails.length; i++) {
            String at_parts[] = emails[i].split("@");
            String plus_parts[] = at_parts[0].split("\\+");
            String email = plus_parts[0].replaceAll("\\.", "") + "@" + at_parts[1];
            if (!set.contains(email)) {
                set.add(email);
            }
        }
        return set.size();
    }
}

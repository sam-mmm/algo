package org.sam.algo;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleSolution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> current = new ArrayList<>();
            list.add(current);
            if (i == 0) {
                current.add(1);
            } else if (i == 1) {
                current.add(1);
                current.add(1);
            } else {
                List<Integer> last = list.get(i - 1);
                current.add(1);
                for (int j = 0; j < last.size() - 1; j++) {
                    current.add(last.get(j) + last.get(j + 1));
                }
                current.add(1);
            }
        }
        return list;
    }
}

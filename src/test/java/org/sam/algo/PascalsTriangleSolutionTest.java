package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class PascalsTriangleSolutionTest {

    PascalsTriangleSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new PascalsTriangleSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
//        [1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]
        List<List<Integer>> list1 = new ArrayList<>();
        list1.add(new ArrayList<Integer>());
        list1.add(new ArrayList<Integer>());
        list1.add(new ArrayList<Integer>());
        list1.add(new ArrayList<Integer>());
        list1.add(new ArrayList<Integer>());

        list1.get(0).add(1);

        list1.get(1).add(1);
        list1.get(1).add(1);

        list1.get(2).add(1);
        list1.get(2).add(2);
        list1.get(2).add(1);

        list1.get(3).add(1);
        list1.get(3).add(3);
        list1.get(3).add(3);
        list1.get(3).add(1);

        list1.get(4).add(1);
        list1.get(4).add(4);
        list1.get(4).add(6);
        list1.get(4).add(4);
        list1.get(4).add(1);


        List<List<Integer>> list2 = new ArrayList<>();
        list2.add(new ArrayList<Integer>());

        list2.get(0).add(1);
        return new Object[][]{
                new Object[]{5, list1},
                new Object[]{1, list2},
        };
    }


    @Test(dataProvider = "test1")
    public void testGenerate(int numRows, List<List<Integer>> expected) {
        assertEquals(solution.generate(numRows), expected);
    }
}
package org.sam.algo.seventyfive;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TopKFrequentElementsSolutionTest {


    TopKFrequentElementsSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new TopKFrequentElementsSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{1, 1, 1, 2, 2, 3}, 2, new int[]{1, 2}},
                new Object[]{new int[]{1}, 1, new int[]{1}},
        };
    }

    @Test(dataProvider = "test1")
    public void testTopKFrequent(int[] nums, int k, int[] expected) {
        assertEquals(solution.topKFrequent(nums, k), expected);
    }
}
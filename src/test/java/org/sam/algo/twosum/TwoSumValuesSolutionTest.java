package org.sam.algo.twosum;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TwoSumValuesSolutionTest {
    TwoSumValuesSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new TwoSumValuesSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{2, 7, 11, 15}, 9, new int[]{2, 7}},
                new Object[]{new int[]{3, 2, 4}, 6, new int[]{2, 4}},
                new Object[]{new int[]{3, 3}, 6, new int[]{3, 3}},
        };
    }

    @Test(dataProvider = "test1")
    public void testTwoSum(int[] arr, int target, int[] expected) {
        assertEquals(solution.twoSum(arr, target), expected);
    }
}
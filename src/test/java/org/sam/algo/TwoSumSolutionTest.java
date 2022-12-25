package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TwoSumSolutionTest {

    TwoSumSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new TwoSumSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}},
                new Object[]{new int[]{3, 2, 4}, 6, new int[]{1, 2}},
                new Object[]{new int[]{3, 3}, 6, new int[]{0, 1}},

        };
    }

    @Test(dataProvider = "test1")
    public void testTwoSum(int[] nums, int target, int[] expected) {
        assertEquals(solution.twoSum(nums, target), expected);
    }
}
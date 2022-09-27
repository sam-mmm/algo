package org.sam.algo.squaresofasortedarray;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresOfASortedArraySolutionTest {
    SquaresOfASortedArraySolution solution;

    @BeforeClass
    public void setUp() {
        solution = new SquaresOfASortedArraySolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{-4, -1, 0, 3, 10}, new int[]{0, 1, 9, 16, 100}},
                new Object[]{new int[]{-7, -3, 2, 3, 11}, new int[]{4, 9, 9, 49, 121}},
        };
    }

    @Test(dataProvider = "test1")
    public void testSortedSquares1(int[] nums, int[] expected) {
        assertEquals(solution.sortedSquares1(nums), expected);
    }

    @Test(dataProvider = "test1")
    public void testSortedSquares2(int[] nums, int[] expected) {
        assertEquals(solution.sortedSquares2(nums), expected);
    }
}
package org.sam.algo.seventyfive;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LongestConsecutiveSequenceSolutionTest {

    LongestConsecutiveSequenceSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new LongestConsecutiveSequenceSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{100, 4, 200, 1, 3, 2}, 4},
                new Object[]{new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}, 9},
                new Object[]{new int[]{1, 2, 0, 1}, 3},
        };
    }

    @Test(dataProvider = "test1")
    public void testLongestConsecutive(int[] nums, int expected) {
        assertEquals(solution.longestConsecutive(nums), expected);
    }
}
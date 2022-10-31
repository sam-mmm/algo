package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RemoveElementSolutionTest {

    RemoveElementSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new RemoveElementSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{3, 2, 2, 3}, 3, 2},
                new Object[]{new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5},
        };
    }

    @Test(dataProvider = "test1")
    public void testRemoveElement(int[] nums, int val, int expected) {
        assertEquals(solution.removeElement(nums, val), expected);
    }
}
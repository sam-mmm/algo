package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MajorityElementSolutionTest {

    MajorityElementSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new MajorityElementSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{3, 2, 3}, 3},
                new Object[]{new int[]{2, 2, 1, 1, 1, 2, 2}, 2},
        };
    }

    @Test(dataProvider = "test1")
    public void testMajorityElement(int[] nums, int expected) {
        assertEquals(solution.majorityElement(nums), expected);
    }
}
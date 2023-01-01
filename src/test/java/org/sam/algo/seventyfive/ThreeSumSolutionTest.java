package org.sam.algo.seventyfive;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ThreeSumSolutionTest {

    ThreeSumSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new ThreeSumSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{-1, 0, 1, 2, -1, -4}},
                new Object[]{new int[]{0, 1, 1}},
                new Object[]{new int[]{0, 0, 0}},
        };
    }

    @Test(dataProvider = "test1")
    public void testThreeSum(int[] nums) {
        System.out.println(solution.threeSum(nums));
    }
}
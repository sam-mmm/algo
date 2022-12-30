package org.sam.algo.seventyfive;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ClimbingStairsSolutionTest {

    ClimbingStairsSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new ClimbingStairsSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{2, 2},
                new Object[]{3, 3},
        };
    }

    @Test(dataProvider = "test1")
    public void testClimbStairs(int n, int expected) {
        assertEquals(solution.climbStairs(n), expected);
    }
}
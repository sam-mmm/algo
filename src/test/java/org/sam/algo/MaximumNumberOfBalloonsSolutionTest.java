package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MaximumNumberOfBalloonsSolutionTest {

    MaximumNumberOfBalloonsSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new MaximumNumberOfBalloonsSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{"nlaebolko", 1},
                new Object[]{"loonbalxballpoon", 2},
                new Object[]{"leetcode", 0},
        };
    }

    @Test(dataProvider = "test1")
    public void testMaxNumberOfBalloons(String text, int expected) {
        assertEquals(solution.maxNumberOfBalloons(text), expected);
    }
}
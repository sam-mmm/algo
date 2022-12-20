package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FindAllNumbersDisappearedInAnArraySolutionTest {

    FindAllNumbersDisappearedInAnArraySolution solution;

    @BeforeClass
    public void setUp() {
        solution = new FindAllNumbersDisappearedInAnArraySolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{4, 3, 2, 7, 8, 2, 3, 1}, new int[]{5, 6}},
                new Object[]{new int[]{1, 1}, new int[]{2}},

        };
    }

    @Test(dataProvider = "test1")
    public void testFindDisappearedNumbers(int[] nums, int[] expected) {
        assertEquals(solution.findDisappearedNumbers(nums).toArray(new Integer[0]), expected);
    }
}
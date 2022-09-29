package org.sam.algo.containsduplicate;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContainsDuplicateSolutionTest {

    ContainsDuplicateSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new ContainsDuplicateSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{1, 2, 3, 1}, true},
                new Object[]{new int[]{1, 2, 3, 4}, false},
                new Object[]{new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true},
        };
    }

    @Test(dataProvider = "test1")
    public void testContainsDuplicate1(int[] nums, boolean expected) {
        assertEquals(solution.containsDuplicate1(nums), expected);
    }

    @Test(dataProvider = "test1")
    public void testContainsDuplicate2(int[] nums, boolean expected) {
        assertEquals(solution.containsDuplicate2(nums), expected);
    }
}
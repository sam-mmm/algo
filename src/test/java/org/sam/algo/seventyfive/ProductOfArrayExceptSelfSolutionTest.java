package org.sam.algo.seventyfive;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ProductOfArrayExceptSelfSolutionTest {

    ProductOfArrayExceptSelfSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new ProductOfArrayExceptSelfSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{1, 2, 3, 4}, new int[]{24, 12, 8, 6}},
                new Object[]{new int[]{-1, 1, 0, -3, 3}, new int[]{0, 0, 9, 0, 0}},
        };
    }

    @Test(dataProvider = "test1")
    public void testProductExceptSelf1(int[] nums, int[] expected) {
        assertEquals(solution.productExceptSelf1(nums), expected);
    }

    @Test(dataProvider = "test1")
    public void testProductExceptSelf2(int[] nums, int[] expected) {
        assertEquals(solution.productExceptSelf2(nums), expected);
    }

    @Test(dataProvider = "test1")
    public void testProductExceptSelf3(int[] nums, int[] expected) {
        assertEquals(solution.productExceptSelf3(nums), expected);
    }
}
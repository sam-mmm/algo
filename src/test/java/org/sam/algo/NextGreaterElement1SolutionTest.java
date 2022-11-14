package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NextGreaterElement1SolutionTest {

    NextGreaterElement1Solution solution;

    @BeforeClass
    public void setUp() {
        solution = new NextGreaterElement1Solution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}, new int[]{-1, 3, -1}},
                new Object[]{new int[]{2, 4}, new int[]{1, 2, 3, 4}, new int[]{3, -1}},
                new Object[]{new int[]{1, 3, 5, 2, 4}, new int[]{6, 5, 4, 3, 2, 1, 7}, new int[]{7, 7, 7, 7, 7}},//[1,3,5,2,4]
        };
    }

    @Test(dataProvider = "test1")
    public void testNextGreaterElement(int[] nums1, int[] nums2, int[] expected) {
        assertEquals(solution.nextGreaterElement(nums1, nums2), expected);
    }
}
package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ReplaceElementsWithGreatestElementOnRightSideTest {
    ReplaceElementsWithGreatestElementOnRightSide solution;

    @BeforeClass
    public void setUp() {
        solution = new ReplaceElementsWithGreatestElementOnRightSide();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{17, 18, 5, 4, 6, 1}, new int[]{18, 6, 6, 6, 1, -1}},
                new Object[]{new int[]{400}, new int[]{-1}},
        };
    }

    @Test(dataProvider = "test1")
    public void testReplaceElements(int[] arr, int[] expected) {
        assertEquals(solution.replaceElements(arr), expected);
    }
}
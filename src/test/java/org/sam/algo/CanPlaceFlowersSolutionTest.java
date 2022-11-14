package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class CanPlaceFlowersSolutionTest {
    CanPlaceFlowersSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new CanPlaceFlowersSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{1, 0, 0, 0, 1}, 1, true},
                new Object[]{new int[]{1, 0, 0, 0, 1}, 2, false},
                new Object[]{new int[]{1, 0, 0, 0, 0, 1}, 2, false},
                new Object[]{new int[]{0, 0, 1, 0, 0}, 1, true},
        };
    }

    @Test(dataProvider = "test1")
    public void canPlaceFlowers(int[] flowerbed, int n, boolean expected) {
        assertEquals(solution.canPlaceFlowers(flowerbed, n), expected);
    }
}
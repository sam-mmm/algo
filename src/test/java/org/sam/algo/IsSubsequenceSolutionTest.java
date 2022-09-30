package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class IsSubsequenceSolutionTest {

    IsSubsequenceSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new IsSubsequenceSolution();
    }

     @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
            new Object[]{"ahbgdc", "abc", true},
            new Object[]{"ahbgdc", "axc", false},
        };
    }
    
    @Test(dataProvider = "test1")
    public void isSubsequence(String t,String s, boolean expected) {
        boolean val = solution.isSubsequence(s, t);
        assertEquals(val, expected);
    }
    
    @DataProvider(name = "test2")
    public Object[][] createData2() {
        return new Object[][]{
            new Object[]{new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}, new Integer[]{1, 6, -1, 10}, true},
            new Object[]{new Integer[]{5, 1, 22, 25, 6, -1, 8, 10, 4, 21}, new Integer[]{1, 6, -1, 10}, true},
            new Object[]{new Integer[]{5, 1, 22, 25, 6, -1, 8, 4, 21}, new Integer[]{1, 6, -1, 10}, false},
        };
    }

    @Test(dataProvider = "test2")
    public void isSubsequenceIntArray(Integer[] arr, Integer[] seq, boolean expected) {
        boolean val = solution.isSubsequenceIntArray(Arrays.asList(arr), Arrays.asList(seq));
        assertEquals(val, expected);
    }
    
    @Test(dataProvider = "test2")
    public void isSubsequenceIntArray2(Integer[] arr, Integer[] seq, boolean expected) {
        boolean val = solution.isSubsequenceIntArray2(Arrays.asList(arr), Arrays.asList(seq));
        assertEquals(val, expected);
    }
}

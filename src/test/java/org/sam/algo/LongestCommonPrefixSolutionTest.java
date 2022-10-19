package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LongestCommonPrefixSolutionTest {

    LongestCommonPrefixSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new LongestCommonPrefixSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new String[]{"flower", "flow", "flight"}, "fl"},
                new Object[]{new String[]{"dog", "racecar", "car"}, ""},
                new Object[]{new String[]{"ab", "a"}, "a"},
        };
    }

    @Test(dataProvider = "test1")
    public void testLongestCommonPrefix(String[] strs, String expected) {
        assertEquals(solution.longestCommonPrefix(strs), expected);
    }
}
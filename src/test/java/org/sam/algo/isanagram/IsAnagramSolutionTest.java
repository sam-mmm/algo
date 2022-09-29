package org.sam.algo.isanagram;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IsAnagramSolutionTest {
    IsAnagramSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new IsAnagramSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{"anagram", "nagaram", true},
                new Object[]{"rat", "car", false},
        };
    }

    @Test(dataProvider = "test1")
    public void testContainsDuplicate1(String s, String t, boolean expected) {
        assertEquals(solution.isAnagram(s, t), expected);
    }
//    @Test(dataProvider = "test1")
//    public void testContainsDuplicate2(int[] nums,boolean expected) {
//        assertEquals(solution.containsDuplicate2(nums),expected);
//    }
}
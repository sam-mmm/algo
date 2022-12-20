package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ValidPalindromeSolutionTest {

    private ValidPalindromeSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new ValidPalindromeSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{"A man, a plan, a canal: Panama", true},
                new Object[]{"race a car", false},
                new Object[]{" ", true},
        };
    }

    @Test(dataProvider = "test1")
    public void testIsPalindrome(String s, boolean expected) {
        assertEquals(solution.isPalindrome(s), expected);
    }
}
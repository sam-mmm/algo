package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IsIsomorphicSolutionTest {

    IsIsomorphicSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new IsIsomorphicSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{"egg", "add", true},
                new Object[]{"foo", "bar", false},
                new Object[]{"paper", "title", true},
                new Object[]{"badc", "baba", false},
        };
    }

    @Test(dataProvider = "test1")
    public void testIsIsomorphic(String s, String t, boolean expected) {
        assertEquals(solution.isIsomorphic(s, t), expected);
    }
}
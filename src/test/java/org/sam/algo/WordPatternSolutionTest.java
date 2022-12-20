package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WordPatternSolutionTest {
    private WordPatternSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new WordPatternSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{"abba", "dog cat cat dog", true},
                new Object[]{"abba", "dog cat cat fish", false},
                new Object[]{"aaaa", "dog cat cat dog", false},
        };
    }

    @Test(dataProvider = "test1")
    public void testWordPattern(String pattern, String s, boolean expected) {
        assertEquals(solution.wordPattern(pattern, s), expected);
    }
}
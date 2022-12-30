package org.sam.algo.seventyfive;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ValidParenthesesSolutionTest {
    ValidParenthesesSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new ValidParenthesesSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{"()", true},
                new Object[]{"()[]{}", true},
                new Object[]{"(]", false},
                new Object[]{"([)]", false},
                new Object[]{"{[]}", true},
                new Object[]{"([}}])", false},
        };
    }

    @Test(dataProvider = "test1")
    public void testIsValid(String s, boolean expected) {
        assertEquals(solution.isValid(s), expected);
    }
}
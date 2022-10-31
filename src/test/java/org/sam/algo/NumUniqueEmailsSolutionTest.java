package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumUniqueEmailsSolutionTest {

    NumUniqueEmailsSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new NumUniqueEmailsSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}, 2},
                new Object[]{new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"}, 3},
        };
    }

    @Test(dataProvider = "test1")
    public void testNumUniqueEmails(String[] emails, int expected) {
        assertEquals(solution.numUniqueEmails(emails), expected);
    }
}
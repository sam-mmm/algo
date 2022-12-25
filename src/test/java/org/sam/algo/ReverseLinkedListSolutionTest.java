package org.sam.algo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ReverseLinkedListSolutionTest {

    ReverseLinkedListSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new ReverseLinkedListSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new Integer[]{1, 2, 3, 4, 5}, new Integer[]{5, 4, 3, 2, 1}},
                new Object[]{new Integer[]{1, 2}, new Integer[]{2, 1}},
                new Object[]{new Integer[]{}, new Integer[]{}},

        };
    }

    @Test(dataProvider = "test1")
    public void testReverseList(Integer[] head, Integer[] expected) {
        assertEquals(ListNode.array(solution.reverseList(ListNode.node(head))), expected);
    }

}
package org.sam.algo.seventyfive;

import org.sam.algo.ListNode;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LinkedListCycleSolutionTest {

    LinkedListCycleSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new LinkedListCycleSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new Integer[]{3, 2, 0, -4}, true},
                new Object[]{new Integer[]{1, 2}, true},
                new Object[]{new Integer[]{}, new Integer[]{0}, new Integer[]{0}},
        };
    }

    @Test(dataProvider = "test1")
    public void testHasCycle(Integer[] head, boolean expected) {
        assertEquals(solution.hasCycle(ListNode.node(head)), expected);
    }
}
package org.sam.algo.seventyfive;

import org.sam.algo.ListNode;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MergeTwoSortedListsSolutionTest {


    MergeTwoSortedListsSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new MergeTwoSortedListsSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new Integer[]{1, 2, 4}, new Integer[]{1, 3, 4}, new Integer[]{1, 1, 2, 3, 4, 4}},
                new Object[]{new Integer[]{}, new Integer[]{}, new Integer[]{}},
                new Object[]{new Integer[]{}, new Integer[]{0}, new Integer[]{0}},
        };
    }

    @Test(dataProvider = "test1")
    public void testMergeTwoLists(Integer[] list1, Integer[] list2, Integer[] expected) {
        Assert.assertEquals(ListNode.array(solution.mergeTwoLists(ListNode.node(list1), ListNode.node(list2))), expected);
    }
}
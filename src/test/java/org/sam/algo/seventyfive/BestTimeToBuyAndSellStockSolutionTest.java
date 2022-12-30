package org.sam.algo.seventyfive;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BestTimeToBuyAndSellStockSolutionTest {

    BestTimeToBuyAndSellStockSolution solution;

    @BeforeClass
    public void setUp() {
        solution = new BestTimeToBuyAndSellStockSolution();
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{7, 1, 5, 3, 6, 4}, 5},
                new Object[]{new int[]{7, 6, 4, 3, 1}, 0},
        };
    }

    @Test(dataProvider = "test1")
    public void testMaxProfit(int[] prices, int expected) {
        assertEquals(solution.maxProfit(prices), expected);
    }
}
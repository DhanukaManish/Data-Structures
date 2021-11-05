package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_121Test {
    @Test
    void maxProfit() {
        Problem_121 problem = new Problem_121();
        assertEquals(5, problem.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(0, problem.maxProfit(new int[]{7,6,4,3,1}));
    }
}
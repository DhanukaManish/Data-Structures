package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem_53Test {
    @Test
    void maxSubArray() {
        Problem_53 problem = new Problem_53();
        assertEquals(6, problem.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, problem.maxSubArray(new int[]{1}));
        assertEquals(23, problem.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
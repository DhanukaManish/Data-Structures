package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_1Test {
    @Test
    void twoSum() {
        Problem_1 problem = new Problem_1();
        assertArrayEquals(new int[]{0,1}, problem.twoSum(new int[]{2,7,11,15}, 9));
        assertArrayEquals(new int[]{1,2}, problem.twoSum(new int[]{3,2,4}, 6));
        assertArrayEquals(new int[]{0,1}, problem.twoSum(new int[]{3,3}, 6));
    }
}
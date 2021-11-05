package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_350Test {
    @Test
    void intersect() {
        Problem_350 problem = new Problem_350();
        assertArrayEquals(new int[]{2,2}, problem.intersect(new int[] {1,2,2,1}, new int[]{2,2}));
        assertArrayEquals(new int[]{4,9}, problem.intersect(new int[] {4,9,5}, new int[]{9,4,9,8,4}));
    }
}
package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_566Test {
    @Test
    void matrixReshape() {
        Problem_566 problem = new Problem_566();
        assertArrayEquals(new int[][]{{1,2,3,4}}, problem.matrixReshape(new int[][]{{1,2},{3,4}}, 1, 4));
        assertArrayEquals(new int[][]{{1,2},{3,4}}, problem.matrixReshape(new int[][]{{1,2},{3,4}}, 2, 4));
        assertArrayEquals(new int[][]{{1},{2},{3},{4}}, problem.matrixReshape(new int[][]{{1,2},{3,4}}, 4, 1));
    }
}
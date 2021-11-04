package solutions;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class Problem_88Test {
    @Test
    void merge() {
        Problem_88 problem = Mockito.mock(Problem_88.class);
        problem.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        verify(problem).merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        Problem_88 p = new Problem_88();
        p.merge(new int[]{0}, 0, new int[]{1}, 1);
    }
}
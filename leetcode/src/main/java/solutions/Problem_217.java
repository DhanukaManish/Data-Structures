package solutions;

import java.util.HashSet;
import java.util.Set;

public class Problem_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int i : nums) {
            if(!unique.add(i)) { // add method will return false if element already exists
                return true;
            }
        }
        return false;
    }
}

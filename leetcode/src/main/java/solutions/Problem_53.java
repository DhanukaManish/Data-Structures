package solutions;

public class Problem_53 {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int lastMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            lastMax = Math.max(lastMax+nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, lastMax);
        }
        return maxSoFar;
    }
}

package solutions;

import java.util.*;

public class Problem_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, m = nums1.length, n = nums2.length;
        List<Integer> list = new ArrayList<>();
        while (i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                i++;
            } else if(nums1[i] > nums2[j]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ans = new int[list.size()];
        int k = 0;
        for (int num : list) {
            ans[k++] = num;
        }
        return ans;
    }
}
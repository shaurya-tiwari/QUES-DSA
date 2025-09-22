import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                return true;
            }
        }
        return false;
    }
}

public class containsDuplicates {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 0, 1, 3, 4, 0, 6 };
        System.out.println(solution.containsDuplicate(nums)); // Expected output: true
    }
}
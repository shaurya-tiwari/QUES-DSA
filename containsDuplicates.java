import java.util.ArrayList;

class Solution {
    public boolean containsDuplicate(int[] nums) {
    ArrayList<Integer> set = new ArrayList<>();
    for(int i=0; i<nums.length; i++){
        set.add(i);
        if (set.contains(nums[i])) {
            return true;
        }
    }
    
        

        return false;
    }
}

public class containsDuplicates {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3,1};
        System.out.println(solution.containsDuplicate(nums)); // Expected output: true
    }
}
// FROM KADANE algorithm .

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        // int result = nums[0];
        int currentsume = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i : nums) {
            currentsume += i;
            maxsum = Math.max(currentsume, maxsum);
            if (currentsume < 0) {
                currentsume = 0; // THE VALUE WIL BE REST TO ZRRO
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray.maxSubArray(nums));
    }

}



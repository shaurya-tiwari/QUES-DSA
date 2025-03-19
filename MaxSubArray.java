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

// public class MaxSubArray {
// public int maxSubArray(int[] nums) {
// int result = nums[0];
// for (int i = 0; i < nums.length; i++) {
// int sum = 0;

// // Inner loop for ending point of subarray
// for (int j = i; j < nums.length; j++) {
// sum = sum + nums[j];

// // update result if sum is greater the result
// result = Math.max(result, sum);
// }

// }

// return result;
// }

// public static void main(String[] args) {
// MaxSubArray maxSubArray = new MaxSubArray();
// int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
// System.out.println(maxSubArray.maxSubArray(nums));

// }
// }

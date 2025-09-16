public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = nums[mid];
            if (value < target)
                left = mid + 1;
            else if (value > target)
                right = mid - 1;
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchinRotatedSortedArray obj = new SearchinRotatedSortedArray();
        int[] nums =  {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(obj.search(nums, target));
    }
}

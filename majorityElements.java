import java.util.HashMap;

public class majorityElements {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        for (int item : nums) {
            hm.put(item, hm.getOrDefault(item, 0) + 1); // + for increase count
            if (hm.get(item) > n / 2) { // give the item which is greater then n/2
                return item;
            }
        }
        return -1;
    }
}
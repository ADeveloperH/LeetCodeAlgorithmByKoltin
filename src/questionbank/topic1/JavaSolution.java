package questionbank.topic1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JavaSolution {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 22;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    /**
     * 解决思路：利用 Map 的 key 自带的 hash 属性，来进行一次遍历查找
     *
     * HashMap 的 key 通过 hashcode 散列，查找时间复杂度近似等于 O（1）
     * Array 是根据 index 进行遍历，查找时间复杂度为 O(n)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (tempMap.containsKey(target - nums[i])) {
                result[0] = tempMap.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            tempMap.put(nums[i], i);
        }
        throw new RuntimeException("no result");
    }
}

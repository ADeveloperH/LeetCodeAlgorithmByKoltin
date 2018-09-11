package primaryalgorithm.topic4;

import java.util.Arrays;
import java.util.HashSet;

public class JavaSolution {
    public static void main(String[] args) {
        int[] nums = {6, 4, 6, 3};
//        int[] nums = {1, 2, 3, 4};
//        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(containsDuplicate(nums));
    }

    /**
     * 利用 HashSet 查找时间复杂度近似等于 O（1）特性
     *
     * @param nums
     * @return
     */
    public static boolean containsDuplicate1(int[] nums) {
        if (nums.length <= 0) {
            return false;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                return true;
            }
            hashSet.add(nums[i]);
        }

        return false;
    }


    /**
     * 利用排序后数组的特性
     * 提交后显示效率较高
     *
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length <= 0) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

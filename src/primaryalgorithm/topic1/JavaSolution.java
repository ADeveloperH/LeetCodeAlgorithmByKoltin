package primaryalgorithm.topic1;

import java.util.Arrays;

public class JavaSolution {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength = removeDuplicates(nums);
        System.out.println(newLength);

        System.out.println(Arrays.toString(nums));
    }

    /**
     * 关键字：
     * 1、给定的是排序数组
     * 2、结果是让每个元素只出现一次
     * <p>
     * 思路：移除重复项 等价于 找出所有的不同项排列到最前边，不用管后边重复的数据
     * <p>
     * 要学会利用给定数据的特性，盯准最终的结果，找到最优的方案
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                nums[++index] = nums[i];
            }
        }
        return index + 1;
    }


    /**
     * 首次提交 耗时 80 ms
     *
     * @param nums
     * @return
     */
    public int removeDuplicates2(int[] nums) {
        int newLength = nums.length;
        int repeatCount = 0;
        int i = 0;
        while (i < newLength) {
            repeatCount = 0;
            for (int j = i + 1; j < newLength; j++) {
                if (nums[j] == nums[i]) {
                    repeatCount++;
                } else if (nums[j] > nums[i]) {
                    break;
                }
            }
            if (repeatCount > 0) {
                for (int j = i + 1 + repeatCount; j < newLength; j++) {
                    nums[j - repeatCount] = nums[j];
                }
                newLength -= repeatCount;
            }
            i++;
        }
        return newLength;
    }

}

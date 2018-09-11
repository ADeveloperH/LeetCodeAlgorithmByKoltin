package primaryalgorithm.topic5;

import java.util.Arrays;

public class JavaSolution {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
//        int[] nums = {2, 2, 1};
        System.out.println(singleNumber2(nums));
    }
//
//    public static int singleNumber(int[] nums) {
////        3 ^ 2
//    }

    /**
     * 利用有序数组的特性
     *
     * @param nums
     * @return
     */
    public static int singleNumber1(int[] nums) {
        if (nums.length <= 0) {
            throw new RuntimeException("empty array");
        }
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int startIndex = 0;
        int endIndex = startIndex + 1;
        while (endIndex < nums.length) {
            if (nums[endIndex] != nums[startIndex]) {
                if (endIndex - startIndex == 1) {
                    return nums[startIndex];
                } else {
                    startIndex = endIndex;
                }
            }
            endIndex++;
        }
        return nums[nums.length - 1];
    }


    /**
     * 利用有序数组的特性,且题目已知条件“除了某个元素只出现一次以外，其余每个元素均出现两次”
     * 可以已 step 为 2 遍历
     *
     * @param nums
     * @return
     */
    public static int singleNumber2(int[] nums) {
        if (nums.length == 0) {
            throw new RuntimeException("empty array");
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1) {
                return nums[nums.length - 1];
            }
            if (nums[i] != nums[i+1]) {
                return nums[i];
            }
        }
        throw new RuntimeException("no result");
    }
}


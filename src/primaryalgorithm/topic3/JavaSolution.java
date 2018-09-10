package primaryalgorithm.topic3;

import java.util.Arrays;

public class JavaSolution {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
//        int nums[] = {-1, -100, 3, 99};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
        System.out.println(5 / 2);
    }

    /**
     * 该方案提交超时
     *
     * @param nums
     * @param k
     */
    public static void rotate2(int[] nums, int k) {
        if (nums.length <= 1) {
            return;
        }
        for (int i = 0; i < k; i++) {
            //每次移动1步
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }


    /**
     * 三部实现：
     * 方案一：
     * 1： reverse原来的数组
     * 2： reverse 0 —— k-1
     * 3： reverse k —— length-1。
     *
     *  方案二：
     * 1： reverse 0 —— length-1-k
     * 2： reverse length-k —— length-1
     * 3： reverse 0 —— length-1。
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        if (nums.length <= 1 || k <= 0) {
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    /**
     * 反转数组:自己写的
     *
     * @param nums
     * @param startIndex
     * @param endIndex
     */
    public static void reverse2(int[] nums, int startIndex, int endIndex) {
        int length = endIndex - startIndex + 1;
        int midIndex = startIndex + length / 2;
        for (int i = startIndex; i < midIndex; i++) {
            int temp = nums[i];
            nums[i] = nums[startIndex + endIndex - i];
            nums[startIndex + endIndex - i] = temp;
        }
    }


    /**
     * 反转数组：优解。相当于两个指针
     *
     * @param nums
     * @param startIndex
     * @param endIndex
     */
    public static void reverse(int[] nums, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}

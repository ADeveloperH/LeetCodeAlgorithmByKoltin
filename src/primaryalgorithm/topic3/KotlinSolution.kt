package primaryalgorithm.topic3

import java.util.*

fun main(args: Array<String>) {
    val nums = intArrayOf(-1, -100, 3, 99)
    rotate(nums,2)
    println(Arrays.toString(nums))
}

fun rotate(nums: IntArray, k: Int): Unit {
    if (nums.size <= 1 || k <= 0) {
        return
    }
    var k = k % nums.size
    reverse(nums, 0, nums.size - 1)
    reverse(nums, 0, k - 1)
    reverse(nums, k, nums.size - 1)
}

/**
 * 反转数组
 */
fun reverse(nums: IntArray, startIndex: Int,  endIndex: Int) {
    var start = startIndex
    var end = endIndex
    while (start < end) {
        val temp = nums[start]
        nums[start] = nums[end]
        nums[end] = temp
        start++
        end--
    }
}
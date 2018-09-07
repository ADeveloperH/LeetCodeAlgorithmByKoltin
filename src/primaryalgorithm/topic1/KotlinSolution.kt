package primaryalgorithm.topic1

import java.util.*

fun main(args: Array<String>) {
    val nums: IntArray = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    println(removeDuplicates(nums))
    println(Arrays.toString(nums))
}

fun removeDuplicates(nums: IntArray): Int {
    var index = 0
    for (i in 1 until nums.size) {
        if (nums[i] != nums[index]) {
            nums[++index] = nums[i]
        }
    }
    return index + 1
}
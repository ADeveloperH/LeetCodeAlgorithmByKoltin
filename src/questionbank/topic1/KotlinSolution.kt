package questionbank.topic1

import java.util.*

fun main(args: Array<String>) {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 26
    println(Arrays.toString(twoSum(nums, target)))

}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val hashMapOf = hashMapOf<Int, Int>()
    for (i in 0 until nums.size) {
        if (hashMapOf.containsKey(target - nums[i])) {
            return intArrayOf(hashMapOf.get(target - nums[i])!!, i)
        }
        hashMapOf.put(nums[i], i)
    }
    throw RuntimeException("no result")
}
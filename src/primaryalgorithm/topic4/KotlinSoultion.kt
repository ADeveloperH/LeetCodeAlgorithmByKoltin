package primaryalgorithm.topic4

fun main(args: Array<String>) {
//    val nums = intArrayOf(6, 4, 6, 3)
//    val nums = intArrayOf(1, 2, 3, 4)
    val nums = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
    println(containsDuplicate2(nums))

}

/**
 * 利用排序后的数组特性
 */
fun containsDuplicate(nums: IntArray): Boolean {
    if (nums.size <= 0) return false
    nums.sort()
    for (index in 0 until nums.size - 1) {
        if (nums[index + 1] == nums[index]) {
            return true
        }
    }
    return false
}

/**
 * 利用 Kotlin 自带函数来处理，提交后效率不如上边的方案
 * 相当于先将所有元素放到 set 中，在判断 set 大小 和 list 大小
 */
fun containsDuplicate2(nums: IntArray): Boolean {
    return nums.toList().distinct().size != nums.size

}
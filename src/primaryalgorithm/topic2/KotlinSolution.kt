package primaryalgorithm.topic2

fun main(args: Array<String>) {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)//7
//    val prices = intArrayOf(1, 2, 3, 4, 5)//4
//    val prices = intArrayOf(7, 6, 4, 3, 1)//0
    println(maxProfit(prices))
}

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    for (index in 1 until prices.size) {
        val profit = prices[index] - prices[index - 1]
        if (profit > 0) {
            maxProfit += profit
        }
    }
    return maxProfit
}
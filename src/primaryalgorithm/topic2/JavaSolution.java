package primaryalgorithm.topic2;


public class JavaSolution {
    public static void main(String[] args) {
//        int prices[] = {7, 1, 5, 3, 6, 4};//7
//        int prices[] = {1, 2, 3, 4, 5};//4
//        int prices[] = {7, 6, 4, 3, 1};//0
        int prices[] = {6, 1, 3, 2, 4, 7};//7
        System.out.println(maxProfit(prices));
    }

    /**
     * 将所有问题想象成一幅折线图，把所有递增的部分相加就是最大的利润
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[i - 1];
            if (profit > 0) {
                maxProfit += profit;
            }
        }
        return maxProfit;
    }
}

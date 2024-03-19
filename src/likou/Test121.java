package likou;

public class Test121 {
    //买卖股票问题
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }


    public static int maxProfit(int[] prices) {
        //动态规划的思想，一边一层遍历，一边求解判断最大利润
        //保证是最低价买入
        int mini = prices[0];
        int profit = 0;
        for (int temp:
             prices) {
            mini = Math.min(temp,mini);
            profit = Math.max(profit,(temp - mini));
        }
        return profit;
    }
}

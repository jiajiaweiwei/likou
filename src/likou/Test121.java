package likou;

public class Test121 {
    //������Ʊ����
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }


    public static int maxProfit(int[] prices) {
        //��̬�滮��˼�룬һ��һ�������һ������ж��������
        //��֤����ͼ�����
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

package likou;

public class TestDP {

    //测试动态规划
    public static void main(String[] args) {
        System.out.println(testD(7));
        System.out.println(test2(7));
        System.out.println(test3(7));
    }
    //DP数组以及其下标的含义

    //递推公式

    //数组如何初始化

    //遍历顺序

    //打印数组
    public static int testD(int n){
        //斐波那契数列 动态规划基础
        if (n<2){
            return n;
        }
        //数列n值 ：1，2，3，4，5，6，7，8 n表示斐波那契数列元素个数
        //数列值  ：0，1，1，2，3，5，8，13
        int p = 0,q = 0,r = 1;
        //p表示dp[i-1] q表示dp[i-2] r表示dp[i-2]
        for (int i = 2;i<=n;i++){
            p = q;//0
            q = r;//1
            r = p+q;
        }
        return r;
    }
    //dp数组
    public static int test2(int n){
        if (n<2){
            return n;
        }
        int[] dp = new int[30];
        dp[0] = 0;
        dp[1] = 1;
        for (int i =2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static int test3(int n){
        int i = 0;
        int j = 1;
        int k = 1;
        while (n>1){
            k = i+j;
            i=j;
            j=k;
            n--;
        }
        return k;
    }


}
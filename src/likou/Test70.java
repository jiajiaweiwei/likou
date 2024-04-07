package likou;

public class Test70 {


    //动态规划的爬楼梯问题
    public static void main(String[] args) {



    }

    //正难则反
    //因为一步只能跨两层或者一层， 所以到达某层（n层）只有两种可能
    //1.从他的下级来n-1层
    //2.从他的下下级来n-2层
    //所以到达n层 的可能方式次数就等于 n-1 和 n-2这两层之和
    //所以有了动态规划的   状态转移方程t(n) = t(n-1) + t(n-2)
    //又因为 t(1) =1
    //又因为 t(2) =0 + t(1)
    //所以得出动态规划数组int a = 0,b=1;
    //循环累加n次得出结果
    public int climbStairs(int n) {
        //动态规划数组
        int a = 0,b=1;
        //返回结果
        int r = 0;
        //状态转移方程t(n) = t(n-1) + t(n-2)
        for (int i = 0; i < n; i++) {
            //使用状态转移方程
            r = a + b;
            a = r;
        }
        return r;
    }


}

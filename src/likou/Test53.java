package likou;

public class Test53 {
    //最大数组和
    public static void main(String[] args) {

        int[] nums = new int[]{5,4,-1,7,8};
        System.out.println(maxSubArray3(nums));


    }

    //方法1，贪心（动态规划）
    public static int maxSubArray(int[] nums) {
        //特殊情况处理
        if (nums.length == 1){
            return nums[0];
        }
        //常规情况
        //贪心算法：在每一步中都寻找最优解，从而导致全局最优的情况
        //当前值
        //和
        int sum = 0;
        //最大值
        int max = nums[0];
        //找具备最优解
        for (int temp:
             nums) {
            sum = Math.max(temp, sum + temp);
            max = Math.max(max,sum);
        }
        return max;
    }



    //方法3线段树(分而治之：线段树，常用于范围查询)
    //int[] nums = new int[]{5,4,-1,7,8};
    public static int maxSubArray2(int[] nums) {



        return 0;
    }

    //方法4 最小前缀和（也属于动态规划）
    public static int maxSubArray3(int[] nums) {
        int preMini = 0;
        int nowSum = 0;
        int max = nums[0];
        for (int temp:
             nums) {
            nowSum = temp + nowSum;//前缀和
            max = Math.max((nowSum - preMini),max);
            preMini = Math.min(preMini,nowSum);//维护最小前缀和

        }
        return max;
    }



















    /*public static int maxSubArray(int[] nums) {
        //特殊情况处理
        if (nums.length == 1){
            return nums[0];
        }
        //常规情况
        //贪心算法：在每一步中都寻找最优解，从而导致全局最优的情况
        int l = nums.length;
        int sumMax = nums[0];
        for (int temp:
             nums) {
            sumMax = Math.max(temp,sumMax);
        }
        int tempI = 0;
        for(int i = 0;i<l;i++){
            tempI = nums[i];
            for (int j = i+1;j<l;j++){
                tempI = tempI + nums[j];
                sumMax = Math.max(tempI,sumMax);
            }
        }
        return sumMax;
    }*/




}

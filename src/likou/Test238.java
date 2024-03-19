package likou;

import java.util.Arrays;

public class Test238 {




    //238. 除自身以外数组的乘积
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] ints = productExceptSelf1(nums);
        System.out.println(Arrays.toString(ints));


    }
    //重点：双指针前缀和方法
    public static int[] productExceptSelf(int[] nums) {
        //前缀之积数组
        int[] L = new int[nums.length];
        L[0] = 1;
        //后缀之积数组
        int[] R = new int[nums.length];
        R[nums.length-1] = 1;
        //求前缀数组
        for (int i = 1;i<nums.length;i++){
            L[i] = nums[i-1]*L[i-1];
        }
        //求后缀数组
        for (int i = nums.length-2;i>=0;i--){
            R[i] = nums[i+1]*R[i+1];
        }
        //根据前缀后缀数组求要的数组
        int[] ints = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            ints[i] = L[i]*R[i];
        }

        return ints;
    }


    //重点：双指针前缀和方法优化
    //没看懂。。。。。。。下次再看
    public static int[] productExceptSelf1(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        Arrays.fill(ans,1);
        int beforeSum=1;
        int afterSum=1;
        for(int i=0,j=n-1;i<n;i++,j--){
            ans[i]*=beforeSum;
            ans[j]*=afterSum;
            beforeSum*=nums[i];
            afterSum*=nums[j];
        }
        return ans;
    }



}

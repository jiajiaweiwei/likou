package likou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test15 {
    //力扣第15题：三数之和(不采用哈希表的方法) 采用双指针
    public static void main(String[] args) {
        int[] ints = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(ints);
        for (List<Integer> listNum:
             lists) {
            System.out.println(listNum);
        }

    }
    //双指针法
    public static List<List<Integer>> threeSum(int[] nums) {
        //异常处理1
        if (nums == null||nums.length<3) return new ArrayList<>();
        ArrayList<List<Integer>> list = new ArrayList<>();
        //初始指针和右指针
        //排序
        Arrays.sort(nums);
        //第一层遍历
        for(int i = 0;i<nums.length;i++ ){
            //异常处理
            if (nums[i]>0) break;
            int l = i+1;
            int j = nums.length-1;
            if(i>0 && nums[i] == nums[i-1]) continue;
            while (l<j){
                 int sum = nums[i]+nums[l]+nums[j];
                 if (sum == 0){
                     list.add(Arrays.asList(nums[i],nums[l],nums[j]));
                     //除去冗余
                     while ( nums[l] == nums[l+1]) l++;
                     while ( nums[j] == nums[j-1]) j--;
                     l++;
                     j--;
                 }else if (sum>0){
                     j--;
                 }else {
                     i++;
                 }
            }



        }
        return list;
    }
}

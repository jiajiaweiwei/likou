package likou;

import java.util.HashSet;

public class Test128 {

    //力扣第128题 最长子序列问题
    public static void main(String[] args) {
        int[] nums ={0,3,7,2,5,8,4,6,0,1};
        System.out.println("最长子序列为"+longestConsecutive(nums)+"个元素");

    }
    /*
    * 给定一个未排序的整数数组 nums ，
    * 找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
    * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
    * */

    public static int longestConsecutive(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num:
             nums) {
            hashSet.add(num);
        }
        int est = 0;
        for (int num:
             hashSet) {
            if (!hashSet.contains(num-1)){
                int temp = num;
                while(hashSet.contains(temp+1)){
                    temp++;
                }
                est = Math.max(est,temp-num+1);
            }
        }
        return est;

    }
}

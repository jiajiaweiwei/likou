package likou;

import java.util.Arrays;

public class Test41 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,2,2,1,1};
        System.out.println(firstMissingPositive(nums));
    }
    //暴力法，才击败百分13
    /*
    * 这个方法的时间复杂度为 O(nlogn)，主要由排序操作引起的。
    * 空间复杂度为 O(1)，只使用了常量级的额外空间。
排序的时间复杂度为 O(nlogn)，遍历数组的时间复杂度为 O(n)，
* 因此总的时间复杂度为 O(nlogn+n) = O(nlogn)。在空间复杂度上，
* 并没有使用额外的数组或集合，只使用了常量级的临时变量，因此空间复杂度为 O(1)。
    * */
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int temp = 1;
        if (nums.length<=1){
            temp = 0;
        }
        for (int j = 0;j<nums.length;j++){
            if (nums[j] > 0){
                temp = j;
                break;
            }
        }
        if (nums[temp]!=1){
            return 1;
        }
        while (temp<nums.length-1 && (nums[temp+1] == (nums[temp]+1) ||nums[temp+1] == nums[temp] ) ){
            temp++;
        }
        return nums[temp]+1;
    }
}

package likou;

import java.util.Arrays;

public class Test283 {
    public static void main(String[] args) {
        int[] nums = {1,2};
        test1(nums);
        System.out.println(Arrays.toString(nums));
    }
    //283移动0（双指针）
    public static void test(int[] nums){
        if (nums.length == 0){
            return;//提前返回结束方法
        }
        int i = 0;
        int j = 0;
        while (i<nums.length){
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        while (j<nums.length){
            nums[j] = 0;
            j++;
        }
    }
    //283移动0（双指针：优化）
    public static void test1(int[] nums){
        if (nums.length == 0){
            return;
        }
        int i =0,j = 0;
        while (i<nums.length){
            if (nums[i]!=0 ){
                if (i != j) {//这里为了避免第一次冗余的交换，采用了判断语句
                    //但是由于多了判断，会导致以后多有的循环都会先判断一次，反倒减低了运行速度
                    //1.当数组前面全都不是0时，可以加快速度
                    //但是，本题情况是有较多0的，故该条件判断语句是没必要的
                    // 会导致多if了nums.length次，只少交换了第一次
                    //总的来说运行速度降低了
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
            i++;

        }





    }

}

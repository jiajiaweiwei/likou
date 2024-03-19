package likou;

import java.util.Enumeration;

public class Test189 {


    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        rotate3(nums,0);
        for (int i :
             nums) {
            System.out.println("i = " + i);
        }
    }
    //189 数组的轮转数组问题
    //方法一：使用额外的数组
    //时间复杂度 n
    //空间复杂度 n
    public static void rotate(int[] nums, int k) {
        //特殊情况处理
        if (nums.length<=1){
            return;
        }
        int l = nums.length;
        if (k>=nums.length){
            k = k % nums.length;
        }
        int temp = k;
        //新建一个数组。根据要求的k值，选定位置轮转赋值
        int[] ints = new int[l];
        for (int i = 0;i<k;i++){
            ints[i] = nums[l-temp];
            temp--;
        }
        int temp2 = k;
        for (int i = 0;i<l-k;i++){// i = 0 1 2 3
            ints[temp2] = nums[i];    // k = 3 4 5 6
            temp2++;
        }
        System.arraycopy(ints, 0, nums, 0, ints.length);
    }
    //方法二：环状替换
    //时间复杂度 n
    //空间复杂度 1
    public static void rotate2(int[] nums, int k) {

    }
    //方法3 数组翻转**重点
    //时间复杂度 n
    //空间复杂度 1
    public static void rotate3(int[] nums, int k) {
        //特殊处理
        if (nums.length<=1){
            return;
        }
        //取余
        k = k % nums.length;
        //第一次全程反转 多次复用
        //定义反转函数
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }
    //第一次全程反转
    //定义反转函数 多次复用 start和end均表示数组下标
    public static void reverse(int[] nums, int start, int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }

    //方法4 双端队列


}

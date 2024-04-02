package likou;

public class Test35 {

    //力扣第35题 搜索插入位置

    /*
    * 给定一个排序数组和一个目标值，在数组中找到目标值
    * 并返回其索引。如果目标值不存在于数组中，返回它
    * 将会被按顺序插入的位置。请必须使用时间复杂度为 O(log n) 的算法。
    *
    * */

    public static void main(String[] args) {


    }



    //方法1 利用数组原本有序（可使用二分查找）的特点    降低时间复杂度
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }


    //二分查找
    public static int test(int[] nums, int target){
        int length = nums.length;
        int left = 0;//左指针
        int right = length-1;//右指针
        int temp = length;
        //二分查找退出条件，指针相遇时
        while (left<right){
            int  mid = (left+right)/2;
            if (nums[mid]>=target){
                temp = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return temp;


    }





}

package likou;




public class Test1 {
    //力扣第一题，两数之和
    //左右双指针优化算法
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        int[] ints = twoSum(nums, -8);
        for (int temp:
             ints) {
            System.out.println("temp = " + temp);
        }

    }
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        int sum = 0;
        while (true){
            sum = nums[i] + nums[j];
            if (sum == target){
                return new int[] {i,j};
            }
            if (sum<target){
                j--;
            }else {
                i++;
            }
        }
    }



}

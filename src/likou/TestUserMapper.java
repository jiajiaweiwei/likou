package likou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestUserMapper {

    public static int[] test3(int[] nums,int target){
        //测试三数字之和
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            //双指针移动
            int temp1 = target-nums[i];
            for (int j = 0;j< nums.length;j++){
                int temp2 = temp1-nums[j];
                if (j==i){
                    j++;
                }
                if (map.containsKey(temp2)){
                    return new int[] {map.get(nums[i]),map.get(nums[j]), map.get(temp2)};
                }
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("NO");

    }


    public static int[] test4(int[] nums, int target) {
        // 测试三数字之和
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[i] - nums[j];
                if (map.containsKey(complement) && map.get(complement) != i && map.get(complement) != j) {
                    return new int[]{i, j, map.get(complement)};
                }
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No three sum solution");
    }

    public static ArrayList<int[]> test5(int[] nums, int target) {
        // 测试三数字之和
        HashMap<Integer, Integer> map = new HashMap<>();
        //定列数不定行数的额二维数组
        //int[][] intsResult = new int[10][3];
        ArrayList<int[]> intsResult = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[i] - nums[j];
                if (map.containsKey(complement) && map.get(complement) != i && map.get(complement) != j) {
                    int[] ints = new int[3];
                    ints[0] = i;
                    ints[1] = j;
                    ints[2] = map.get(complement);
                    intsResult.add(ints);
                }
            }
            map.put(nums[i], i);
        }
        return intsResult;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 10, 7, 6, 8, 9, 5, 4};
        //  数组位置   0, 1, 2,  3, 4, 5, 6, 7, 8, 9
        int target = 13;
        ArrayList<int[]> intResult = test5(nums, target);
        for (int[] array : intResult) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println(); // 换行
        }
    }


    //测试回溯法
    private static void backtracking(int[] nums, int target, int start, List<Integer> current, List<List<Integer>> result) {
        //回溯终止条件 当target减到0时，表示找到了一个符合的解
        if (target == 0) {
            result.add(new ArrayList<>(current));//添加符合条件的元素下标数组
            return;//回溯退出条件
        }
        for (int i = start; i < nums.length; i++) {

            if (nums[i] <= target) {//只有当该元素的值小于目标值时才有可能找到对应组合，元素值大于target则直接跳过
                //处理节点
                current.add(i);//添加元素
                //递归
                backtracking(nums, target - nums[i], i + 1, current, result); // 注意这里是 i + 1
                //回溯：撤销处理节点的情况
                //即：找到一个解后，在回溯算法中 需要将最后一个元素去除，以便判断这最后一个元素是否还有后序的元素代替
                current.remove(current.size() - 1);//移除最后一个元素
            }
        }
    }

    public void test6(){
        int[] nums = {1, 3, 2, 10, 7, 6, 8, 9, 5, 4};
        //  数组位置   0, 1, 2,  3, 4, 5, 6, 7, 8, 9
        int target = 13;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtracking(nums, target, 0, current, result);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }



    public void test7(){
        int[] nums = {-1,0,1,2,-1,4};
        //  数组位置   0, 1, 2,  3, 4, 5, 6, 7, 8, 9
        //int target = 0;
        //排序去重
        Arrays.sort(nums);
        // 去重
        int[] distinctNums = new int[nums.length];
        int index = 0;
        distinctNums[index++] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                distinctNums[index++] = nums[i];
            }
        }
        for (int i:
             nums) {
            System.out.println(i);
        }
        HashMap<Integer,Integer> map = new HashMap();
        List<List<Integer>> listOfLists = new ArrayList<>();
        for(int i=0;i<nums.length;i++){

            for(int j= i+1;j<nums.length;j++){
                int temp = 0-nums[i]-nums[j];
                if(map.containsKey(temp)&& map.get(temp) != i && map.get(temp) != j ){
                    if (nums[j]!=nums[j-1]){
                        listOfLists.add(Arrays.asList(nums[i],nums[j], temp));
                    }
                }
            }
            if(!map.containsKey(nums[i])){
                System.out.println("nums[i] " + nums[i]+"   i="+i);
                map.put(nums[i],i);
            }
        }
        System.out.println("listOfLists = " + listOfLists);
    }


    public void test8(){
        int num = 0100;
        System.out.println(num);
    }




}

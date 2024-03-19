package likou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestUserMapper {

    public static int[] test3(int[] nums,int target){
        //����������֮��
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            //˫ָ���ƶ�
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
        // ����������֮��
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
        // ����������֮��
        HashMap<Integer, Integer> map = new HashMap<>();
        //���������������Ķ��ά����
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
        //  ����λ��   0, 1, 2,  3, 4, 5, 6, 7, 8, 9
        int target = 13;
        ArrayList<int[]> intResult = test5(nums, target);
        for (int[] array : intResult) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println(); // ����
        }
    }


    //���Ի��ݷ�
    private static void backtracking(int[] nums, int target, int start, List<Integer> current, List<List<Integer>> result) {
        //������ֹ���� ��target����0ʱ����ʾ�ҵ���һ�����ϵĽ�
        if (target == 0) {
            result.add(new ArrayList<>(current));//��ӷ���������Ԫ���±�����
            return;//�����˳�����
        }
        for (int i = start; i < nums.length; i++) {

            if (nums[i] <= target) {//ֻ�е���Ԫ�ص�ֵС��Ŀ��ֵʱ���п����ҵ���Ӧ��ϣ�Ԫ��ֵ����target��ֱ������
                //����ڵ�
                current.add(i);//���Ԫ��
                //�ݹ�
                backtracking(nums, target - nums[i], i + 1, current, result); // ע�������� i + 1
                //���ݣ���������ڵ�����
                //�����ҵ�һ������ڻ����㷨�� ��Ҫ�����һ��Ԫ��ȥ�����Ա��ж������һ��Ԫ���Ƿ��к����Ԫ�ش���
                current.remove(current.size() - 1);//�Ƴ����һ��Ԫ��
            }
        }
    }

    public void test6(){
        int[] nums = {1, 3, 2, 10, 7, 6, 8, 9, 5, 4};
        //  ����λ��   0, 1, 2,  3, 4, 5, 6, 7, 8, 9
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
        //  ����λ��   0, 1, 2,  3, 4, 5, 6, 7, 8, 9
        //int target = 0;
        //����ȥ��
        Arrays.sort(nums);
        // ȥ��
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

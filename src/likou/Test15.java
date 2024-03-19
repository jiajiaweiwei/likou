package likou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test15 {
    //���۵�15�⣺����֮��(�����ù�ϣ��ķ���) ����˫ָ��
    public static void main(String[] args) {
        int[] ints = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(ints);
        for (List<Integer> listNum:
             lists) {
            System.out.println(listNum);
        }

    }
    //˫ָ�뷨
    public static List<List<Integer>> threeSum(int[] nums) {
        //�쳣����1
        if (nums == null||nums.length<3) return new ArrayList<>();
        ArrayList<List<Integer>> list = new ArrayList<>();
        //��ʼָ�����ָ��
        //����
        Arrays.sort(nums);
        //��һ�����
        for(int i = 0;i<nums.length;i++ ){
            //�쳣����
            if (nums[i]>0) break;
            int l = i+1;
            int j = nums.length-1;
            if(i>0 && nums[i] == nums[i-1]) continue;
            while (l<j){
                 int sum = nums[i]+nums[l]+nums[j];
                 if (sum == 0){
                     list.add(Arrays.asList(nums[i],nums[l],nums[j]));
                     //��ȥ����
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
